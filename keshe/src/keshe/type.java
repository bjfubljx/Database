package keshe;

public class type {
	private int type_ID;
	private String type_Name;
	
	public type(int type_ID, String type_Name) {
		super();
		this.type_ID = type_ID;
		this.type_Name = type_Name;
	}
	public type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getType_ID() {
		return type_ID;
	}
	public void setType_ID(int type_ID) {
		this.type_ID = type_ID;
	}
	public String getType_Name() {
		return type_Name;
	}
	public void setType_Name(String type_Name) {
		this.type_Name = type_Name;
	}
}
