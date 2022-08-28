package pl.tomasz.springpetclinic.services;

import pl.tomasz.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
