package fr.formation.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@Table(name = "complaint")
public class Complaint {

	@Id //OBLIGATOIRE UNE FOIS (ET UNE SEULE) DANS UNE CLASSE ENTITY
	@GeneratedValue(strategy = GenerationType.IDENTITY) //STRATEGIE D'AUTO-INCREMENT SUR CET ID
	@Column(name = "id") //OPTIONEL (SI LE NOM DU CHAMP == LE NOM DE L'ATTRIBUT)
	private int id;
	
	@Column(name= "plaintiveName")
	private String plaintiveName;
	
	@Column(name= "report")
	private String report;
	
	@OneToOne
	@JoinColumn(name = "linkedCase")
	private Affaire linkedCase;
	
	@Column(name="urlIllustration")
	private String urlIllustration;
		
	
}

