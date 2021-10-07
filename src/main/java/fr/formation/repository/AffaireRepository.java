package fr.formation.repository;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Affaire;

public interface AffaireRepository extends Repository<Affaire> {

	Optional<Affaire> get(Affaire affaire);
	List<Affaire> getAll();
	void add(Affaire affaire);
	void update(Affaire affaire);
	void remove(Affaire affaire);
	
}
