package main.wedding;

public class Users {
	private int user_id;
	private String user_name;
	private int age;
	private String email;
	
	public Users() {
		super();
	}
	
	
	public Users(int user_id, String user_name, int age, String email) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.age = age;
		this.email = email;
	}


	public int getUser_id() {
		return user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		
		return this.user_id+": "+this.user_name+" "+this.age+" "+this.email;
	}


	
	
	
}
