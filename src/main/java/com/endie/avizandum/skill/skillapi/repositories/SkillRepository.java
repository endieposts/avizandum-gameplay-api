package com.endie.avizandum.skill.skillapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.endie.avizandum.classlib.model.skill.Skill;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Long> {
	
	List<Skill> findAll();
	
	Skill findOneById(@Param("id") Long id);
}
