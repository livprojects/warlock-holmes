package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.formation.dao.impl.CurrentCaseDaoImpl;
import fr.formation.models.CurrentCase;
import fr.formation.repository.CurrentCaseRepository;

@Repository
public class CurrentCaseRepositoryImpl implements CurrentCaseRepository {

	@Autowired
	private CurrentCaseDaoImpl currentCaseDaoImpl;

	@Override
	public Optional<CurrentCase> get(int id) {
		return currentCaseDaoImpl.get(id);
	}

	@Override
	public List<CurrentCase> getAll() {
		return currentCaseDaoImpl.getAll();
	}

	@Override
	public void add(CurrentCase affaire) {
		currentCaseDaoImpl.add(affaire);
	}

	@Override
	public void update(CurrentCase affaire) {
		currentCaseDaoImpl.update(affaire);
	}

	@Override
	public void remove(CurrentCase affaire) {
		currentCaseDaoImpl.delete(affaire);
	}
}