package fr.formation.models;

import lombok.Data;

@Data
public class PieceAConviction {

	String name;
	String text;
	
	public PieceAConviction(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
