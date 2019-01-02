package DAo;
import java.sql.SQLException;
import java.util.List;

import keshe.Profile;

public interface ProfileDAO {
	public int addProfile(Profile profile)throws SQLException;
	public int deleteProfile(int id)throws SQLException;
	public int updateProfile(Profile profile)throws SQLException;
	public Profile findProfile(int id)throws SQLException;
	public List<Profile> getAllProfile() throws SQLException;
}
