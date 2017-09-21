package com.endie.avizandum.skillapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.endie.avizandum.skillapi.model.ActorType;

@Repository
public interface ActorTypeRepository extends JpaRepository<ActorType, Long> {
	
	List<ActorType> findAll();
	
	ActorType findOneById(@Param("id") Long id);
}

