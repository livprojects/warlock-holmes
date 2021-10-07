package fr.formation.models;

import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Complaint {

	private int id;
	private String plaintiveName;
	private String report;
	private Affaire linkedCase;
	private String urlIllustration;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaintiveName() {
		return plaintiveName;
	}
	public void setPlaintiveName(String plaintiveName) {
		this.plaintiveName = plaintiveName;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public Affaire getLinkedCase() {
		return linkedCase;
	}
	public void setLinkedCase(Affaire linkedCase) {
		this.linkedCase = linkedCase;
	}
	public String getUrlIllustration() {
		return urlIllustration;
	}
	public void setUrlIllustration(String urlIllustration) {
		this.urlIllustration = urlIllustration;
	}
		
	
}

