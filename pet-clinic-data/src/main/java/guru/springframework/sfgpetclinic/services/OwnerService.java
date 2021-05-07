package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Gowtham C on 08/05/21.
 */
public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Set<Owner> findAll();

  Owner save(Owner owner);


}
