package fr.formation.models;

import lombok.Data;

@Data
public class Indice {

	private String description;
	private String imageUrl;
	
	public Indice(String description, String imageUrl) {
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
	
}
