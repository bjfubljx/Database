package DAo;
import java.sql.SQLException;
import java.util.List;

import keshe.mpr;

public interface mprDAO {
	public int addmpr(mpr mpr)throws SQLException;
	public int deletempr(int id)throws SQLException;
	public int updatempr(mpr mpr)throws SQLException;
	public mpr findmpr(int id)throws SQLException;
	public List<mpr> getAllmpr() throws SQLException;
}
