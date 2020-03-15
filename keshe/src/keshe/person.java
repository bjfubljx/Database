package keshe;

public class person {
	private int Act_ID;
	private String Act_Name;
	private String Act_Sex;
	private String Act_birthday;
	private String Act_ChineseName;
	private String Act_imbd;
	
	public person(int act_ID, String act_Name, String act_Sex,
			String act_birthday, String act_ChineseName, String act_imbd) {
		super();
		Act_ID = act_ID;
		Act_Name = act_Name;
		Act_Sex = act_Sex;
		Act_birthday = act_birthday;
		Act_ChineseName = act_ChineseName;
		Act_imbd = act_imbd;
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAct_ID() {
		return Act_ID;
	}
	public void setAct_ID(int act_ID) {
		Act_ID = act_ID;
	}
	public String getAct_Name() {
		return Act_Name;
	}
	public void setAct_Name(String act_Name) {
		Act_Name = act_Name;
	}
	public String getAct_Sex() {
		return Act_Sex;
	}
	public void setAct_Sex(String act_Sex) {
		Act_Sex = act_Sex;
	}
	public String getAct_birthday() {
		return Act_birthday;
	}
	public void setAct_birthday(String act_birthday) {
		Act_birthday = act_birthday;
	}
	public String getAct_ChineseName() {
		return Act_ChineseName;
	}
	public void setAct_ChineseName(String act_ChineseName) {
		Act_ChineseName = act_ChineseName;
	}
	public String getAct_imbd() {
		return Act_imbd;
	}
	public void setAct_imbd(String act_imbd) {
		Act_imbd = act_imbd;
	}
}
