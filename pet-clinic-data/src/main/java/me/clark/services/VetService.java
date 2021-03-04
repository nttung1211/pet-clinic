package me.clark.services;

import me.clark.models.Vet;


public interface VetService extends CrudService<Vet, Long> {
	Vet findByLastName(String lastName);
}
