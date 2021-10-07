package fr.formation.dao;

import java.util.Collection;
import java.util.Optional;

import fr.formation.models.Case;

public interface CaseDao extends Dao<Case> {
	
	Optional<Case> get(int id);
	Collection<Case> getAll();
	void add(Case affaire);
	void update(Case affaire);
	void delete(Case affaire);
	
}
