package fr.formation.repository;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Clue;

public interface ClueRepository extends Repository<Clue> {

	Optional<Clue> get(int id);
	List<Clue> getAll();
	void add(Clue clue);
	void update(Clue clue);
	void remove(Clue clue);
	
}
