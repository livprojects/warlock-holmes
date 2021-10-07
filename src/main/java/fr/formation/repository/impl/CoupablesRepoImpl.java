package fr.formation.repository.impl;

import java.util.ArrayList;

import fr.formation.models.Coupable;
import fr.formation.repository.CoupablesRepository;

public class CoupablesRepoImpl implements CoupablesRepository {

	@Override
	public Coupable get(int id) {
		Coupable coupable = coupableDaoImpl.read(id);
		return coupable;
	}

	@Override
	public ArrayList<Coupable> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Coupable coupable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Coupable coupable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Coupable coupable) {
		// TODO Auto-generated method stub
		
	}
	
}
