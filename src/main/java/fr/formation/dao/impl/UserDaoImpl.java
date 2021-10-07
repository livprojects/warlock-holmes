package fr.formation.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.formation.dao.UserDao;
import fr.formation.models.User;

@Component
public class UserDaoImpl implements UserDao {

	// TODO 
	//  Vérifier si c'est bon, j'ai suivi ça 
	//  https://www.baeldung.com/java-dao-pattern
	
	@Autowired
	private final EntityManager entityManager = null;
	
	@Override
	public Optional<User> get(int id) {
		return Optional.ofNullable(entityManager.find(User.class, id));
	}

	@Override
	public List<User> getAll() {
		Query query = entityManager.createQuery("SELECT c FROM User c");
        return query.getResultList();
	}
	
	@Override
	public void add(User user) {
		entityManager.persist(user);
	}
	
	@Override
	public void update(User user) {
		entityManager.persist(user);
	}

	@Override
	public void delete(User user) {
		entityManager.remove(user);				
	}

}
