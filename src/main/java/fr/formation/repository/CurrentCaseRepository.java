package fr.formation.repository;

import java.util.List;
import java.util.Optional;

import fr.formation.models.CurrentCase;

public interface CurrentCaseRepository extends Repository<CurrentCase> {

	Optional<CurrentCase> get(int id);
	List<CurrentCase> getAll();
	void add(CurrentCase affaire);
	void update(CurrentCase affaire);
	void remove(CurrentCase affaire);
	
}
