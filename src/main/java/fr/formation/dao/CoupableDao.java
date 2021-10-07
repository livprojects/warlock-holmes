package fr.formation.dao;

import fr.formation.models.Coupable;

public interface CoupableDao {
	void create(Coupable coupable);
	Coupable read(int id);
	void update(Coupable coupable);
	void delete(int id);
}