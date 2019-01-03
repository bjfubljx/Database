package text;

import java.sql.SQLException;
import java.util.List;

import DAo.movieSQL;
import keshe.moive;

public class mtext {
	public void testInsertActor() {
		moive moive=new moive(4,"≤‚ ‘","≤‚ ‘",1234,"≤‚ ‘","≤‚ ‘","≤‚ ‘",6,"≤‚ ‘","≤‚ ‘","≤‚ ‘","≤‚ ‘");
		movieSQL dao=new movieSQL();
		try {
			dao.addmoive(moive);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdateActor() {
		moive moive=new moive(4,"–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ≤‚ ‘",1234,"–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ≤‚ ‘",6,"–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ≤‚ ‘");
		movieSQL dao=new movieSQL();
		try {
			dao.updatemoive(moive);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeleteActor() {
		movieSQL dao=new movieSQL();
		try {
			dao.deletemoive(4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetActorById() {
		movieSQL dao=new movieSQL();
		try {
			moive moive=dao.findmoive(3);
			System.out.print("moiveid: "+moive.getMovie_ID());
			System.out.print("\tname: "+moive.getMovie_Name());
			System.out.print("\tofficial_website: "+moive.getMovie_official_website());
			System.out.print("\tmoive_Length: "+moive.getMovie_Length());
			System.out.print("\tmoive_IMBD_link: "+moive.getMoive_IMDB_Link());
			System.out.print("\tmoive_description: "+moive.getMovie_description());
			System.out.print("\tdouban_score: "+moive.getDouban_score());
			System.out.print("\tdouban_human_number: "+moive.getDouban_human_number());
			System.out.print("\tother_name: "+moive.getOther_name());
			System.out.print("\tupdate_time: "+moive.getUpdate_time());
			System.out.print("\tmoive_Area: "+moive.getMovie_Area());
			System.out.println("\tlanguage: "+moive.getMovie_Language());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAllActor() {
		movieSQL dao=new movieSQL();
		try {
			List<moive> moives=dao.getAllmoive();
			for(int i=0;i<moives.size();i++)
			{
				System.out.print("moiveid: "+moives.get(i).getMovie_ID());
				System.out.print("\tname: "+moives.get(i).getMovie_Name());
				System.out.print("\tofficial_website: "+moives.get(i).getMovie_official_website());
				System.out.print("\tmoive_Length: "+moives.get(i).getMovie_Length());
				System.out.print("\tmoive_IMBD_link: "+moives.get(i).getMoive_IMDB_Link());
				System.out.print("\tmoive_description: "+moives.get(i).getMovie_description());
				System.out.print("\tdouban_score: "+moives.get(i).getDouban_score());
				System.out.print("\tdouban_human_number: "+moives.get(i).getDouban_human_number());
				System.out.print("\tother_name: "+moives.get(i).getOther_name());
				System.out.print("\tupdate_time: "+moives.get(i).getUpdate_time());
				System.out.print("\tmoive_Area: "+moives.get(i).getMovie_Area());
				System.out.println("\tlanguage: "+moives.get(i).getMovie_Language());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
