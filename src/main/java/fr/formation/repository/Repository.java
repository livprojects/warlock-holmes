package fr.formation.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

	Optional<T> get(int id);
	List<T> getAll();
	void add(T t);
	void update(T t);
	void remove(T t);
}
