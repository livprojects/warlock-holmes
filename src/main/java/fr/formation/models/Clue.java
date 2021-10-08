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
	@Column(name = "id")
	private int id;
	
	@Column(name = "description")
	private String description;

	@Column(name = "imageUrl")
	private String imageUrl;
	
	public Clue(String description, String imageUrl) {
		super();
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}