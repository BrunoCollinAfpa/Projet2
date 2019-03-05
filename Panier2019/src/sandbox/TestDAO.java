package sandbox;

import model.dao.FamilleDAO;
import model.dao.SousFamilleDAO;
import sandbox.model.ProduitDAO;
import xmodele.CouleurDAO;

/**
 * @author nico
 */
public class TestDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Test FamilleDAO() FamilleDAO famDAO = new FamilleDAO(); test find() et
		 * findAll() System.out.println(famDAO.find(3));
		 * System.out.println(famDAO.findAll());
		 */

		/*
		 * ProduitDAO prodDAO = new ProduitDAO(); System.out.println(prodDAO.find(24));
		 */

		CouleurDAO coulDAO = new CouleurDAO();
		System.out.println(coulDAO.find(24));

	}

}
