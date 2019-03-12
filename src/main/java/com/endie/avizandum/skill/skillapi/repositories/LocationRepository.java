package com.endie.avizandum.skill.skillapi.repositories;

import com.endie.avizandum.skill.skillapi.model.world.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {

    List<Location> findAll();

}
