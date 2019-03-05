package sandbox.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import modele.ConnectBDD;
import modele.DAO;

public class ElastiqueDAO implements DAO<Elastique> {

	@Override
	public Elastique create(Elastique obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Elastique delete(Elastique obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Elastique update(Elastique obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Elastique find(int id) {
		
		//declaration d'une variable de Elastique 
		Elastique elastique = null;
		
		// requete emise
		String requete = ("SELECT * FROM stock WHERE ID = " + id);
		
		
		try {
			
			// connexion à la BDD
			Statement stmt = ConnectBDD.getConnect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			//execution de la requete
			ResultSet result = stmt.executeQuery(requete);
			
			//s'il y a un resultat, je cree l'objet elastique avec les donnees trouvees
		    if(result.first()) {
		    	elastique = new Elastique(id, result.getInt(""), );
		    	System.out.println("objet trouve");
			}
		    
		    // puis fermeture de la connexion
		    stmt.close();
		    System.out.println("Fermeture connexion ok");
		    
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Elastique> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
