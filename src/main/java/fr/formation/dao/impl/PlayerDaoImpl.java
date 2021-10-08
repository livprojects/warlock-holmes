package fr.formation.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.formation.dao.PlayerDao;
import fr.formation.models.Player;

@Component
public class PlayerDaoImpl implements PlayerDao {

	// TODO 
	//  Vérifier si c'est bon, j'ai suivi ça 
	//  https://www.baeldung.com/java-dao-pattern
	
	@Autowired
	private final EntityManager entityManager = null;
	
	@Override
	public Optional<Player> get(int id) {
		return Optional.ofNullable(entityManager.find(Player.class, id));
	}

	@Override
	public List<Player> getAll() {
		Query query = entityManager.createQuery("SELECT c FROM User c");
        return query.getResultList();
	}
	
	@Override
	public void add(Player user) {
		entityManager.persist(user);
	}
	
	@Override
	public void update(Player user) {
		entityManager.persist(user);
	}

	@Override
	public void delete(Player user) {
		entityManager.remove(user);				
	}

}
