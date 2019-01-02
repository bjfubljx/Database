package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.User;

public class UserSQL extends DAOBase implements UserDAO{
	private static final String insertUser_SQL = "INSERT INTO actorinfo(chinesename,name,IMDbid,sex,birthday,profile,image) VALUES(?,?,?,?,?,?,?)";
	//插入一个
	public int addUser(User user)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(insertUser_SQL);
		ps.setInt(1,user.getID());
		ps.setInt(2, user.getUser_ID());
		ps.setString(3, user.getLogin_Type());
		ps.setString(4, user.getIdentifier());
		ps.setString(5, user.getPassword());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deleteUser_SQL = "DELETE FROM actorinfo WHERE actorid =?";
    //删除一个
	public int deleteUser(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deleteUser_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updateUser_SQL = "UPDATE actorinfo SET chinesename =?,name =?,IMDbid =?,sex =?,birthday =?,profile =?,image =? WHERE actorid =?";
	//修改一个
	public int updateUser(User user)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updateUser_SQL);
		ps.setInt(1,user.getID());
		ps.setInt(2, user.getUser_ID());
		ps.setString(3, user.getLogin_Type());
		ps.setString(4, user.getIdentifier());
		ps.setString(5, user.getPassword());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getUserById_SQL = "SELECT * FROM actorinfo WHERE actorid =?";
	//查询一行
	public User findUser(int id)throws SQLException
	{
		User user = new User();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getUserById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			user.setID(rs.getInt(""));
			user.setUser_ID(rs.getInt(""));
			user.setLogin_Type(rs.getString(""));
			user.setIdentifier(rs.getString(""));
			user.setPassword(rs.getString(""));
		}
		rs.close();
		ps.close();
		conn.close();
		return user;
	}
	
	private static final String getAllUser_SQL = "SELECT * FROM actorinfo ";
	//查询所有
	public List<User> getAllUser() throws SQLException
	{
		List<User> all = new ArrayList<User>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllUser_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			User user = new User();
			user.setID(rs.getInt(""));
			user.setUser_ID(rs.getInt(""));
			user.setLogin_Type(rs.getString(""));
			user.setIdentifier(rs.getString(""));
			user.setPassword(rs.getString(""));
			all.add(user);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}
}
