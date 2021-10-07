package fr.formation.models;

import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Clue {

	
	private String description;
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