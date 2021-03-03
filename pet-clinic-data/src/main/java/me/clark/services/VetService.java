package me.clark.services;

import me.clark.models.Vet;

import java.util.Set;

public interface VetService {
	Vet findByLastName();
	Vet findById();
	Vet save(Vet vet);
	Set<Vet> findAll();
}
