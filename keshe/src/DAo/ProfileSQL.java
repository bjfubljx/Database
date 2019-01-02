package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.Profile;

public class ProfileSQL extends DAOBase implements ProfileDAO{
	private static final String insertProfile_SQL = "INSERT INTO actorinfo(chinesename,name,IMDbid,sex,birthday,profile,image) VALUES(?,?,?,?,?,?,?)";
	//插入一个
	public int addProfile(Profile profile)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(insertProfile_SQL);
		ps.setInt(1, profile.getProfile_ID());
		ps.setString(2, profile.getProfile_Name());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deleteprofile_SQL = "DELETE FROM actorinfo WHERE actorid =?";
    //删除一个
	public int deleteProfile(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deleteprofile_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updateprofile_SQL = "UPDATE actorinfo SET chinesename =?,name =?,IMDbid =?,sex =?,birthday =?,profile =?,image =? WHERE actorid =?";
	//修改一个
	public int updateProfile(Profile profile)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updateprofile_SQL);
		ps.setInt(1, profile.getProfile_ID());
		ps.setString(2, profile.getProfile_Name());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getprofileById_SQL = "SELECT * FROM actorinfo WHERE actorid =?";
	//查询一行
	public Profile findProfile(int id)throws SQLException
	{
		Profile profile = new Profile();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getprofileById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			profile.setProfile_ID(rs.getInt(""));
			profile.setProfile_Name(rs.getString(""));
		}
		rs.close();
		ps.close();
		conn.close();
		return profile;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM actorinfo ";
	//查询所有
	public List<Profile> getAllProfile() throws SQLException
	{
		List<Profile> all = new ArrayList<Profile>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllActor_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			Profile profile = new Profile();
			profile.setProfile_ID(rs.getInt(""));
			profile.setProfile_Name(rs.getString(""));
			all.add(profile);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}

}
