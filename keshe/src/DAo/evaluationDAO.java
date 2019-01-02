package DAo;

import java.sql.SQLException;
import java.util.List;
import keshe.evaluation;;

public interface evaluationDAO {
	public int addevaluation(evaluation evaluation)throws SQLException;
	public int deleteevaluation(int id)throws SQLException;
	public int updateevaluation(evaluation evaluation)throws SQLException;
	public evaluation findevaluation(int id)throws SQLException;
	public List<evaluation> getAllevaluation() throws SQLException;
}
