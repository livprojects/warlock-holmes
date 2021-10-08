package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.SuspectDaoImpl;
import fr.formation.models.Suspect;
import fr.formation.repository.SuspectRepository;

public class SuspectRepositoryImpl implements SuspectRepository {

	private SuspectDaoImpl suspectDaoImpl;

	@Override
	public Optional<Suspect> get(int id) {
		return suspectDaoImpl.get(id);
	}

	@Override
	public List<Suspect> getAll() {
		return suspectDaoImpl.getAll();
	}

	@Override
	public void add(Suspect suspect) {
		suspectDaoImpl.add(suspect);
	}

	@Override
	public void update(Suspect suspect) {
		suspectDaoImpl.update(suspect);
	}

	@Override
	public void remove(Suspect suspect) {
		suspectDaoImpl.delete(suspect);
	}
}
