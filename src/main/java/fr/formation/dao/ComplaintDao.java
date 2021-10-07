package fr.formation.dao;

import java.util.Collection;
import java.util.Optional;

import fr.formation.models.Complaint;

public interface ComplaintDao {
	
	Optional<Complaint> get(int id);
    Collection<Complaint> getAll();
	void add(Complaint complaint);
	void update(Complaint complaint);
	void delete(Complaint complaint);
	
}
