package com.org.pfa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Statuts implements Serializable {
	
	private Long id_statut;
	private String StatutText;
	@ManyToOne
	@JoinColumn(name="CODE_USER")
	private User user;
	
	public String getStatutText() {
		return StatutText;
	}
	public void setStatutText(String statutText) {
		StatutText = statutText;
	}
	public long getId_statut() {
		return id_statut;
	}
	public void setId_statut(long id_statut) {
		this.id_statut = id_statut;
		
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Statuts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Statuts(long id_statut, String statutText) {
		super();
		this.id_statut = id_statut;
		StatutText = statutText;
	}
	
}

