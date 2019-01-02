package DAo;
import java.sql.SQLException;
import java.util.List;
import keshe.Login;

public interface LoginDAO {
	public int addLogin(Login login)throws SQLException;
	public int deleteLogin(int id)throws SQLException;
	public int updateLogin(Login login)throws SQLException;
	public Login findLogin(int id)throws SQLException;
	public List<Login> getAllLogin() throws SQLException;
}

