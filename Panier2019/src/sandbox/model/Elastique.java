package sandbox.model;

/**
 * @author nico
 */
public class Elastique extends Produit {

	private int quantite;

	private float prix;

	protected Couleur couleur;

	public Elastique(int qtite, int p, Couleur couleur) {

		this.quantite = qtite;
		this.prix = p;
		this.couleur = couleur;

	}

	/**
	 * @return the hello
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the hello
	 */
	public float getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String toString() {
		return this.getIdProduit() + " - " + this.getIntituleProduit() + " - " + this.quantite + " - " + this.prix
				+ " - " + this.couleur.getNomCouleur();
	}

}
