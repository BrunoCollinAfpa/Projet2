package sandbox;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.ConnectBDD;


/**
 * @author nico
 */
public class TestConnectBDD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConnectBDD connect = new ConnectBDD();
		
		// test trouver une couleur dans la bdd (de type find()):
		    
		    try {
		    	ResultSet result = connect.getConnect().createStatement(
		    			ResultSet.TYPE_SCROLL_INSENSITIVE,
		    			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM couleur WHERE id = " + 238);
		    	if(result.first()) {
		    		System.out.println(result.getString("nom_couleur"));
		    	} else {
		    		System.out.println("id_couleur inexistant");
		    	}
		    	
		    } catch (SQLException e) {
		    	e.printStackTrace();
		    }
		   
		  

	}

}
