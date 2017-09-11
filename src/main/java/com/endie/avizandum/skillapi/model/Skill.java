package com.endie.avizandum.skillapi.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.endie.avizandum.skillapi.model.deserializers.AllowedActorsListDeserializer;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@Entity
@Table(name="SKILLS")
public class Skill {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer difficulty;
	
	@ManyToMany
	@JsonManagedReference
	private Collection<Actor> allowedActors;
	
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

	public void setAllowedActors(Collection<Actor> allowedActors) {
		this.allowedActors = allowedActors;
	}

	public Collection<Actor> getAllowedActors() {
		return allowedActors;
	}

	public Skill() {
		this.allowedActors = new ArrayList<Actor>();
	}
}
