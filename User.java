
public class User {
	private Long userId;
	private String userName;
	private int age;
	private String email;
	
	public User(Long userId, String userName, int age, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		
		return this.userId +" "+this.userName+" "+this.age+" "+this.email;
	}
	
}
