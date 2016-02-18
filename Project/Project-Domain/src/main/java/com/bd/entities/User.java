package com.bd.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
 
public class User implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String pwd;
	private String login;	
	private String name;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String cin;
	private String email;
	private String competence;
	private Boolean first_login;
	private Boolean acount_activated;
	private Boolean acount_bloqued;
	
	@ManyToMany(cascade={CascadeType.MERGE,CascadeType.PERSIST})
	private List<Projet> projets;
	
	@OneToMany(mappedBy="user",cascade={CascadeType.REMOVE})
	private List<Role> roles;
	
	
	@OneToMany(mappedBy="user",cascade={CascadeType.REMOVE})
	private List<Permission> permissions;
	
	@Lob
	@Basic(fetch=FetchType.LAZY)
	private byte[] photo;
	
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private Administration administration;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCompetence() {
		return competence;
	}


	public void setCompetence(String competence) {
		this.competence = competence;
	}


	public Boolean getFirst_login() {
		return first_login;
	}


	public void setFirst_login(Boolean first_login) {
		this.first_login = first_login;
	}


	public Boolean getAcount_activated() {
		return acount_activated;
	}


	public void setAcount_activated(Boolean acount_activated) {
		this.acount_activated = acount_activated;
	}


	public Boolean getAcount_bloqued() {
		return acount_bloqued;
	}


	public void setAcount_bloqued(Boolean acount_bloqued) {
		this.acount_bloqued = acount_bloqued;
	}


	public List<Projet> getProjets() {
		return projets;
	}


	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public List<Permission> getPermissions() {
		return permissions;
	}


	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}


	public byte[] getPhoto() {
		return photo;
	}


	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String pwd, String login) {
		super();
		this.pwd = pwd;
		this.login = login;
	}


	public Administration getAdministration() {
		return administration;
	}


	public void setAdministration(Administration administration) {
		this.administration = administration;
	}


	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
