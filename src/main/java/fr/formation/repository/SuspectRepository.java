package fr.formation.repository;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Suspect;

public interface SuspectRepository extends Repository<Suspect>{

	Optional<Suspect> get(Suspect suspect);
	List<Suspect> getAll();
	void add(Suspect suspect);
	void update(Suspect suspect);
	void remove(Suspect suspect);
	
}
