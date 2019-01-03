package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.person;

public class personSQL extends DAOBase implements personDAO{
	private static final String insertperson_SQL = "INSERT INTO People(Act_ID,Act_Name,Act_Sex,Act_Birthday,Act_ChineseName,Act_Imbd) VALUES(?,?,?,?,?,?)";
	//插入一个
	public int addperson(person person)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(insertperson_SQL);
		ps.setInt(1,person.getAct_ID());
		ps.setString(2, person.getAct_Name());
		ps.setString(3, person.getAct_Sex());
		ps.setString(4, person.getAct_birthday());
		ps.setString(5, person.getAct_ChineseName());
		ps.setString(6, person.getAct_imbd());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deleteperson_SQL = "DELETE FROM People WHERE Act_ID = ?";
    //删除一个
	public int deleteperson(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deleteperson_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updateperson_SQL = "UPDATE People SET Act_Name = ?,Act_Sex =?,Act_Birthday =?,Act_ChineseName =?,Act_Imbd =? WHERE Act_ID = ?";
	//修改一个
	public int updateperson(person person)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updateperson_SQL);
		ps.setInt(6,person.getAct_ID());
		ps.setString(1, person.getAct_Name());
		ps.setString(2, person.getAct_Sex());
		ps.setString(3, person.getAct_birthday());
		ps.setString(4, person.getAct_ChineseName());
		ps.setString(5, person.getAct_imbd());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getpersonById_SQL = "SELECT * FROM People WHERE Act_ID = ?";
	//查询一行
	public person findperson(int id)throws SQLException
	{
		person person = new person();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getpersonById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			person.setAct_ID(rs.getInt("Act_ID"));
			person.setAct_Name(rs.getString("Act_Name"));
			person.setAct_Sex(rs.getString("Act_Sex"));
			person.setAct_birthday(rs.getString("Act_Birthday"));
			person.setAct_ChineseName(rs.getString("Act_ChineseName"));
			person.setAct_imbd(rs.getString("Act_Imbd"));
		}
		rs.close();
		ps.close();
		conn.close();
		return person;
	}
	
	private static final String getAllperson_SQL = "SELECT * FROM People ";
	//查询所有
	public List<person> getAllperson() throws SQLException
	{
		List<person> all = new ArrayList<person>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllperson_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			person person = new person();
			person.setAct_ID(rs.getInt("Act_ID"));
			person.setAct_Name(rs.getString("Act_Name"));
			person.setAct_Sex(rs.getString("Act_Sex"));
			person.setAct_birthday(rs.getString("Act_Birthday"));
			person.setAct_ChineseName(rs.getString("Act_ChineseName"));
			person.setAct_imbd(rs.getString("Act_Imbd"));
			all.add(person);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}

}
