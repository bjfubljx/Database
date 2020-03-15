package keshe;

public class evaluation {
	private int evaluation_ID;
	private int User_ID;
	private int movie_ID;
	private String evaluation_type;
	private int star_Number;
	private String evaluation_Date;
	private String evaluation_comment;
	private int evaluation_agree;
	private int evaluation_total;
	public evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public evaluation(int evaluation_ID, int user_ID, int movie_ID,
			String evaluation_type, int star_Number, String evaluation_Date,
			String evaluation_comment, int evaluation_agree,
			int evaluation_total) {
		super();
		this.evaluation_ID = evaluation_ID;
		User_ID = user_ID;
		this.movie_ID = movie_ID;
		this.evaluation_type = evaluation_type;
		this.star_Number = star_Number;
		this.evaluation_Date = evaluation_Date;
		this.evaluation_comment = evaluation_comment;
		this.evaluation_agree = evaluation_agree;
		this.evaluation_total = evaluation_total;
	}
	public int getEvaluation_ID() {
		return evaluation_ID;
	}
	public void setEvaluation_ID(int evaluation_ID) {
		this.evaluation_ID = evaluation_ID;
	}
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	public int getMovie_ID() {
		return movie_ID;
	}
	public void setMovie_ID(int movie_ID) {
		this.movie_ID = movie_ID;
	}
	public String getEvaluation_type() {
		return evaluation_type;
	}
	public void setEvaluation_type(String evaluation_type) {
		this.evaluation_type = evaluation_type;
	}
	public int getStar_Number() {
		return star_Number;
	}
	public void setStar_Number(int star_Number) {
		this.star_Number = star_Number;
	}
	public String getEvaluation_Date() {
		return evaluation_Date;
	}
	public void setEvaluation_Date(String evaluation_Date) {
		this.evaluation_Date = evaluation_Date;
	}
	public String getEvaluation_comment() {
		return evaluation_comment;
	}
	public void setEvaluation_comment(String evaluation_comment) {
		this.evaluation_comment = evaluation_comment;
	}
	public int getEvaluation_agree() {
		return evaluation_agree;
	}
	public void setEvaluation_agree(int evaluation_agree) {
		this.evaluation_agree = evaluation_agree;
	}
	public int getEvaluation_total() {
		return evaluation_total;
	}
	public void setEvaluation_total(int evaluation_total) {
		this.evaluation_total = evaluation_total;
	}
}
