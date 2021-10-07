package fr.formation.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Affaire {

	// Pour CaseRepositoryImpl, complaint_id sera l'id principal
	
	private Complaint complaint_id;
	private Suspect suspect_id;
	private Clue clue_id;
	
	public int getMain_id() {
		return complaint_id.getId();
	}
	
	
}
