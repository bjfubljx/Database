package text;

import java.sql.SQLException;
import java.util.List;

import keshe.type;
import DAo.typeSQL;

public class typetext {
	public void testInserttype() {
		type type=new type(14,"≤‚ ‘");
		typeSQL dao=new typeSQL();
		try {
			dao.addtype(type);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdatetype() {
		type type=new type(14,"–ﬁ∏ƒ≤‚ ‘");
		typeSQL dao=new typeSQL();
		try {
			dao.updatetype(type);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeletetype() {
		typeSQL dao=new typeSQL();
		try {
			dao.deletetype(14);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGettypeById() {
		typeSQL dao=new typeSQL();
		try {
			type type=dao.findtype(3);
			System.out.println("type_id: "+type.getType_ID());
			System.out.println("type_Name: "+type.getType_Name());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAlltype() {
		typeSQL dao=new typeSQL();
		try {
			List<type> types=dao.getAlltype();
			for(int i=0;i<types.size();i++)
			{
				System.out.println("type_id: "+types.get(i).getType_ID());
				System.out.println("type_Name: "+types.get(i).getType_Name());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
