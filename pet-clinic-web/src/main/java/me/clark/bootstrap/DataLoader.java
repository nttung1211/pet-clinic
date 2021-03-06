package me.clark.bootstrap;

import me.clark.models.Owner;
import me.clark.models.Vet;
import me.clark.services.OwnerService;
import me.clark.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}
	
	@Override
	public void run(String... args) {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstname("Clark");
		owner1.setFirstname("Kent");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstname("Jane");
		owner2.setFirstname("Doe");
		ownerService.save(owner2);
		
		System.out.println("Loaded owners");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstname("Tung");
		vet1.setLastname("Nguyen");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstname("Mai");
		vet2.setLastname("Ngo");
		vetService.save(vet2);
		
		System.out.println("Loaded vets");
	}
}
