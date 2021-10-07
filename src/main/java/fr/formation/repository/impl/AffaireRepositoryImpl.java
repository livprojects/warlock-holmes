package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.AffaireDaoImpl;
import fr.formation.models.Affaire;
import fr.formation.repository.AffaireRepository;

public class AffaireRepositoryImpl implements AffaireRepository {

	private AffaireDaoImpl caseDaoImpl;

	@Override
	public Optional<Affaire> get(Affaire affaire) {
		return caseDaoImpl.get(affaire.getMain_id());
	}

	@Override
	public List<Affaire> getAll() {
		return caseDaoImpl.getAll();
	}

	@Override
	public void add(Affaire affaire) {
		caseDaoImpl.add(affaire);
	}

	@Override
	public void update(Affaire affaire) {
		caseDaoImpl.update(affaire);
	}

	@Override
	public void remove(Affaire affaire) {
		caseDaoImpl.delete(affaire);
	}
}
