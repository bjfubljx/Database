package text;

import java.sql.SQLException;
import java.util.List;

import keshe.Profile;
import DAo.ProfileSQL;

public class Profiletext {
	public void testInsertProfile() {
		Profile profile=new Profile(4,"");
		ProfileSQL dao=new ProfileSQL();
		try {
			dao.addProfile(profile);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdateProfile() {
		Profile profile=new Profile(4,"");
		ProfileSQL dao=new ProfileSQL();
		try {
			dao.updateProfile(profile);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeleteProfile() {
		ProfileSQL dao=new ProfileSQL();
		try {
			dao.deleteProfile(9);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetProfileById() {
		ProfileSQL dao=new ProfileSQL();
		try {
			Profile profile=dao.findProfile(3);
			System.out.println("Profile_id: "+profile.getProfile_ID());
			System.out.println("Profile_Name: "+ profile.getProfile_Name());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAllProfile() {
		ProfileSQL dao=new ProfileSQL();
		try {
			List<Profile> profiles=dao.getAllProfile();
			for(int i=0;i<profiles.size();i++)
			{
				System.out.println("Profile_id: "+profiles.get(i).getProfile_ID());
				System.out.println("Profile_Name: "+ profiles.get(i).getProfile_Name());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
