package fr.formation.dao;

import java.util.Collection;
import java.util.Optional;

import fr.formation.models.User;

public interface UserDao {

	Optional<User> get(int id);
    Collection<User> getAll();
	void add(User user);
	void update(User user);
	void delete(User user);
}
