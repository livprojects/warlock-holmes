package fr.formation.models;

<<<<<<< HEAD
import lombok.Data;

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
	
=======
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Clue {
	
	private Integer id;
	private String description;
	private String imageUrl;


>>>>>>> 02895f2810c343c75ff51a7a79e020dc22c5a9c4
}
