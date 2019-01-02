package text;

import java.sql.SQLException;
import java.util.List;

import DAo.LoginSQL;
import keshe.Login;
public class logintext {
	public void testInsertlogin() {
		Login login=new Login(4,"");
		LoginSQL dao=new LoginSQL();
		try {
			dao.addLogin(login);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdatelogin() {
		Login login=new Login(4,"");
		LoginSQL dao=new LoginSQL();
		try {
			dao.updateLogin(login);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeletelogin() {
		LoginSQL dao=new LoginSQL();
		try {
			dao.deleteLogin(9);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetLoginById() {
		LoginSQL dao=new LoginSQL();
		try {
			Login login=dao.findLogin(3);
			System.out.println("Loginid: "+login.getUser_ID());
			System.out.println("LoginName: "+ login.getUser_Name());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAllActor() {
		LoginSQL dao=new LoginSQL();
		try {
			List<Login> logins=dao.getAllLogin();
			for(int i=0;i<logins.size();i++)
			{
				System.out.println("Loginid: "+logins.get(i).getUser_ID());
				System.out.println("LoginName: "+ logins.get(i).getUser_Name());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
