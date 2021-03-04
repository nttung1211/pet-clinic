package me.clark.services.map;

import me.clark.models.Vet;
import me.clark.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
	@Override
	public Set<Vet> findALl() {
		return super.findAll();
	}
	
	@Override
	public Vet findByID(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public Vet findByLastName(String lastname) {
		return super.findAll()
						.stream()
						.filter(vet -> vet.getLastname().equalsIgnoreCase(lastname))
						.findFirst()
						.orElse(null);
	}
}
