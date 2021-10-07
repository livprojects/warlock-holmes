package fr.formation.repository;

import java.util.List;
import java.util.Optional;

import fr.formation.models.User;

public interface UserRepository extends Repository<User>{

	Optional<User> get(User user);
	List<User> getAll();
	void add(User user);
	void update(User user);
	void remove(User user);
	
}
