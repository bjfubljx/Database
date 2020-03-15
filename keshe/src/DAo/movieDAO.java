package DAo;

import java.sql.SQLException;
import java.util.List;

import keshe.moive;


public interface movieDAO {
	public int addmoive(moive moive)throws SQLException;
	public int deletemoive(int id)throws SQLException;
	public int updatemoive(moive moive)throws SQLException;
	public moive findmoive(int id)throws SQLException;
	public List<moive> getAllmoive() throws SQLException;
}
