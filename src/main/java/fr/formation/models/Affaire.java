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
@Table(name = "Affaire")
public class Affaire {

	// Pour CaseRepositoryImpl, complaint_id sera l'id principal
	@Id //OBLIGATOIRE UNE FOIS (ET UNE SEULE) DANS UNE CLASSE ENTITY
	@GeneratedValue(strategy = GenerationType.IDENTITY) //STRATEGIE D'AUTO-INCREMENT SUR CET ID
	@Column(name = "id") //OPTIONEL (SI LE NOM DU CHAMP == LE NOM DE L'ATTRIBUT)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "id")
	private Complaint complaint_id;
	
	@OneToOne
	@JoinColumn(name="id")
	private Suspect suspect_id;
	
	@OneToOne
	@JoinColumn(name="id")
	private Clue clue_id;
	
}
