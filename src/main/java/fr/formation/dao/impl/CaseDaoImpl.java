package fr.formation.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.formation.dao.CaseDao;
import fr.formation.models.Case;

@Component
public class CaseDaoImpl implements CaseDao {

	// TODO 
	//  Vérifier si c'est bon, j'ai suivi ça 
	//  https://www.baeldung.com/java-dao-pattern
	
	@Autowired
	private final EntityManager entityManager = null;
	
	@Override
	public Optional<Case> get(int id) {
		return Optional.ofNullable(entityManager.find(Case.class, id));
	}

	@Override
	public List<Case> getAll() {
		Query query = entityManager.createQuery("SELECT c FROM Case c");
        return query.getResultList();
	}
	
	@Override
	public void add(Case affaire) {
		entityManager.persist(affaire);
	}
	
	@Override
	public void update(Case affaire) {
		entityManager.persist(affaire);
	}

	@Override
	public void delete(Case affaire) {
		entityManager.remove(affaire);				
	}

}
