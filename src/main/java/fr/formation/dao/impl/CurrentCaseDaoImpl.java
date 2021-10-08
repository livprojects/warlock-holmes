package fr.formation.dao.impl;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.formation.dao.CurrentCaseDao;
import fr.formation.models.CurrentCase;


@Component
public class CurrentCaseDaoImpl implements CurrentCaseDao {

	// TODO 
	//  Vérifier si c'est bon, j'ai suivi ça 
	//  https://www.baeldung.com/java-dao-pattern
	
	@Autowired
	private final EntityManager entityManager = null;
	
	@Override
	public Optional<CurrentCase> get(int id) {
		return Optional.ofNullable(entityManager.find(CurrentCase.class, id));
	}

	@Override
	public List<CurrentCase> getAll() {
		Query query = entityManager.createQuery("SELECT c FROM CurrentCase c");
        return query.getResultList();
	}
	
	@Override
	public void add(CurrentCase affaire) {
		entityManager.persist(affaire);
	}
	
	@Override
	public void update(CurrentCase affaire) {
		entityManager.persist(affaire);
	}

	@Override
	public void delete(CurrentCase affaire) {
		entityManager.remove(affaire);				
	}

}