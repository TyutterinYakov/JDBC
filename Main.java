package main;

import main.process.InsertMethod;
import main.process.SelectMethod;

public class Main {
	private static final String SELECT_USERS = "SELECT * FROM users"; 
	private static final String INSERT_USERS = "insert into users(user_name, age, email) values"
			+ "('Yasha', 20, 'tyutterin_yahsa@mail.ru'),"
			+ "('Sasha', 19, 'sasha@mail.ru'),"
			+ "('Armen', 27, 'arm3232@mail.ru');"; 
	private static final String DELETE = "delete from users";

	public static void main(String[] args) {
		InsertMethod.insertMethod(DELETE);
		InsertMethod.insertMethod(INSERT_USERS);
		SelectMethod.selectMethod(SELECT_USERS);

		
	}
}
