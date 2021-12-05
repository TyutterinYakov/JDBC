import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DBExample {

	private static final String URL = "jdbc:postgresql://localhost:5430/users";
	private static final String LOGIN = "postgres";
	private static final String PASSWORD = "login456456";
	private static final String SELECT_SQL = "select * from users";
	private static final String INSERT_SQL = "insert into users(user_name, age, email) values"
			+ "('Yasha', 20, 'tyutterin_yahsa@mail.ru'),"
			+ "('Sasha', 19, 'sasha@mail.ru'),"
			+ "('Armen', 27, 'arm3232@mail.ru');"; 
	
	public static void main(String[] args) {
		select();
		insert();
	}
	
	private static void insert() {
		
		try(PreparedStatement stmt = connect().prepareStatement(INSERT_SQL,  new String[] {"user_id", "user_name"});) {
			stmt.executeUpdate();
			
			ResultSet getRs = stmt.getGeneratedKeys();
			
			while(getRs.next()) {
				System.out.println(getRs.getLong("user_id")+" "+getRs.getString("user_name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static void select() {
			List<User> us = new LinkedList<User>();
			try(PreparedStatement stmt = connect().prepareStatement(SELECT_SQL); ResultSet rs = stmt.executeQuery();) {
				
				while(rs.next()) {
				//System.out.println(rs.getString("user_name"));
					User user = new User(rs.getLong("user_id"), rs.getString("user_name"), rs.getInt("age"), rs.getString("email"));
					us.add(user);
				}

				
				rs.close();
				connect().close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		//	System.out.println(us);
	}
	
	
	
	public static Connection connect() throws SQLException {
		Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
		return con;
	}
}
