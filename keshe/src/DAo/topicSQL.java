package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.topic;

public class topicSQL extends DAOBase implements topicDAO{
	private static final String inserttopic_SQL = "INSERT INTO Topic(Topic_ID,Movie_ID,Topic_Name,Topic_Evaluation_number,Topic_Evaluation_Look,Topic_Attention_Number) VALUES(?,?,?,?,?,?)";
	//插入一个
	public int addtopic(topic topic)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(inserttopic_SQL);
		ps.setInt(1, topic.getTopic_ID());
		ps.setInt(2, topic.getMovie_ID());
		ps.setString(3, topic.getTopic_Name());
		ps.setInt(4, topic.getTopic_attention_number());
		ps.setInt(5, topic.getTopic_evaluation_look());
		ps.setInt(6, topic.getTopic_attention_number());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deletetopic_SQL = "DELETE FROM Topic WHERE Topic_ID = ?";
    //删除一个
	public int deletetopic(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deletetopic_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updatetopic_SQL = "UPDATE Topic SET Movie_ID = ?,Topic_Name =?,Topic_Evaluation_number =?,Topic_Evaluation_Look =?,Topic_Attention_Number =? WHERE Topic_ID = ?";
	//修改一个
	public int updatetopic(topic topic)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updatetopic_SQL);
		ps.setInt(6, topic.getTopic_ID());
		ps.setInt(1, topic.getMovie_ID());
		ps.setString(2, topic.getTopic_Name());
		ps.setInt(3, topic.getTopic_attention_number());
		ps.setInt(4, topic.getTopic_evaluation_look());
		ps.setInt(5, topic.getTopic_attention_number());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String gettopicById_SQL = "SELECT * FROM Topic WHERE Topic_ID = ?";
	//查询一行
	public topic findtopic(int id)throws SQLException
	{
		topic topic = new topic();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(gettopicById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			topic.setTopic_ID(rs.getInt("Topic_ID"));
			topic.setMovie_ID(rs.getInt("Movie_ID"));
			topic.setTopic_Name(rs.getString("Topic_Name"));
			topic.setTopic_evaluation_number(rs.getInt("Topic_Evaluation_number"));
			topic.setTopic_evaluation_look(rs.getInt("Topic_Evaluation_Look"));
			topic.setTopic_attention_number(rs.getInt("Topic_Attention_Number"));
		}
		rs.close();
		ps.close();
		conn.close();
		return topic;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM Topic ";
	//查询所有
	public List<topic> getAlltopic() throws SQLException
	{
		List<topic> all = new ArrayList<topic>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllActor_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			topic topic = new topic();
			topic.setTopic_ID(rs.getInt("Topic_ID"));
			topic.setMovie_ID(rs.getInt("Movie_ID"));
			topic.setTopic_Name(rs.getString("Topic_Name"));
			topic.setTopic_evaluation_number(rs.getInt("Topic_Evaluation_number"));
			topic.setTopic_evaluation_look(rs.getInt("Topic_Evaluation_Look"));
			topic.setTopic_attention_number(rs.getInt("Topic_Attention_Number"));
			all.add(topic);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}
}
