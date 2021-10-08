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
@Table(name = "suspect")
public class Suspect {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "suspect_id")
	private int id;
	
	@Column(name = "suspect_name")
	private String name;
	
	@Column(name = "suspect_nickname")
	private String nickname;
	
	@Column(name = "suspect_occupation")
	private String occupation;
	
	@Column(name = "suspect_alibi")
	private String alibi;
	
	@Column(name = "suspect_url_photo")
	private String urlPhoto;
		
}
