package com.endie.avizandum.skill.skillapi.controller;

import com.endie.avizandum.skill.skillapi.model.ActorType;
import com.endie.avizandum.skill.skillapi.model.Skill;
import com.endie.avizandum.skill.skillapi.model.TrainingEntry;
import com.endie.avizandum.skill.skillapi.repositories.ActorTypeRepository;
import com.endie.avizandum.skill.skillapi.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("skills")
public class SkillsController {

    @Autowired
    SkillRepository skillRepository;

    @Autowired
    ActorTypeRepository actorTypeRepository;

    @GetMapping(value = "/all", produces = "application/json")
    public List<Skill> getAllSkills() {

        List<Skill> skills = skillRepository.findAll();

        return skills;
    }

    @GetMapping(value = "/actortype/{actorTypeId}", produces = "application/json")
    public List<Skill> getAllSkillsByActorType(@PathVariable Long actorTypeId) {

        ActorType actorType = actorTypeRepository.findOneById(actorTypeId);

        return (List<Skill>) actorType.getAllowedSkills();
    }

    @GetMapping(value = "/{skillId}", produces = "application/json")
    public Skill getSkill(@PathVariable Long skillId) {

        return skillRepository.findOneById(skillId);
    }


    @GetMapping(value = "/actortypes/{skillId}", produces = "application/json")
    public List<ActorType> getActorTypesForSkill(@PathVariable Long skillId) {

        Skill skill = skillRepository.findOneById(skillId);

        return (List<ActorType>) skill.getAllowedActorTypes();
    }

    @GetMapping(value = "/actor/{actorId}/traininglist", produces = "application/json")
    public LinkedList<TrainingEntry> getTrainingListForActor(@PathVariable Long actorId) {
        return null;

    }
}
