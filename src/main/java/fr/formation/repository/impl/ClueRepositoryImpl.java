package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import fr.formation.dao.impl.ClueDaoImpl;
import fr.formation.models.Clue;
import fr.formation.repository.ClueRepository;

@Repository
public class ClueRepositoryImpl implements ClueRepository {

	private ClueDaoImpl clueDaoImpl;

	@Override
	public Optional<Clue> get(int id) {
		return clueDaoImpl.get(id);
	}

	@Override
	public List<Clue> getAll() {
		return clueDaoImpl.getAll();
	}

	@Override
	public void add(Clue clue) {
		clueDaoImpl.add(clue);
	}

	@Override
	public void update(Clue clue) {
		clueDaoImpl.update(clue);
	}

	@Override
	public void remove(Clue clue) {
		clueDaoImpl.delete(clue);
	}
}
