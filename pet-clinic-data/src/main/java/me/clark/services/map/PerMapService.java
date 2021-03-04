package me.clark.services.map;

import me.clark.models.Pet;
import me.clark.services.PetService;

import java.util.Set;

public class PerMapService extends AbstractMapService<Pet, Long> implements PetService {
	
	@Override
	public Set<Pet> findALl() {
		return super.findAll();
	}
	
	@Override
	public Pet findByID(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
