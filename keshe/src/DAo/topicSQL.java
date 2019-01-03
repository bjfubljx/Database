package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.topic;

public class topicSQL extends DAOBase implements topicDAO{
	private static final String inserttopic_SQL = "INSERT INTO actorinfo(chinesename,name,IMDbid,sex,birthday,profile,image) VALUES(?,?,?,?,?,?,?)";
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
	
	private static final String deletetopic_SQL = "DELETE FROM actorinfo WHERE actorid =?";
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
	
	private static final String updatetopic_SQL = "UPDATE actorinfo SET chinesename =?,name =?,IMDbid =?,sex =?,birthday =?,profile =?,image =? WHERE actorid =?";
	//修改一个
	public int updatetopic(topic topic)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updatetopic_SQL);
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
	private static final String gettopicById_SQL = "SELECT * FROM actorinfo WHERE actorid =?";
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
			topic.setTopic_ID(rs.getInt(""));
			topic.setMovie_ID(rs.getInt(""));
			topic.setTopic_Name(rs.getString(""));
			topic.setTopic_evaluation_number(rs.getInt(""));
			topic.setTopic_evaluation_look(rs.getInt(""));
			topic.setTopic_attention_number(rs.getInt(""));
		}
		rs.close();
		ps.close();
		conn.close();
		return topic;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM actorinfo ";
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
			topic.setTopic_ID(rs.getInt(""));
			topic.setMovie_ID(rs.getInt(""));
			topic.setTopic_Name(rs.getString(""));
			topic.setTopic_evaluation_number(rs.getInt(""));
			topic.setTopic_evaluation_look(rs.getInt(""));
			topic.setTopic_attention_number(rs.getInt(""));
			all.add(topic);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}
}
