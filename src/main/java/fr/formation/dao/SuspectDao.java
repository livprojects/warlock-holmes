package fr.formation.dao;

import java.util.Collection;
import java.util.Optional;

import fr.formation.models.Suspect;

public interface SuspectDao {
	
	Optional<Suspect> get(int id);
    Collection<Suspect> getAll();
	void add(Suspect suspect);
	void update(Suspect suspect);
	void delete(Suspect suspect);
}
