package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.ComplaintDaoImpl;
import fr.formation.models.Complaint;
import fr.formation.repository.ComplaintRepository;

public class ComplaintRepositoryImpl implements ComplaintRepository {

	private ComplaintDaoImpl caseDaoImpl;

	@Override
	public Optional<Complaint> get(Complaint complaint) {
		return caseDaoImpl.get(complaint.getId());
	}

	@Override
	public List<Complaint> getAll() {
		return caseDaoImpl.getAll();
	}

	@Override
	public void add(Complaint complaint) {
		caseDaoImpl.add(complaint);
	}

	@Override
	public void update(Complaint complaint) {
		caseDaoImpl.update(complaint);
	}

	@Override
	public void remove(Complaint complaint) {
		caseDaoImpl.delete(complaint);
	}
}
