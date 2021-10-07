package fr.formation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class User {

	private Integer id;
	private String name;
	private String surname;
	private String pseudo;
	private String email;
	private String password;
	
	
}
