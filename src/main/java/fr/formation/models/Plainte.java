package fr.formation.models;

import lombok.Data;


@Data
public class Plainte {

	private String plaignant;
	private String procesVerbal;
	private Affaire affaireLiee;
	private String urlIllustration;	
	
}

