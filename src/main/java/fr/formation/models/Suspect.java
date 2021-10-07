package fr.formation.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Suspect {

	private Integer id;
	private String name;
	private String surname;
	private String occupation;
	private String alibi;
	private String urlPhoto;

}
