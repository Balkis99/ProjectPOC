package com.bd.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "t_advancement")
public class Administration implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
	private String label_fr;
	private String label_en;
	
	@ManyToOne
	@JoinColumn(name="administration_sup")
	private Administration administrationSup;
	
	@OneToMany(mappedBy="administration",cascade={CascadeType.REMOVE})
	private List<User> users;

	public Administration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel_fr() {
		return label_fr;
	}

	public void setLabel_fr(String label_fr) {
		this.label_fr = label_fr;
	}

	public String getLabel_en() {
		return label_en;
	}

	public void setLabel_en(String label_en) {
		this.label_en = label_en;
	}

	public Administration getAdministrationSup() {
		return administrationSup;
	}

	public void setAdministrationSup(Administration administrationSup) {
		this.administrationSup = administrationSup;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
}
