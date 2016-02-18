package com.bd.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="t_task")
public class Task implements Serializable{
	
	@Id    
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	private String name;
	private String state;
	private String description;
	private Integer duration;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private Projet projet;
	
	@OneToMany(mappedBy="task",cascade={CascadeType.REMOVE})
	private List<Advancement> advancements;
	
	private static final long serialVersionUID = 1L;
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(String name, String state, String description,
			Integer duration, Projet projet) {
		super();
		this.name = name;
		this.state = state;
		this.description = description;
		this.duration = duration;
		this.projet = projet;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
	
	

}
