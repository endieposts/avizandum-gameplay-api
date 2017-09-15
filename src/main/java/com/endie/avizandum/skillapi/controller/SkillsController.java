package com.endie.avizandum.skillapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.endie.avizandum.skillapi.model.ActorType;
import com.endie.avizandum.skillapi.model.Skill;
import com.endie.avizandum.skillapi.repositories.ActorTypeRepository;
import com.endie.avizandum.skillapi.repositories.SkillRepository;

@RestController
public class SkillsController {
	
	@Autowired
	SkillRepository skillRepository;
	
	@Autowired
	ActorTypeRepository actorTypeRepository;

	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<Skill> getAllSkills(){
		
		List<Skill> skills = skillRepository.findAll();
		
		return skills;
	}

	@RequestMapping(value="/actortype/{actorTypeId}", method = RequestMethod.GET)
	public List<Skill> getAllSkillsByActorType(@PathVariable Long actorTypeId){
		
		ActorType actorType = actorTypeRepository.findOneById(actorTypeId);
		
		return (List<Skill>) actorType.getAllowedSkills();
	}
	
	@RequestMapping(value="/{skillId}", method = RequestMethod.GET)
	public Skill getSkill(@PathVariable Long skillId){
		
		Skill skill = skillRepository.findOneById(skillId);
		
		return skill;
	}

	
	@RequestMapping(value="/actortypes/{skillId}", method = RequestMethod.GET)
	public List<ActorType> getActorTypesForSkill(@PathVariable Long skillId){
		
		Skill skill = skillRepository.findOneById(skillId);
		
		return (List<ActorType>) skill.getAllowedActorTypes();
	}
}
