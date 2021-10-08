package fr.formation.repository.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import fr.formation.dao.impl.PlayerDaoImpl;
import fr.formation.models.Player;
import fr.formation.repository.PlayerRepository;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository {

	private PlayerDaoImpl userDaoImpl;

	@Override
	public Optional<Player> get(int id) {
		return userDaoImpl.get(id);
	}

	@Override
	public List<Player> getAll() {
		return userDaoImpl.getAll();
	}

	@Override
	public void add(Player user) {
		userDaoImpl.add(user);
	}

	@Override
	public void update(Player user) {
		userDaoImpl.update(user);
	}

	@Override
	public void remove(Player user) {
		userDaoImpl.delete(user);
	}
}
