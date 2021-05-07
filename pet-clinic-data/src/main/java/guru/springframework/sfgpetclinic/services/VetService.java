package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Gowtham C on 08/05/21.
 */
public interface VetService {

  Vet findById(Long id);

  Set<Vet> findAll();

  Vet save(Vet vet);


}
