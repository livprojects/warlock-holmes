package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.AffaireDaoImpl;
import fr.formation.models.Affaire;
import fr.formation.repository.AffaireRepository;

public class AffaireRepositoryImpl implements AffaireRepository {

	private AffaireDaoImpl affaireDaoImpl;

	@Override
	public Optional<Affaire> get(int id) {
		return affaireDaoImpl.get(id);
	}

	@Override
	public List<Affaire> getAll() {
		return affaireDaoImpl.getAll();
	}

	@Override
	public void add(Affaire affaire) {
		affaireDaoImpl.add(affaire);
	}

	@Override
	public void update(Affaire affaire) {
		affaireDaoImpl.update(affaire);
	}

	@Override
	public void remove(Affaire affaire) {
		affaireDaoImpl.delete(affaire);
	}
}
