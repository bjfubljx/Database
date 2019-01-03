package text;

import java.sql.SQLException;
import java.util.List;

import keshe.mtr;
import DAo.mtrSQL;

public class mtrtext {
	public void testInsertmtr() {
		mtr mtr=new mtr(4,4,4);
		mtrSQL dao=new mtrSQL();
		try {
			dao.addmtr(mtr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdatemtr() {
		mtr mtr=new mtr(4,4,4);
		mtrSQL dao=new mtrSQL();
		try {
			dao.updatemtr(mtr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeletemtr() {
		mtrSQL dao=new mtrSQL();
		try {
			dao.deletemtr(9);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetmtrById() {
		mtrSQL dao=new mtrSQL();
		try {
			mtr mtr=dao.findmtr(3);
			System.out.println("mtr_id: "+mtr.getMtr_ID());
			System.out.println("moive_ID: "+ mtr.getMoive_ID());
			System.out.println("type_ID"+mtr.getType_ID());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAllmtr() {
		mtrSQL dao=new mtrSQL();
		try {
			List<mtr> mtrs=dao.getAllmtr();
			for(int i=0;i<mtrs.size();i++)
			{
				System.out.println("mtr_id: "+mtrs.get(i).getMtr_ID());
				System.out.println("moive_ID: "+ mtrs.get(i).getMoive_ID());
				System.out.println("type_ID"+mtrs.get(i).getType_ID());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
