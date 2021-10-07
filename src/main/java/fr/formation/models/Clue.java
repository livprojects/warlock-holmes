package fr.formation.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Clue {
	
	private Integer id;
	private String description;
	private String imageUrl;


}
