package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.Login;

public class LoginSQL extends DAOBase implements LoginDAO{
	private static final String insertActor_SQL = "INSERT INTO actorinfo(chinesename,name,IMDbid,sex,birthday,profile,image) VALUES(?,?,?,?,?,?,?)";
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
	
	private static final String deleteActor_SQL = "DELETE FROM actorinfo WHERE actorid =?";
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
	
	private static final String updateActor_SQL = "UPDATE actorinfo SET chinesename =?,name =?,IMDbid =?,sex =?,birthday =?,profile =?,image =? WHERE actorid =?";
	//修改一个
	public int updateLogin(Login login)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updateActor_SQL);
		ps.setInt(1, login.getUser_ID());
		ps.setString(2, login.getUser_Name());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getActorById_SQL = "SELECT * FROM actorinfo WHERE actorid =?";
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
			login.setUser_ID(rs.getInt("actorid"));
			login.setUser_Name(rs.getString("chinesename"));
		}
		rs.close();
		ps.close();
		conn.close();
		return login;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM actorinfo ";
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
			login.setUser_ID(rs.getInt("actorid"));
			login.setUser_Name(rs.getString("chinesename"));
			all.add(login);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}

}
