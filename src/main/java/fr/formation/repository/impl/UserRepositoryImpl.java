package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.UserDaoImpl;
import fr.formation.models.User;
import fr.formation.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

	private UserDaoImpl userDaoImpl;

	@Override
	public Optional<User> get(int id) {
		return userDaoImpl.get(id);
	}

	@Override
	public List<User> getAll() {
		return userDaoImpl.getAll();
	}

	@Override
	public void add(User user) {
		userDaoImpl.add(user);
	}

	@Override
	public void update(User user) {
		userDaoImpl.update(user);
	}

	@Override
	public void remove(User user) {
		userDaoImpl.delete(user);
	}
}
