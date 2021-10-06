package fr.formation.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {

	private String nom;
	private String prenom;
	private String pseudo;
	private String email;
	private String password;
	
	
}
