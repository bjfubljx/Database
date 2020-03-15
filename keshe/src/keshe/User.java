package keshe;

public class User {
	private int ID;
	private int User_ID;
	private String Login_Type;
	private String identifier;
	private String password;
	public User(int iD, int user_ID, String login_Type, String identifier,
			String password) {
		super();
		ID = iD;
		User_ID = user_ID;
		Login_Type = login_Type;
		this.identifier = identifier;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	public String getLogin_Type() {
		return Login_Type;
	}
	public void setLogin_Type(String login_Type) {
		Login_Type = login_Type;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}	
