package com.endie.avizandum.skill.skillapi.repositories;

import com.endie.avizandum.classlib.model.world.GeographicFeature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeographicFeatureRepository extends CrudRepository<GeographicFeature, Long> {

    List<GeographicFeature> findAll();
}
