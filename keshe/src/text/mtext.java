package text;

import java.sql.SQLException;
import java.util.List;

import DAo.movieSQL;
import keshe.moive;

public class mtext {
	public void testInsertActor() {
		moive moive=new moive(4,"","","","","","","","","","","");
		movieSQL dao=new movieSQL();
		try {
			dao.addmoive(moive);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdateActor() {
		moive moive=new moive(4,"","","","","","","","","","","");
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
			dao.deletemoive(9);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetActorById() {
		movieSQL dao=new movieSQL();
		try {
			moive moive=dao.findmoive(3);
			System.out.println("moiveid: "+moive.getMovie_ID());
			System.out.println("name: "+ moive.getMovie_Name());
			System.out.println("language: "+ moive.getMovie_Language());
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
				System.out.println("\tlanguage: "+moives.get(i).getMovie_Language());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
