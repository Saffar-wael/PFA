package com.org.pfa.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue
private Long id_user;
private String nom;
private String prenom;
private String email;
private String mdp;
private Date datenaissance;
private String sexe;
private byte[] photo;
private String bio;
private int etat;
@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
private Collection<Statuts> listStatuts;
@ManyToMany
@JoinTable(name="USER_GRP",joinColumns=@JoinColumn(name="CODE_USER")
,inverseJoinColumns=@JoinColumn(name="CODE_GRP"))
private Collection<Groupes> listGroupe;
@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
private Collection<Invitation> listInvi;
//private Collection<Demande> listDemandes;
public Long getCodeuser() {
	return id_user;
}
public void setCodeuser(Long codeuser) {
	id_user = codeuser;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Date getDatenaissance() {
	return datenaissance;
}
public void setDatenaissance(Date datenaissance) {
	this.datenaissance = datenaissance;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}
public byte[] getPhoto() {
	return photo;
}
public void setPhoto(byte[] photo) {
	this.photo = photo;
}
public String getBio() {
	return bio;
}
public void setBio(String bio) {
	this.bio = bio;
}
public int getEtat() {
	return etat;
}
public void setEtat(int etat) {
	this.etat = etat;
}
public Collection<Statuts> getListStatuts() {
	return listStatuts;
}
public void setListStatuts(Collection<Statuts> listStatuts) {
	this.listStatuts = listStatuts;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(String nom, String prenom, Date datenaissance, String sexe, byte[] photo, String bio, int etat) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.datenaissance = datenaissance;
	this.sexe = sexe;
	this.photo = photo;
	this.bio = bio;
	this.etat = etat;
}

}
