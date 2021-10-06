package fr.formation.models;

import lombok.Data;

@Data
public class Affaire {

	private Plainte plainte;
	private Suspect coupable;
	private Indice pieceAConviction;
	

}
