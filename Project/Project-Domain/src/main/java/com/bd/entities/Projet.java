package com.bd.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * Entity implementation class for Entity: Projet
 *
 */

@Entity
@Table(name="t_projet")
public class Projet implements Serializable {

	@Id    
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	private String name;
	private String subject;
	private String state;
	
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	private Date start_date;
	
	@Column(name="end_creation")
	@Temporal(TemporalType.DATE)
	private Date end_date;
	
	
	@ManyToMany(mappedBy="projets")
	private List<User> users;
	
	@OneToMany(mappedBy="projet",cascade={CascadeType.REMOVE})
	private List<Task> task ;
	
	
	
	private static final long serialVersionUID = 1L;
	

	public Projet() {
		super();
	}   
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	

	
	public Projet(String name, Date start_date, Date end_date, String subject,
			String state) {
		super();
		this.name = name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.subject = subject;
		this.state = state;
	}

	

	
	}   
	
	
	

