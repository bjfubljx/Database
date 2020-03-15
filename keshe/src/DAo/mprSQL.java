package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.mpr;

public class mprSQL extends DAOBase implements mprDAO{
	private static final String insertmpr_SQL = "INSERT INTO People_Movie(ID,Movie_ID,People_ID,Profile_ID) VALUES(?,?,?,?)";
	//插入一个
	public int addmpr(mpr mpr)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(insertmpr_SQL);
		ps.setInt(1, mpr.getMpr_ID());
		ps.setInt(2, mpr.getMoive_ID());
		ps.setInt(3, mpr.getAct_ID());
		ps.setInt(4, mpr.getProfile_ID());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deletempr_SQL = "DELETE FROM People_Movie WHERE ID = ?";
    //删除一个
	public int deletempr(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deletempr_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updateActor_SQL = "UPDATE People_Movie SET Movie_ID = ?,People_ID =?,Profile_ID =? WHERE ID = ?";
	//修改一个
	public int updatempr(mpr mpr)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updateActor_SQL);
		ps.setInt(4, mpr.getMpr_ID());
		ps.setInt(1, mpr.getMoive_ID());
		ps.setInt(2, mpr.getAct_ID());
		ps.setInt(3, mpr.getProfile_ID());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getmprById_SQL = "SELECT * FROM People_Movie WHERE ID = ?";
	//查询一行
	public mpr findmpr(int id)throws SQLException
	{
		mpr mpr = new mpr();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getmprById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			mpr.setMpr_ID(rs.getInt("ID"));
			mpr.setMoive_ID(rs.getInt("Movie_ID"));
			mpr.setAct_ID(rs.getInt("People_ID"));
			mpr.setProfile_ID(rs.getInt("Profile_ID"));
		}
		rs.close();
		ps.close();
		conn.close();
		return mpr;
	}
	
	private static final String getAllmpr_SQL = "SELECT * FROM People_Movie ";
	//查询所有
	public List<mpr> getAllmpr() throws SQLException
	{
		List<mpr> all = new ArrayList<mpr>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllmpr_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			mpr mpr = new mpr();
			mpr.setMpr_ID(rs.getInt("ID"));
			mpr.setMoive_ID(rs.getInt("Movie_ID"));
			mpr.setAct_ID(rs.getInt("People_ID"));
			mpr.setProfile_ID(rs.getInt("Profile_ID"));
			all.add(mpr);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}
}
