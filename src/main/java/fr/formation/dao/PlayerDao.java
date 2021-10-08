package fr.formation.dao;

import java.util.Collection;
import java.util.Optional;

import fr.formation.models.Player;

public interface PlayerDao {

	Optional<Player> get(int id);
    Collection<Player> getAll();
	void add(Player user);
	void update(Player user);
	void delete(Player user);
}
