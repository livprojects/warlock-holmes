package fr.formation.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.formation.dao.ClueDao;
import fr.formation.models.Clue;

@Component
public class ClueDaoImpl implements ClueDao {

	// TODO 
	//  Vérifier si c'est bon, j'ai suivi ça 
	//  https://www.baeldung.com/java-dao-pattern
	
	@Autowired
	private final EntityManager entityManager = null;
	
	@Override
	public Optional<Clue> get(int id) {
		return Optional.ofNullable(entityManager.find(Clue.class, id));
	}

	@Override
	public List<Clue> getAll() {
		Query query = entityManager.createQuery("SELECT c FROM Clue c");
        return query.getResultList();
	}
	
	@Override
	public void add(Clue clue) {
		entityManager.persist(clue);
	}
	
	@Override
	public void update(Clue clue) {
		entityManager.persist(clue);
	}

	@Override
	public void delete(Clue clue) {
		entityManager.remove(clue);				
	}

}
