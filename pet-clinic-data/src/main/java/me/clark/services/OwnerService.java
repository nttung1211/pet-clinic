package me.clark.services;

import me.clark.models.Owner;

import java.util.Set;

public interface OwnerService {
	Owner findByLastName();
	Owner findById();
	Owner save(Owner owner);
	Set<Owner> findAll();
}
