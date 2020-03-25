package com.gnb.gnbpetclinic.bootstrap;

import com.gnb.gnbpetclinic.model.Owner;
import com.gnb.gnbpetclinic.model.Vet;
import com.gnb.gnbpetclinic.services.OwnerService;
import com.gnb.gnbpetclinic.services.VetService;
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
    public void run(String... args) throws Exception {
        Owner owner1 =new Owner();
        owner1.setFirstName("Rishi");
        owner1.setLastName("Kinger");
        owner1.setId(1L);
        ownerService.save(owner1);

        owner1 =new Owner();
        owner1.setFirstName("Mohan Kumar");
        owner1.setLastName(" Jha");
        owner1.setId(2L);
        ownerService.save(owner1);

        System.out.println("Done persisiting Owners");

        Vet vet1=new Vet();
        vet1.setFirstName("John");
        vet1.setLastName("Doe");
        vet1.setId(1L);
        vetService.save(vet1);

        vet1=new Vet();
        vet1.setFirstName("Mary");
        vet1.setLastName("Jane");
        vet1.setId(2L);
        vetService.save(vet1);


        System.out.println("Done persisiting Vets");


    }
}
