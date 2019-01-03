package text;

import java.sql.SQLException;
import java.util.List;

import keshe.mpr;
import DAo.mprSQL;

public class mprtext {
	public void testInsertmpr() {
		mpr mpr=new mpr(4,4,4,4);
		mprSQL dao=new mprSQL();
		try {
			dao.addmpr(mpr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdatempr() {
		mpr mpr=new mpr(4,4,4,4);
		mprSQL dao=new mprSQL();
		try {
			dao.updatempr(mpr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeletempr() {
		mprSQL dao=new mprSQL();
		try {
			dao.deletempr(9);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetmprById() {
		mprSQL dao=new mprSQL();
		try {
			mpr mpr=dao.findmpr(3);
			System.out.println("mprid: "+mpr.getMpr_ID());
			System.out.println("moive_id: "+ mpr.getMoive_ID());
			System.out.println("Act_ID:"+mpr.getAct_ID());
			System.out.println("Profile_ID"+mpr.getProfile_ID());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAllmpr() {
		mprSQL dao=new mprSQL();
		try {
			List<mpr> mprs=dao.getAllmpr();
			for(int i=0;i<mprs.size();i++)
			{
				System.out.println("mprid: "+mprs.get(i).getMpr_ID());
				System.out.println("moive_id: "+ mprs.get(i).getMoive_ID());
				System.out.println("Act_ID:"+mprs.get(i).getAct_ID());
				System.out.println("Profile_ID"+mprs.get(i).getProfile_ID());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
