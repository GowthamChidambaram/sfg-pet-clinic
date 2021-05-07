package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Gowtham C on 08/05/21.
 */
public interface PetService {

  Pet findById(Long id);

  Set<Pet> findAll();

  Pet save(Pet pet);


}
