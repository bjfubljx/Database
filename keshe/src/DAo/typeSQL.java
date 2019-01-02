package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.type;
public class typeSQL extends DAOBase implements typeDAO{
	private static final String inserttype_SQL = "INSERT INTO actorinfo(chinesename,name,IMDbid,sex,birthday,profile,image) VALUES(?,?,?,?,?,?,?)";
	//插入一个
	public int addtype(type type)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(inserttype_SQL);
		ps.setInt(1, type.getType_ID());
		ps.setString(2, type.getType_Name());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deletetype_SQL = "DELETE FROM actorinfo WHERE actorid =?";
    //删除一个
	public int deletetype(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deletetype_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updatetype_SQL = "UPDATE actorinfo SET chinesename =?,name =?,IMDbid =?,sex =?,birthday =?,profile =?,image =? WHERE actorid =?";
	//修改一个
	public int updatetype(type type)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updatetype_SQL);
		ps.setInt(1, type.getType_ID());
		ps.setString(2, type.getType_Name());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String gettypeById_SQL = "SELECT * FROM actorinfo WHERE actorid =?";
	//查询一行
	public type findtype(int id)throws SQLException
	{
		type type = new type();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(gettypeById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			type.setType_ID(rs.getInt(""));
			type.setType_Name(rs.getString(""));
		}
		rs.close();
		ps.close();
		conn.close();
		return type;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM actorinfo ";
	//查询所有
	public List<type> getAlltype() throws SQLException
	{
		List<type> all = new ArrayList<type>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllActor_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			type type = new type();
			type.setType_ID(rs.getInt(""));
			type.setType_Name(rs.getString(""));
			all.add(type);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}
}
