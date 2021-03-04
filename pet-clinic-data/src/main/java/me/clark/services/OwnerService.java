package me.clark.services;

import me.clark.models.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
