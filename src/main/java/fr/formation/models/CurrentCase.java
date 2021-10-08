package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "current_case")
public class CurrentCase {

	// Pour CaseRepositoryImpl, complaint_id sera l'id principal
	@Id //OBLIGATOIRE UNE FOIS (ET UNE SEULE) DANS UNE CLASSE ENTITY
	@GeneratedValue(strategy = GenerationType.IDENTITY) //STRATEGIE D'AUTO-INCREMENT SUR CET ID
	@Column(name = "current_case_id") //OPTIONEL (SI LE NOM DU CHAMP == LE NOM DE L'ATTRIBUT)
	private int id;
	
	@Column(name = "current_case_plaintive_name")
	private String plaintiveName;
	
	@Column(name= "current_case_report")
	private String report;
	
	@Column(name="current_case_url_illustration")
	private String urlIllustration;
	
	@OneToOne
	@JoinColumn(name="current_case_suspect_id")
	private Suspect suspect_id;
	
	@OneToOne
	@JoinColumn(name="current_case_clue_id")
	private Clue clue_id;
	

	

	
}
