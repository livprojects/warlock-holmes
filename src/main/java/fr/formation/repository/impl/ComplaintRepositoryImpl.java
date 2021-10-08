package fr.formation.repository.impl;

import java.util.List;
import java.util.Optional;

import fr.formation.dao.impl.ComplaintDaoImpl;
import fr.formation.models.Complaint;
import fr.formation.repository.ComplaintRepository;

public class ComplaintRepositoryImpl implements ComplaintRepository {

	private ComplaintDaoImpl complaintDaoImpl;

	@Override
	public Optional<Complaint> get(int id) {
		return complaintDaoImpl.get(id);
	}

	@Override
	public List<Complaint> getAll() {
		return complaintDaoImpl.getAll();
	}

	@Override
	public void add(Complaint complaint) {
		complaintDaoImpl.add(complaint);
	}

	@Override
	public void update(Complaint complaint) {
		complaintDaoImpl.update(complaint);
	}

	@Override
	public void remove(Complaint complaint) {
		complaintDaoImpl.delete(complaint);
	}
}
