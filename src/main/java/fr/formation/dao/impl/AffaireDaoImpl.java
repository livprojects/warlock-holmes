package fr.formation.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.formation.dao.AffaireDao;
import fr.formation.models.Affaire;

@Component
public class AffaireDaoImpl implements AffaireDao {

	// TODO 
	//  Vérifier si c'est bon, j'ai suivi ça 
	//  https://www.baeldung.com/java-dao-pattern
	
	@Autowired
	private final EntityManager entityManager = null;
	
	@Override
	public Optional<Affaire> get(int id) {
		return Optional.ofNullable(entityManager.find(Affaire.class, id));
	}

	@Override
	public List<Affaire> getAll() {
		Query query = entityManager.createQuery("SELECT c FROM Affaire c");
        return query.getResultList();
	}
	
	@Override
	public void add(Affaire affaire) {
		entityManager.persist(affaire);
	}
	
	@Override
	public void update(Affaire affaire) {
		entityManager.persist(affaire);
	}

	@Override
	public void delete(Affaire affaire) {
		entityManager.remove(affaire);				
	}

}
