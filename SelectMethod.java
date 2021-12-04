package main.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.connect.ConnectDB;
import main.wedding.Users;

public class SelectMethod {

	
	public static void selectMethod(String SELECT) {
		List<Users> result = new ArrayList<>();
		try(Connection con = ConnectDB.getCon();
				PreparedStatement stmt = con.prepareStatement(SELECT))
		{
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Users us = new Users(rs.getInt("user_id"),
				rs.getString("user_name"),
				rs.getInt("age"),
				rs.getString("email"));
				
				result.add(us);	
				
				System.out.println(us.toString());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
