package fr.formation.models;

public class Coupable {

	String name;
	String badExcuse;
	
	public Coupable(String name, String badExcuse) {
		super();
		this.name = name;
		this.badExcuse = badExcuse;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBadExcuse() {
		return badExcuse;
	}
	public void setBadExcuse(String badExcuse) {
		this.badExcuse = badExcuse;
	}
}
