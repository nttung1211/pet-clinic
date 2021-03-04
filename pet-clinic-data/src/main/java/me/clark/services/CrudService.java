package me.clark.services;

import java.util.Set;

public interface CrudService<T, ID> {
	Set<T> findALl();
	T findByID(ID id);
	T save(T object);
	void delete(T object);
	void deleteById(ID id);
}
