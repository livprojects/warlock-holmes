package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.UserDaoImpl;
import fr.formation.models.User;
import fr.formation.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

	private UserDaoImpl caseDaoImpl;

	@Override
	public Optional<User> get(User user) {
		return caseDaoImpl.get(user.getId());
	}

	@Override
	public List<User> getAll() {
		return caseDaoImpl.getAll();
	}

	@Override
	public void add(User user) {
		caseDaoImpl.add(user);
	}

	@Override
	public void update(User user) {
		caseDaoImpl.update(user);
	}

	@Override
	public void remove(User user) {
		caseDaoImpl.delete(user);
	}
}
