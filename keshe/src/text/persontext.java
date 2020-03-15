package text;

import java.sql.SQLException;
import java.util.List;

import keshe.person;
import DAo.personSQL;

public class persontext {
	public void testInsertperson() {
		person person=new person(21,"≤‚ ‘","≤‚","1999-01-09","≤‚ ‘","m498529");
		personSQL dao=new personSQL();
		try {
			dao.addperson(person);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdateperson() {
		person person=new person(21,"–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ","1999-01-09","–ﬁ∏ƒ≤‚ ‘","m23425");
		personSQL dao=new personSQL();
		try {
			dao.updateperson(person);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeleteperson() {
		personSQL dao=new personSQL();
		try {
			dao.deleteperson(21);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetpersonById() {
		personSQL dao=new personSQL();
		try {
			person person=dao.findperson(3);
			System.out.println("person_id: "+person.getAct_ID());
			System.out.println("person_Name: "+ person.getAct_Name());
			System.out.println("person_Sex: "+person.getAct_Sex());
			System.out.println("person_birthday: "+person.getAct_birthday());
			System.out.println("person_Chinese_name: "+person.getAct_ChineseName());
			System.out.println("person_imbd: "+person.getAct_imbd());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAllperson() {
		personSQL dao=new personSQL();
		try {
			List<person> persons=dao.getAllperson();
			for(int i=0;i<persons.size();i++)
			{
				System.out.println("person_id: "+persons.get(i).getAct_ID());
				System.out.println("person_Name: "+ persons.get(i).getAct_Name());
				System.out.println("person_Sex: "+persons.get(i).getAct_Sex());
				System.out.println("person_birthday: "+persons.get(i).getAct_birthday());
				System.out.println("person_Chinese_name: "+persons.get(i).getAct_ChineseName());
				System.out.println("person_imbd: "+persons.get(i).getAct_imbd());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
