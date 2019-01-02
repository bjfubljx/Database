package DAo;
import java.sql.SQLException;
import java.util.List;

import keshe.topic;

public interface topicDAO {
	public int addtopic(topic topic)throws SQLException;
	public int deletetopic(int id)throws SQLException;
	public int updatetopic(topic topic)throws SQLException;
	public topic findtopic(int id)throws SQLException;
	public List<topic> getAlltopic() throws SQLException;
}
