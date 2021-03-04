package me.clark.services.map;

import me.clark.models.Owner;
import me.clark.services.OwnerService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
	
	@Override
	public Set<Owner> findALl() {
		return super.findAll();
	}
	
	@Override
	public Owner findByID(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public Owner findByLastName(String lastName) {
		return super.findAll()
						.stream()
						.filter(owner -> owner.getLastname().equalsIgnoreCase(lastName))
						.findFirst()
						.orElse(null);
	}
}