package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.CaseDaoImpl;
import fr.formation.models.Case;
import fr.formation.repository.CaseRepository;

public class CaseRepositoryImpl implements CaseRepository {

	private CaseDaoImpl caseDaoImpl;

	@Override
	public Optional<Case> get(Case affaire) {
		return caseDaoImpl.get(affaire.getId());
	}

	@Override
	public List<Case> getAll() {
		return caseDaoImpl.getAll();
	}

	@Override
	public void add(Case affaire) {
		caseDaoImpl.add(affaire);
	}

	@Override
	public void update(Case affaire) {
		caseDaoImpl.update(affaire);
	}

	@Override
	public void remove(Case affaire) {
		caseDaoImpl.delete(affaire);
	}
}
