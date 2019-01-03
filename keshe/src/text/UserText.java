package text;

import java.sql.SQLException;
import java.util.List;

import keshe.User;
import DAo.UserSQL;

public class UserText {
	public void testInsertUser() {
		User user=new User(5,1001,"≤‚ ‘","≤‚ ‘","≤‚ ‘");
		UserSQL dao=new UserSQL();
		try {
			dao.addUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdateUser() {
		User user=new User(5,1001,"–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ≤‚ ‘","–ﬁ∏ƒ≤‚ ‘");
		UserSQL dao=new UserSQL();
		try {
			dao.updateUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeleteUser() {
		UserSQL dao=new UserSQL();
		try {
			dao.deleteUser(5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetUserById() {
		UserSQL dao=new UserSQL();
		try {
			User user=dao.findUser(3);
			System.out.println("id: "+user.getID());
			System.out.println("User_ID: "+ user.getUser_ID());
			System.out.println("Login_Type: "+user.getLogin_Type());
			System.out.println("Identifier: "+user.getIdentifier());
			System.out.println("Password: "+user.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAllUser() {
		UserSQL dao=new UserSQL();
		try {
			List<User> users=dao.getAllUser();
			for(int i=0;i<users.size();i++)
			{
				System.out.println("id: "+users.get(i).getID());
				System.out.println("User_ID: "+ users.get(i).getUser_ID());
				System.out.println("Login_Type: "+users.get(i).getLogin_Type());
				System.out.println("Identifier: "+users.get(i).getIdentifier());
				System.out.println("Password: "+users.get(i).getPassword());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
