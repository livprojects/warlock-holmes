package fr.formation.repository;

import java.util.ArrayList;
import fr.formation.models.User;

public interface UserRepository {	

	User get(int id);
	ArrayList<User> getAll();
	void add(User user);
	void update(User user);
	void remove(User user);
	
}
