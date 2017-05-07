package com.org.pfa.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_GRP",
discriminatorType=DiscriminatorType.STRING,length=4)
public class Groupes implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_groupe;
	private String nomgroupe;
	//creer un table Admin groupe avec id_user et id_groupe
	@ManyToMany
	@JoinTable(name="Admin_GR",joinColumns=@JoinColumn(name="CODE_GRP")
	,inverseJoinColumns=@JoinColumn(name="CODE_ADM"))
	private User admin;
	//creer un table membre groupe avec id_user et id_groupe
	@ManyToMany
	@JoinTable(name="MEMBRE_GR",joinColumns=@JoinColumn(name="CODE_GRP")
	,inverseJoinColumns=@JoinColumn(name="CODE_USR"))
	private User usersimple;
	
	
	public long getId_groupe() {
		return id_groupe;
	}
	public void setId_groupe(long id_groupe) {
		this.id_groupe = id_groupe;
	}
	public String getNomgroupe() {
		return nomgroupe;
	}
	public void setNomgroupe(String nomgroupe) {
		this.nomgroupe = nomgroupe;
	}
	
	public User getAdmin() {
		return admin;
	}
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	public Groupes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User getUsersimple() {
		return usersimple;
	}
	public void setUsersimple(User usersimple) {
		this.usersimple = usersimple;
	}
	public Groupes(long id_groupe, String nomgroupe) {
		super();
		this.id_groupe = id_groupe;
		this.nomgroupe = nomgroupe;
	}
	
	

}
