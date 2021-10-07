package fr.formation.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Complaint {
	
	private Integer id;
	private String plaintiveName;
	private String report;
	private Affaire linkedCase;
	private String urlIllustration;	
	
}

