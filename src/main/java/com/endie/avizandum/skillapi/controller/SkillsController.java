package com.endie.avizandum.skillapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.endie.avizandum.skillapi.model.Actor;
import com.endie.avizandum.skillapi.model.Skill;
import com.endie.avizandum.skillapi.repositories.ActorRepository;
import com.endie.avizandum.skillapi.repositories.SkillRepository;

@RestController
public class SkillsController {
	
	@Autowired
	SkillRepository skillRepository;
	
	@Autowired
	ActorRepository actorRepository;

	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<Skill> getAllSkills(){
		
		List<Skill> skills = skillRepository.findAll();
		
		return skills;
	}

	@RequestMapping(value="/actor/{actorId}", method = RequestMethod.GET)
	public List<Skill> getAllSkillsByActor(@PathVariable Long actorId){
		
		Actor actor = actorRepository.findOneById(actorId);
		
		return (List<Skill>) actor.getAllowedSkills();
	}
	
	@RequestMapping(value="/{skillId}", method = RequestMethod.GET)
	public Skill getSkill(@PathVariable Long skillId){
		
		Skill skill = skillRepository.findOneById(skillId);
		
		return skill;
	}

	
	@RequestMapping(value="/actors/{skillId}", method = RequestMethod.GET)
	public List<Actor> getActorsForSkill(@PathVariable Long skillId){
		
		Skill skill = skillRepository.findOneById(skillId);
		
		return (List<Actor>) skill.getAllowedActors();
	}
}
