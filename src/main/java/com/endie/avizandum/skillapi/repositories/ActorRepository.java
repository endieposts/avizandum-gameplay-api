package com.endie.avizandum.skillapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.endie.avizandum.skillapi.model.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
	
	List<Actor> findAll();
	Actor findOneById(@Param("id") Long id);
}

