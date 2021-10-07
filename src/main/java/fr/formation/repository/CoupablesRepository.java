package fr.formation.repository;

import java.util.ArrayList;

import fr.formation.models.Coupable;

public interface CoupablesRepository {

	Coupable get(int id);
	ArrayList<Coupable> getAll();
	void add(Coupable coupable);
	void update(Coupable coupable);
	void remove(Coupable coupable);
}
