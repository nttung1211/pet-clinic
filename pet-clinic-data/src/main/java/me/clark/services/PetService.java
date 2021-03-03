package me.clark.services;

import me.clark.models.Pet;

import java.util.Set;

public interface PetService {
	Pet findById();
	Pet save(Pet pet);
	Set<Pet> findAll();
}
