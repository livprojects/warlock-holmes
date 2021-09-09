package fr.formation.models;

import java.util.List;

public class Affaire {

	private List<Suspect> suspects;
	private List<Indice> indices;
	private List<Plainte> plaintes;
	
	public Affaire(List<Suspect> suspects, List<Indice> indices, List<Plainte> plaintes) {
		super();
		this.suspects = suspects;
		this.indices = indices;
		this.plaintes = plaintes;
	}
	
	// Est-ce qu'on ferait pas une fonction pour m�langer une liste de type g�n�rique et renvoyer X �l�ments ?
	
	public List<Suspect> getSuspects() {
		return suspects;
	}
	public void setSuspects(List<Suspect> suspects) {
		this.suspects = suspects;
	}
	public List<Indice> getIndices() {
		return indices;
	}
	public void setIndices(List<Indice> indices) {
		this.indices = indices;
	}
	public List<Plainte> getPlaintes() {
		return plaintes;
	}
	public void setPlaintes(List<Plainte> plaintes) {
		this.plaintes = plaintes;
	}
}
