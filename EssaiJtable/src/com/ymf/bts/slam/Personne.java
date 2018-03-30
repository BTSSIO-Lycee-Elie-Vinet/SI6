/**
 * 
 */
package com.ymf.bts.slam;

/**
 * @author yfontenoy
 *
 */
public class Personne {
	String nom;
	String prenom;
	String telephone;
	boolean terrien;
	Section section;
	
	public Personne(String nom, String prenom, String telephone, boolean terrien, Section section) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.terrien = terrien;
		this.section = section;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public boolean isTerrien() {
		return terrien;
	}
	public void setTerrien(boolean terrien) {
		this.terrien = terrien;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	
}
