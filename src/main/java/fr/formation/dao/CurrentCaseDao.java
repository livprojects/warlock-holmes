package fr.formation.dao;

import java.util.Collection;
import java.util.Optional;

import fr.formation.models.CurrentCase;

public interface CurrentCaseDao extends Dao<CurrentCase> {
	
	Optional<CurrentCase> get(int id);
	Collection<CurrentCase> getAll();
	void add(CurrentCase affaire);
	void update(CurrentCase affaire);
	void delete(CurrentCase affaire);
	
}
