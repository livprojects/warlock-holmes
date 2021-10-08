package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "player_id")
	private int id;
	
	@Column(name = "player_name")
	private String name;

	@Column(name = "player_surname")
	private String surname;
	
	@Column(name = "player_pseudo")
	private String pseudo;
	
	@Column(name = "player_email")
	private String email;
	
	@Column(name = "player_pw")
	private String password;
		
}
