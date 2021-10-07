package fr.formation.dao;

import fr.formation.models.Affaire;

public interface AffaireDao {

	void create(Affaire affaire);
	Affaire read(int id);
	void update(Affaire affaire);
	void delete(int id);
	
}
