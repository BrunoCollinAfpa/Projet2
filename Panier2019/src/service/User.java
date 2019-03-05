package service;

public class User {

	// ATTRIBUTS
	private String nom;
	private String pswd;
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nom
	 * @param pswd
	 */
	public User(String nom, String pswd) {
		super();
		this.nom = nom;
		this.pswd = pswd;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	
}
