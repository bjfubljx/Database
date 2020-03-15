package keshe;

public class moive {
	private int movie_ID;
	private String movie_Name;
	private String movie_official_website;
	private int movie_Length;
	private String moive_IMDB_Link;
	private String movie_description;
	private String douban_score;
	private int douban_human_number;
	private String other_name;
	private String update_time;
	private String movie_Area;
	private String movie_Language;
	public moive(int movie_ID, String movie_Name,
			String movie_official_website, int movie_Length,
			String moive_IMDB_Link, String movie_description,
			String douban_score, int douban_human_number, String other_name,
			String update_time, String movie_Area, String movie_Language) {
		super();
		this.movie_ID = movie_ID;
		this.movie_Name = movie_Name;
		this.movie_official_website = movie_official_website;
		this.movie_Length = movie_Length;
		this.moive_IMDB_Link = moive_IMDB_Link;
		this.movie_description = movie_description;
		this.douban_score = douban_score;
		this.douban_human_number = douban_human_number;
		this.other_name = other_name;
		this.update_time = update_time;
		this.movie_Area = movie_Area;
		this.movie_Language = movie_Language;
	}
	public moive() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMovie_ID() {
		return movie_ID;
	}
	public void setMovie_ID(int movie_ID) {
		this.movie_ID = movie_ID;
	}
	public String getMovie_Name() {
		return movie_Name;
	}
	public void setMovie_Name(String movie_Name) {
		this.movie_Name = movie_Name;
	}
	public String getMovie_official_website() {
		return movie_official_website;
	}
	public void setMovie_official_website(String movie_official_website) {
		this.movie_official_website = movie_official_website;
	}
	public int getMovie_Length() {
		return movie_Length;
	}
	public void setMovie_Length(int movie_Length) {
		this.movie_Length = movie_Length;
	}
	public String getMoive_IMDB_Link() {
		return moive_IMDB_Link;
	}
	public void setMoive_IMDB_Link(String moive_IMDB_Link) {
		this.moive_IMDB_Link = moive_IMDB_Link;
	}
	public String getMovie_description() {
		return movie_description;
	}
	public void setMovie_description(String movie_description) {
		this.movie_description = movie_description;
	}
	public String getDouban_score() {
		return douban_score;
	}
	public void setDouban_score(String douban_score) {
		this.douban_score = douban_score;
	}
	public int getDouban_human_number() {
		return douban_human_number;
	}
	public void setDouban_human_number(int douban_human_number) {
		this.douban_human_number = douban_human_number;
	}
	public String getOther_name() {
		return other_name;
	}
	public void setOther_name(String other_name) {
		this.other_name = other_name;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String getMovie_Area() {
		return movie_Area;
	}
	public void setMovie_Area(String movie_Area) {
		this.movie_Area = movie_Area;
	}
	public String getMovie_Language() {
		return movie_Language;
	}
	public void setMovie_Language(String movie_Language) {
		this.movie_Language = movie_Language;
	}
}
