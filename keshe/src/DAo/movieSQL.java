package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.moive;

public class movieSQL extends DAOBase implements movieDAO{
	private static final String insertmoive_SQL = "INSERT INTO actorinfo(chinesename,name,IMDbid,sex,birthday,profile,image) VALUES(?,?,?,?,?,?,?)";
	//插入一个
	public int addmoive(moive moive)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(insertmoive_SQL);
		ps.setInt(1, moive.getMovie_ID());
		ps.setString(2, moive.getMovie_Name());
		ps.setString(3, moive.getMovie_official_website());
		ps.setString(4,moive.getMovie_Length());
		ps.setString(5, moive.getMoive_IMDB_Link());
		ps.setString(6, moive.getMovie_description());
		ps.setString(7, moive.getDouban_score());
		ps.setString(8, moive.getDouban_human_number());
		ps.setString(9, moive.getOther_name());
		ps.setString(10 , moive.getUpdate_time());
		ps.setString(11 , moive.getMovie_Area());
		ps.setString(12, moive.getMovie_Language());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deletemoive_SQL = "DELETE FROM actorinfo WHERE actorid =?";
    //删除一个
	public int deletemoive(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deletemoive_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updatemoive_SQL = "UPDATE actorinfo SET chinesename =?,name =?,IMDbid =?,sex =?,birthday =?,profile =?,image =? WHERE actorid =?";
	//修改一个
	public int updatemoive(moive moive)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updatemoive_SQL);
		ps.setInt(1, moive.getMovie_ID());
		ps.setString(2, moive.getMovie_Name());
		ps.setString(3, moive.getMovie_official_website());
		ps.setString(4,moive.getMovie_Length());
		ps.setString(5, moive.getMoive_IMDB_Link());
		ps.setString(6, moive.getMovie_description());
		ps.setString(7, moive.getDouban_score());
		ps.setString(8, moive.getDouban_human_number());
		ps.setString(9, moive.getOther_name());
		ps.setString(10 , moive.getUpdate_time());
		ps.setString(11 , moive.getMovie_Area());
		ps.setString(12, moive.getMovie_Language());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getmoiveById_SQL = "SELECT * FROM actorinfo WHERE actorid =?";
	//查询一行
	public moive findmoive(int id)throws SQLException
	{
		moive moive = new moive();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getmoiveById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			moive.setMovie_ID(rs.getInt(""));
			moive.setMovie_Name(rs.getString(""));
			moive.setMovie_official_website(rs.getString(""));
			moive.setMovie_Length(rs.getString(""));
			moive.setMoive_IMDB_Link(rs.getString(""));
			moive.setMovie_description(rs.getString(""));
			moive.setDouban_score(rs.getString(""));
			moive.setDouban_human_number(rs.getString(""));
			moive.setOther_name(rs.getString(""));
			moive.setUpdate_time(rs.getString(""));
			moive.setMovie_Area(rs.getString(""));
			moive.setMovie_Language(rs.getString(""));
		}
		rs.close();
		ps.close();
		conn.close();
		return moive;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM actorinfo ";
	//查询所有
	public List<moive> getAllmoive() throws SQLException
	{
		List<moive> all = new ArrayList<moive>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllActor_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			moive moive = new moive();
			moive.setMovie_ID(rs.getInt(""));
			moive.setMovie_Name(rs.getString(""));
			moive.setMovie_official_website(rs.getString(""));
			moive.setMovie_Length(rs.getString(""));
			moive.setMoive_IMDB_Link(rs.getString(""));
			moive.setMovie_description(rs.getString(""));
			moive.setDouban_score(rs.getString(""));
			moive.setDouban_human_number(rs.getString(""));
			moive.setOther_name(rs.getString(""));
			moive.setUpdate_time(rs.getString(""));
			moive.setMovie_Area(rs.getString(""));
			moive.setMovie_Language(rs.getString(""));
			all.add(moive);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}

}
