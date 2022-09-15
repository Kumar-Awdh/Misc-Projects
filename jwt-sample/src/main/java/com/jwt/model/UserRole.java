package com.jwt.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name="user_role")
public class UserRole {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userRoleId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User mappedUser;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="role_id")
	private Role mappedRole;
	
	public UserRole() {
		
	}
	public UserRole(User mappedUser, Role mappedRole) {
		this.mappedUser = mappedUser;
		this.mappedRole = mappedRole;
	}

	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	

	public User getMappedUser() {
		return mappedUser;
	}
	public void setMappedUser(User mappedUser) {
		this.mappedUser = mappedUser;
	}
	public Role getMappedRole() {
		return mappedRole;
	}
	public void setMappedRole(Role mappedRole) {
		this.mappedRole = mappedRole;
	}
	
	
	
}
