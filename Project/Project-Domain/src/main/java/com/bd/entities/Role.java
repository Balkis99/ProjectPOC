package com.bd.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * Entity implementation class for Entity: Role
 *
 */
@Entity
@Table(name = "t_role")
public class Role implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String role;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private User user;
	
	@ManyToMany
	private List<Privilege> privileges ;
	
	private static final long serialVersionUID = 1L;

	

	

	public Role() {
		super();
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	

	
	
	

	
	



	
	}


