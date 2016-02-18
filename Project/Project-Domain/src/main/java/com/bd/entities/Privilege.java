package com.bd.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "t_privilege")
public class Privilege  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String privilege;
	
	@ManyToMany(mappedBy="privileges")
	private List<Role> roles;
	
	@ManyToMany
	private List<Permission> permissions;
	
	@ManyToOne
	@JoinColumn(name="privilege_parent")
	private Privilege privilegeParent;
	
	

	public Privilege() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
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

	public Privilege getPrivilegeParent() {
		return privilegeParent;
	}

	public void setPrivilegeParent(Privilege privilegeParent) {
		this.privilegeParent = privilegeParent;
	}
	

}
