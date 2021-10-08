package fr.formation.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.formation.dao.ComplaintDao;
import fr.formation.models.Complaint;

@Component
public class ComplaintDaoImpl implements ComplaintDao {

	// TODO 
	//  Vérifier si c'est bon, j'ai suivi ça 
	//  https://www.baeldung.com/java-dao-pattern
	
	@Autowired
	private final EntityManager entityManager = null;
	
	@Override
	public Optional<Complaint> get(int id) {
		return Optional.ofNullable(entityManager.find(Complaint.class, id));
	}

	@Override
	public List<Complaint> getAll() {
		
		System.out.println();
		Query query = entityManager.createQuery("SELECT c FROM Complaint c");
        return query.getResultList();
	}
	
	@Override
	public void add(Complaint complaint) {
		entityManager.persist(complaint);
	}
	
	@Override
	public void update(Complaint complaint) {
		entityManager.persist(complaint);
	}

	@Override
	public void delete(Complaint complaint) {
		entityManager.remove(complaint);				
	}

}
