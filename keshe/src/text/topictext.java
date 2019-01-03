package text;

import java.sql.SQLException;
import java.util.List;

import keshe.topic;
import DAo.topicSQL;

public class topictext {
	public void testInserttopic() {
		topic topic=new topic(4,4,"","","","");
		topicSQL dao=new topicSQL();
		try {
			dao.addtopic(topic);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdatetopic() {
		topic topic=new topic(4,4,"","","","");
		topicSQL dao=new topicSQL();
		try {
			dao.updatetopic(topic);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeletetopic() {
		topicSQL dao=new topicSQL();
		try {
			dao.deletetopic(9);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGettopicById() {
		topicSQL dao=new topicSQL();
		try {
			topic topic=dao.findtopic(3);
			System.out.println("topic_id: "+topic.getTopic_ID());
			System.out.println("moive_id: "+ topic.getMovie_ID());
			System.out.println("topic_name: "+topic.getTopic_Name());
			System.out.println("topic_evaluation_number: "+topic.getTopic_evaluation_number());
			System.out.println("topic_evaluation_look: "+topic.getTopic_evaluation_look());
			System.out.println("topic_attention_number: "+topic.getTopic_attention_number());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAlltopic() {
		topicSQL dao=new topicSQL();
		try {
			List<topic> topics=dao.getAlltopic();
			for(int i=0;i<topics.size();i++)
			{
				System.out.println("topic_id: "+topics.get(i).getTopic_ID());
				System.out.println("moive_id: "+ topics.get(i).getMovie_ID());
				System.out.println("topic_name: "+topics.get(i).getTopic_Name());
				System.out.println("topic_evaluation_number: "+topics.get(i).getTopic_evaluation_number());
				System.out.println("topic_evaluation_look: "+topics.get(i).getTopic_evaluation_look());
				System.out.println("topic_attention_number: "+topics.get(i).getTopic_attention_number());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
