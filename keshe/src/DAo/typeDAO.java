package DAo;

import java.sql.SQLException;
import java.util.List;

import keshe.type;
public interface typeDAO {
	public int addtype(type type)throws SQLException;
	public int deletetype(int id)throws SQLException;
	public int updatetype(type type)throws SQLException;
	public type findtype(int id)throws SQLException;
	public List<type> getAlltype() throws SQLException;
}
