package main.process;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;


import main.connect.ConnectDB;

public class InsertMethod {

	public static void insertMethod(String INSERT) {
		try(Connection con = ConnectDB.getCon();
				PreparedStatement stmt = con.prepareStatement(INSERT))
		{
			stmt.execute();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	}

