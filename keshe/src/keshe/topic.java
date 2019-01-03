package keshe;

public class topic {
	private int topic_ID;
	private int movie_ID;
	private String topic_Name;
	private int topic_evaluation_number;
	private int topic_evaluation_look;
	private int topic_attention_number;
	public topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public topic(int topic_ID, int movie_ID, String topic_Name,
			int topic_evaluation_number, int topic_evaluation_look,
			int topic_attention_number) {
		super();
		this.topic_ID = topic_ID;
		this.movie_ID = movie_ID;
		this.topic_Name = topic_Name;
		this.topic_evaluation_number = topic_evaluation_number;
		this.topic_evaluation_look = topic_evaluation_look;
		this.topic_attention_number = topic_attention_number;
	}
	public int getTopic_ID() {
		return topic_ID;
	}
	public void setTopic_ID(int topic_ID) {
		this.topic_ID = topic_ID;
	}
	public int getMovie_ID() {
		return movie_ID;
	}
	public void setMovie_ID(int movie_ID) {
		this.movie_ID = movie_ID;
	}
	public String getTopic_Name() {
		return topic_Name;
	}
	public void setTopic_Name(String topic_Name) {
		this.topic_Name = topic_Name;
	}
	public int getTopic_evaluation_number() {
		return topic_evaluation_number;
	}
	public void setTopic_evaluation_number(int topic_evaluation_number) {
		this.topic_evaluation_number = topic_evaluation_number;
	}
	public int getTopic_evaluation_look() {
		return topic_evaluation_look;
	}
	public void setTopic_evaluation_look(int topic_evaluation_look) {
		this.topic_evaluation_look = topic_evaluation_look;
	}
	public int getTopic_attention_number() {
		return topic_attention_number;
	}
	public void setTopic_attention_number(int topic_attention_number) {
		this.topic_attention_number = topic_attention_number;
	}
}
