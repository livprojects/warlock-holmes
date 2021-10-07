package fr.formation.repository;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Complaint;

public interface ComplaintRepository extends Repository<Complaint>{

	Optional<Complaint> get(Complaint complaint);
	List<Complaint> getAll();
	void add(Complaint complaint);
	void update(Complaint complaint);
	void remove(Complaint complaint);
	
}
