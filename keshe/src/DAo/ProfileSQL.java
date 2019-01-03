package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.Profile;

public class ProfileSQL extends DAOBase implements ProfileDAO{
	private static final String insertProfile_SQL = "INSERT INTO Profile(Profile_ID,Profile_Name) VALUES(?,?)";
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
	
	private static final String deleteprofile_SQL = "DELETE FROM Profile WHERE Profile_ID = ?";
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
	
	private static final String updateprofile_SQL = "UPDATE Profile SET Profile_Name = ? WHERE Profile_ID = ?";
	//修改一个
	public int updateProfile(Profile profile)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updateprofile_SQL);
		ps.setInt(2, profile.getProfile_ID());
		ps.setString(1, profile.getProfile_Name());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getprofileById_SQL = "SELECT * FROM Profile WHERE Profile_ID = ?";
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
			profile.setProfile_ID(rs.getInt("Profile_ID"));
			profile.setProfile_Name(rs.getString("Profile_Name"));
		}
		rs.close();
		ps.close();
		conn.close();
		return profile;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM Profile ";
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
			profile.setProfile_ID(rs.getInt("Profile_ID"));
			profile.setProfile_Name(rs.getString("Profile_Name"));
			all.add(profile);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}

}
