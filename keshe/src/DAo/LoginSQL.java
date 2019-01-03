package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.Login;

public class LoginSQL extends DAOBase implements LoginDAO{
	private static final String insertActor_SQL = "INSERT INTO [MOVIE_DATABASE].[dbo].[User](User_ID,User_Name) VALUES(?,?)";
	//插入一个
	public int addLogin(Login login)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(insertActor_SQL);
		ps.setInt(1, login.getUser_ID());
		ps.setString(2, login.getUser_Name());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deleteActor_SQL = "DELETE FROM [MOVIE_DATABASE].[dbo].[User] WHERE User_ID = ?";
    //删除一个
	public int deleteLogin(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deleteActor_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updateActor_SQL = "UPDATE [MOVIE_DATABASE].[dbo].[User] SET User_Name = ? WHERE User_ID = ?";
	//修改一个
	public int updateLogin(Login login)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updateActor_SQL);
		ps.setInt(2, login.getUser_ID());
		ps.setString(1, login.getUser_Name());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getActorById_SQL = "SELECT * FROM [MOVIE_DATABASE].[dbo].[User] WHERE User_ID = ?";
	//查询一行
	public Login findLogin(int id)throws SQLException
	{
		Login login = new Login();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getActorById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			login.setUser_ID(rs.getInt("User_ID"));
			login.setUser_Name(rs.getString("User_Name"));
		}
		rs.close();
		ps.close();
		conn.close();
		return login;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM [MOVIE_DATABASE].[dbo].[User]";
	//查询所有
	public List<Login> getAllLogin() throws SQLException
	{
		List<Login> all = new ArrayList<Login>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllActor_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			Login login = new Login();
			login.setUser_ID(rs.getInt("User_ID"));
			login.setUser_Name(rs.getString("User_Name"));
			all.add(login);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}

}
