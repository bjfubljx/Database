package DAo;
import java.sql.SQLException;
import java.util.List;

import keshe.person;

public interface personDAO {
	public int addperson(person person)throws SQLException;
	public int deleteperson(int id)throws SQLException;
	public int updateperson(person person)throws SQLException;
	public person findperson(int id)throws SQLException;
	public List<person> getAllperson() throws SQLException;
}
