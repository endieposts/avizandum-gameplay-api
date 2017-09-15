package com.endie.avizandum.skillapi.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="ACTOR_TYPES")
public class ActorType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String className;
	private String description;
	
	@ManyToMany(mappedBy = "allowedActors")
	@JsonBackReference
	private List<Skill> allowedSkills;
	
	@OneToMany(mappedBy = "actor")
	private List<TrainingEntry> trainingList;
	
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
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public void setAllowedSkills(List<Skill> allowedSkills) {
		this.allowedSkills = allowedSkills;
	}

	public Collection<Skill> getAllowedSkills() {
		return allowedSkills;
	}
	
	public ActorType() {
		this.allowedSkills = new ArrayList<Skill>();
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
