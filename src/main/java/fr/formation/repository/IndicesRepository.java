package fr.formation.repository;

import java.util.ArrayList;

import fr.formation.models.Indice;

public interface IndicesRepository {

	Indice get(int id);
	ArrayList<Indice> getAll();
	void add(Indice indice);
	void update(Indice indice);
	void remove(Indice indice);
	
}
