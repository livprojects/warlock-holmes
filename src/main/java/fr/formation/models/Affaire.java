package fr.formation.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Affaire {

	private Complaint complaint_id;
	private Suspect suspect_id;
	private Clue clue_id;

	
	

}
