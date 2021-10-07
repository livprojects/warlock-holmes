package fr.formation.repository;

import java.util.ArrayList;

import fr.formation.models.Plainte;

public interface PlaintesRepository {

	Plainte get(int id);
	ArrayList<Plainte> getAll();
	void add(Plainte plainte);
	void update(Plainte plainte);
	void remove(Plainte plainte);
	
}
