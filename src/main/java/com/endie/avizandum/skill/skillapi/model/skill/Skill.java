package com.endie.avizandum.skill.skillapi.model.skill;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.endie.avizandum.skill.skillapi.model.actor.ActorType;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="SKILLS")
public class Skill {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@NotNull
	@Size(max = 100)
	private String name;
	private Integer difficulty;
	private String description;
	
	@ManyToMany
	@JsonManagedReference
	private Collection<ActorType> allowedActorTypes;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	public void setAllowedActorTypes(Collection<ActorType> allowedActorTypes) {
		this.allowedActorTypes = allowedActorTypes;
	}

	public Collection<ActorType> getAllowedActorTypes() {
		return allowedActorTypes;
	}

	public Skill() {
		this.allowedActorTypes = new ArrayList<ActorType>();
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
