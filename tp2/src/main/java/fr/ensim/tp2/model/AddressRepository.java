package fr.ensim.tp2.model;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AddressRepository extends CrudRepository < Address , Long >{
}
