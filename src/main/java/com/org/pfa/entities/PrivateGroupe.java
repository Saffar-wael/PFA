package com.org.pfa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PG")
public class PrivateGroupe extends Groupes {

	public PrivateGroupe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrivateGroupe(long id_groupe, String nomgroupe) {
		super(id_groupe, nomgroupe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PrivateGroupe";
	}
	

}
