package fr.formation.repository;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Player;

public interface PlayerRepository extends Repository<Player>{

	Optional<Player> get(int id);
	List<Player> getAll();
	void add(Player user);
	void update(Player user);
	void remove(Player user);
	
}
