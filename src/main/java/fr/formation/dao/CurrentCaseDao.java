package fr.formation.dao;

import java.util.Collection;
import java.util.Optional;

import fr.formation.models.Affaire;

public interface AffaireDao extends Dao<Affaire> {
	
	Optional<Affaire> get(int id);
	Collection<Affaire> getAll();
	void add(Affaire affaire);
	void update(Affaire affaire);
	void delete(Affaire affaire);
	
}
