package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.SuspectDaoImpl;
import fr.formation.models.Suspect;
import fr.formation.repository.SuspectRepository;

public class SuspectRepositoryImpl implements SuspectRepository {

	private SuspectDaoImpl caseDaoImpl;

	@Override
	public Optional<Suspect> get(Suspect suspect) {
		return caseDaoImpl.get(suspect.getId());
	}

	@Override
	public List<Suspect> getAll() {
		return caseDaoImpl.getAll();
	}

	@Override
	public void add(Suspect suspect) {
		caseDaoImpl.add(suspect);
	}

	@Override
	public void update(Suspect suspect) {
		caseDaoImpl.update(suspect);
	}

	@Override
	public void remove(Suspect suspect) {
		caseDaoImpl.delete(suspect);
	}
}
