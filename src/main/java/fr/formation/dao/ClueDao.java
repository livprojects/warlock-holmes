package fr.formation.dao;

import java.util.Collection;
import java.util.Optional;

import fr.formation.models.Clue;

public interface ClueDao {

	Optional<Clue> get(int id);
	Collection<Clue> getAll();
	void add(Clue clue);
	void update(Clue clue);
	void delete(Clue clue);
}
