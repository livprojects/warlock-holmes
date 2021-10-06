package fr.formation.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Suspect {

	private String nom;
	private String prenom;
	private String occupation;
	private String alibi;
	private String urlPhoto;

}
