package sandbox.model;

import model.beans.Famille;
import model.beans.SousFamille;

/**
 * @author nico
 */

public class Produit {

	/**
	 * L'id du produit
	 */
	private int idProduit;

	/**
	 * L'intitule du produit
	 */
	private String intituleProduit;

	/**
	 * La famille du produit
	 */
	protected Famille fam;

	/**
	 * Le sous_famille du produit
	 */
	protected SousFamille sousFam;

	/**
	 * La marque du produit
	 */
	protected Marque marque;

	/**
	 * Constructeur sans paramètre
	 */
	public Produit() {
	}

	/**
	 * Constructeur objet produit par son intitule
	 */
	public Produit(String nomProduit) {
		this.intituleProduit = nomProduit;
	}

	/**
	 * Constructeur avec tous les attributs de produit
	 */
	public Produit(int id, String nomProduit, Famille famille, SousFamille ssFam, Marque marque) {
		this.idProduit = id;
		this.intituleProduit = nomProduit;
		this.fam = famille;
		this.sousFam = ssFam;
		this.marque = marque;
	}

	/**
	 * @return id produit
	 */
	public int getIdProduit() {
		return idProduit;
	}

	/**
	 * Mise à jour du produit
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idProduit = id;
	}

	/**
	 * @return intituleProduit L'intitule du produit
	 */
	public String getIntituleProduit() {
		return intituleProduit;
	}

	/**
	 * Mise à jour du produit
	 * 
	 * @param intituleProduit the intituleProduit to set
	 */
	public void setIntituleProduit(String intituleProduit) {
		this.intituleProduit = intituleProduit;
	}

	/**
	 * @return fam
	 */
	public Famille getFam() {
		return fam;
	}

	/**
	 * @return sousFam
	 */
	public SousFamille getSousFam() {
		return sousFam;
	}

	/**
	 * @return marque
	 */
	public Marque getMarque() {
		return marque;
	}

	public String toString() {
		return (this.idProduit + " - " + this.intituleProduit + " - " + this.fam.getId() + " - " + this.sousFam.getId()
				+ " - " + this.marque.getId());
	}
}
