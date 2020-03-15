package DAo;
import java.sql.SQLException;
import java.util.List;

import keshe.User;

public interface UserDAO {
	public int addUser(User user)throws SQLException;
	public int deleteUser(int id)throws SQLException;
	public int updateUser(User user)throws SQLException;
	public User findUser(int id)throws SQLException;
	public List<User> getAllUser() throws SQLException;
}
