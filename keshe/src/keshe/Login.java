package keshe;

public class Login {
	private int User_ID;
	private String User_Name;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(int user_ID, String user_Name) {
		super();
		User_ID = user_ID;
		User_Name = user_Name;
	}
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
}
