package text;

import java.sql.SQLException;
import java.util.List;

import keshe.evaluation;
import DAo.evaluationSQL;;

public class evaluationText {
	public void testInsertevaluation() {
		evaluation evaluation=new evaluation(4,1004,2,"≤‚ ‘",4,"2019-01-03","’‚ «“ª∏ˆ≤‚ ‘",1111,11111);
		evaluationSQL dao=new evaluationSQL();
		try {
			dao.addevaluation(evaluation);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testUpdateevluation() {
		evaluation evaluation=new evaluation(4,1004,2,"≤‚ ‘–ﬁ∏ƒ",4,"2019-01-03","≤‚ ‘–ﬁ∏ƒ",1111,11111);
		evaluationSQL dao=new evaluationSQL();
		try {
			dao.updateevaluation(evaluation);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDeleteevluation() {
		evaluationSQL dao=new evaluationSQL();
		try {
			dao.deleteevaluation(4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetevaluationById() {
		evaluationSQL dao=new evaluationSQL();
		try {
			evaluation evaluation=dao.findevaluation(3);
			System.out.println("evaluationid: "+evaluation.getEvaluation_ID());
			System.out.println("UserID: "+ evaluation.getUser_ID());
			System.out.println("moive_ID: "+ evaluation.getMovie_ID());
			System.out.println("evaluation_Type: "+ evaluation.getEvaluation_type());
			System.out.println("star_number: "+ evaluation.getStar_Number());
			System.out.println("evaluation_Date: "+ evaluation.getEvaluation_Date());
			System.out.println("evaluation_comment: "+ evaluation.getEvaluation_comment());
			System.out.println("evaluation_agree: "+ evaluation.getEvaluation_agree());
			System.out.println("evaluation_total: "+ evaluation.getEvaluation_total());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testGetAllevaluation() {
		evaluationSQL dao=new evaluationSQL();
		try {
			List<evaluation> evaluations=dao.getAllevaluation();
			for(int i=0;i<evaluations.size();i++)
			{
				System.out.println("evaluationid: "+evaluations.get(i).getEvaluation_ID());
				System.out.println("UserID: "+ evaluations.get(i).getUser_ID());
				System.out.println("moive_ID: "+ evaluations.get(i).getMovie_ID());
				System.out.println("evaluation_Type: "+ evaluations.get(i).getEvaluation_type());
				System.out.println("star_number: "+ evaluations.get(i).getStar_Number());
				System.out.println("evaluation_Date: "+ evaluations.get(i).getEvaluation_Date());
				System.out.println("evaluation_comment: "+ evaluations.get(i).getEvaluation_comment());
				System.out.println("evaluation_agree: "+ evaluations.get(i).getEvaluation_agree());
				System.out.println("evaluation_total: "+ evaluations.get(i).getEvaluation_total());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
