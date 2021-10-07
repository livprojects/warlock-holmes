package fr.formation.repository;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Case;

public interface CaseRepository extends Repository<Case> {

	Optional<Case> get(Case affaire);
	List<Case> getAll();
	void add(Case affaire);
	void update(Case affaire);
	void remove(Case affaire);
	
}
