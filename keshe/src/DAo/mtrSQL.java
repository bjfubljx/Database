package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.mtr;
public class mtrSQL extends DAOBase implements mtrDAO{
	private static final String insertmtr_SQL = "INSERT INTO actorinfo(chinesename,name,IMDbid,sex,birthday,profile,image) VALUES(?,?,?,?,?,?,?)";
	//插入一个
	public int addmtr(mtr mtr)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(insertmtr_SQL);
		ps.setInt(1, mtr.getMtr_ID());
		ps.setInt(2, mtr.getMoive_ID());
		ps.setInt(3, mtr.getType_ID());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deletemtr_SQL = "DELETE FROM actorinfo WHERE actorid =?";
    //删除一个
	public int deletemtr(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deletemtr_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updatemtr_SQL = "UPDATE actorinfo SET chinesename =?,name =?,IMDbid =?,sex =?,birthday =?,profile =?,image =? WHERE actorid =?";
	//修改一个
	public int updatemtr(mtr mtr)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updatemtr_SQL);
		ps.setInt(1, mtr.getMtr_ID());
		ps.setInt(2, mtr.getMoive_ID());
		ps.setInt(3, mtr.getType_ID());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getActorById_SQL = "SELECT * FROM actorinfo WHERE actorid =?";
	//查询一行
	public mtr findmtr(int id)throws SQLException
	{
		mtr mtr = new mtr();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getActorById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			mtr.setMtr_ID(rs.getInt(""));
			mtr.setMoive_ID(rs.getInt(""));
			mtr.setType_ID(rs.getInt(""));
		}
		rs.close();
		ps.close();
		conn.close();
		return mtr;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM actorinfo ";
	//查询所有
	public List<mtr> getAllmtr() throws SQLException
	{
		List<mtr> all = new ArrayList<mtr>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllActor_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			mtr mtr = new mtr();
			mtr.setMtr_ID(rs.getInt(""));
			mtr.setMoive_ID(rs.getInt(""));
			mtr.setType_ID(rs.getInt(""));
			all.add(mtr);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}
}
