package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.ClueDaoImpl;
import fr.formation.models.Clue;
import fr.formation.repository.ClueRepository;

public class ClueRepositoryImpl implements ClueRepository {

	private ClueDaoImpl caseDaoImpl;

	@Override
	public Optional<Clue> get(Clue clue) {
		return caseDaoImpl.get(clue.getId());
	}

	@Override
	public List<Clue> getAll() {
		return caseDaoImpl.getAll();
	}

	@Override
	public void add(Clue clue) {
		caseDaoImpl.add(clue);
	}

	@Override
	public void update(Clue clue) {
		caseDaoImpl.update(clue);
	}

	@Override
	public void remove(Clue clue) {
		caseDaoImpl.delete(clue);
	}
}
