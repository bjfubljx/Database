package DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import keshe.evaluation;

public class evaluationSQL extends DAOBase implements evaluationDAO{
	private static final String insertevaluation_SQL = "INSERT INTO actorinfo(chinesename,name,IMDbid,sex,birthday,profile,image) VALUES(?,?,?,?,?,?,?)";
	//插入一个
	public int addevaluation(evaluation evaluation)throws SQLException
    {
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(insertevaluation_SQL);
		ps.setInt(2, evaluation.getUser_ID());
		ps.setInt(1, evaluation.getEvaluation_ID());
		ps.setInt(3, evaluation.getMovie_ID());
		ps.setString(4, evaluation.getEvaluation_type());
		ps.setInt(5, evaluation.getStar_Number());
		ps.setString(6, evaluation.getEvaluation_Date());
		ps.setString(7, evaluation.getEvaluation_comment());
		ps.setInt(7, evaluation.getEvaluation_agree());
		ps.setInt(8, evaluation.getEvaluation_total());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
    }
	
	private static final String deleteevaluation_SQL = "DELETE FROM actorinfo WHERE actorid =?";
    //删除一个
	public int deleteevaluation(int id)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(deleteevaluation_SQL);
		ps.setInt(1, id);
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	
	private static final String updateevaluation_SQL = "UPDATE actorinfo SET chinesename =?,name =?,IMDbid =?,sex =?,birthday =?,profile =?,image =? WHERE actorid =?";
	//修改一个
	public int updateevaluation(evaluation evaluation)throws SQLException
	{
		int i = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		conn = getConnection();
		ps = conn.prepareStatement(updateevaluation_SQL);
		ps.setInt(2, evaluation.getUser_ID());
		ps.setInt(1, evaluation.getEvaluation_ID());
		ps.setInt(3, evaluation.getMovie_ID());
		ps.setString(4, evaluation.getEvaluation_type());
		ps.setInt(5, evaluation.getStar_Number());
		ps.setString(6, evaluation.getEvaluation_Date());
		ps.setString(7, evaluation.getEvaluation_comment());
		ps.setInt(7, evaluation.getEvaluation_agree());
		ps.setInt(8, evaluation.getEvaluation_total());
		i = ps.executeUpdate();
		ps.close();
		conn.close();
		return i;
	}
	private static final String getevaluationById_SQL = "SELECT * FROM actorinfo WHERE actorid =?";
	//查询一行
	public evaluation findevaluation(int id)throws SQLException
	{
		evaluation evaluation = new evaluation();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getevaluationById_SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()) {
			evaluation.setEvaluation_ID(rs.getInt(""));
			evaluation.setUser_ID(rs.getInt(""));
			evaluation.setMovie_ID(rs.getInt(""));
			evaluation.setEvaluation_type(rs.getString(""));
			evaluation.setStar_Number(rs.getInt(""));
			evaluation.setEvaluation_Date(rs.getString(""));
			evaluation.setEvaluation_comment(rs.getString(""));
			evaluation.setEvaluation_agree(rs.getInt(""));
			evaluation.setEvaluation_total(rs.getInt(""));
		}
		rs.close();
		ps.close();
		conn.close();
		return evaluation;
	}
	
	private static final String getAllActor_SQL = "SELECT * FROM actorinfo ";
	//查询所有
	public List<evaluation> getAllevaluation() throws SQLException
	{
		List<evaluation> all = new ArrayList<evaluation>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = getConnection();
		ps = conn.prepareStatement(getAllActor_SQL);
		rs = ps.executeQuery();
		while(rs.next()) {
			evaluation evaluation = new evaluation();
			evaluation.setEvaluation_ID(rs.getInt(""));
			evaluation.setUser_ID(rs.getInt(""));
			evaluation.setMovie_ID(rs.getInt(""));
			evaluation.setEvaluation_type(rs.getString(""));
			evaluation.setStar_Number(rs.getInt(""));
			evaluation.setEvaluation_Date(rs.getString(""));
			evaluation.setEvaluation_comment(rs.getString(""));
			evaluation.setEvaluation_agree(rs.getInt(""));
			evaluation.setEvaluation_total(rs.getInt(""));
			all.add(evaluation);
		}
		rs.close();
		ps.close();
		conn.close();
		return all;
	}

}
