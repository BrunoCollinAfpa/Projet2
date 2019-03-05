package sandbox.model;

/**
 * @author nico
 */
public class Couleur {
	
	private int id;
	
	private String nomCouleur;
	
	
	public Couleur() {
	
	}
	
	public Couleur(String couleur) {
		this.nomCouleur=couleur;
	}
	
	public Couleur(int id, String couleur) {
		this.id=id;
		this.nomCouleur=couleur;
	}

	/**
	 * @return the hello
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the hello
	 */
	public String getNomCouleur() {
		return nomCouleur;
	}

	/**
	 * @param nomCouleur the nomCouleur to set
	 */
	public void setNomCouleur(String nomCouleur) {
		this.nomCouleur = nomCouleur;
	}
	
	public String toString() {
		return this.id + " - " + this.nomCouleur + " - ";
	}

}
