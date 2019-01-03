package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.User;

public class UserSQL extends DAOBase implements UserDAO{
	private static final String insertUser_SQL = "INSERT INTO Login(Login_ID,User_ID,Login_Type,Login_Ident,Login_Pass) VALUES(?,?,?,?,?)";
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
	
	private static final String deleteUser_SQL = "DELETE FROM Login WHERE Login_ID = ?";
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
	
	private static final String updateUser_SQL = "UPDATE User SET User_ID = ?,Login_Type =?,Login_Ident =?,Login_Pass =? WHERE Login_ID = ?";
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
	private static final String getUserById_SQL = "SELECT * FROM User WHERE Login_ID = ?";
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
			user.setID(rs.getInt("Login_ID"));
			user.setUser_ID(rs.getInt("User_ID"));
			user.setLogin_Type(rs.getString("Login_Type"));
			user.setIdentifier(rs.getString("Login_Ident"));
			user.setPassword(rs.getString("Login_Pass"));
		}
		rs.close();
		ps.close();
		conn.close();
		return user;
	}
	
	private static final String getAllUser_SQL = "SELECT * FROM Login ";
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
			user.setID(rs.getInt("Login_ID"));
			user.setUser_ID(rs.getInt("User_ID"));
			user.setLogin_Type(rs.getString("Login_Type"));
			user.setIdentifier(rs.getString("Login_Ident"));
			user.setPassword(rs.getString("Login_Pass"));
			all.add(user);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}
}
