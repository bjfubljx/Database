package DAo;
import java.sql.SQLException;
import java.util.List;

import keshe.mtr;

public interface mtrDAO {
	public int addmtr(mtr mtr)throws SQLException;
	public int deletemtr(int id)throws SQLException;
	public int updatemtr(mtr mtr)throws SQLException;
	public mtr findmtr(int id)throws SQLException;
	public List<mtr> getAllmtr() throws SQLException;
}
