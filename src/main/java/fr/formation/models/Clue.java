package fr.formation.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@Table(name = "clue")
public class Clue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "clue_id")
	private int id;
	
	@Column(name = "clue_description")
	private String description;

	@Column(name = "clue_image_url")
	private String imageUrl;
	
}