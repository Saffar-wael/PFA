package com.org.pfa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Invitation implements Serializable {
	
	private Long id_inv;
	private Date dateinv;
	@ManyToOne
	@JoinColumn(name="CODE_EXP")
	private User user;
	public Long getId_inv() {
		return id_inv;
	}
	public void setId_inv(Long id_inv) {
		this.id_inv = id_inv;
	}
	public Date getDateinv() {
		return dateinv;
	}
	public void setDateinv(Date dateinv) {
		this.dateinv = dateinv;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Invitation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invitation(Long id_inv, Date dateinv) {
		super();
		this.id_inv = id_inv;
		this.dateinv = dateinv;
	}
	

}
