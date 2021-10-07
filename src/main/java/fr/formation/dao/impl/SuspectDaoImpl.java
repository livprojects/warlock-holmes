package fr.formation.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.formation.dao.SuspectDao;
import fr.formation.models.Suspect;

@Component
public class SuspectDaoImpl implements SuspectDao {

	// TODO 
	//  Vérifier si c'est bon, j'ai suivi ça 
	//  https://www.baeldung.com/java-dao-pattern
	
	@Autowired
	private final EntityManager entityManager = null;
	
	@Override
	public Optional<Suspect> get(int id) {
		return Optional.ofNullable(entityManager.find(Suspect.class, id));
	}

	@Override
	public List<Suspect> getAll() {
		Query query = entityManager.createQuery("SELECT c FROM Suspect c");
        return query.getResultList();
	}
	
	@Override
	public void add(Suspect suspect) {
		entityManager.persist(suspect);
	}
	
	@Override
	public void update(Suspect suspect) {
		entityManager.persist(suspect);
	}

	@Override
	public void delete(Suspect suspect) {
		entityManager.remove(suspect);				
	}

}
