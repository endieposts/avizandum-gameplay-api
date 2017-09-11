package com.endie.avizandum.skillapi.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="ACTORS")
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String className;
	
	@ManyToMany(mappedBy = "allowedActors")
	@JsonBackReference
	private List<Skill> allowedSkills;
	
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
	
	public Actor() {
		this.allowedSkills = new ArrayList<Skill>();
	}
	
}
