package com.endie.avizandum.skill.skillapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRAINING_LIST")
public class TrainingEntry {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="actor_id")
	private Actor actor;
	
	@ManyToOne
	@JoinColumn(name="skill_id")
	private Skill skill;
	
	private Integer trainOrder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Integer getTrainOrder() {
		return trainOrder;
	}

	public void setTrainOrder(Integer trainOrder) {
		this.trainOrder = trainOrder;
	}
}
