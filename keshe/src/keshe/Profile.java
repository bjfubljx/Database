package keshe;

public class Profile {
	private int profile_ID;
	private String profile_Name;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(int profile_ID, String profile_Name) {
		super();
		this.profile_ID = profile_ID;
		this.profile_Name = profile_Name;
	}
	public int getProfile_ID() {
		return profile_ID;
	}
	public void setProfile_ID(int profile_ID) {
		this.profile_ID = profile_ID;
	}
	public String getProfile_Name() {
		return profile_Name;
	}
	public void setProfile_Name(String profile_Name) {
		this.profile_Name = profile_Name;
	}
}
