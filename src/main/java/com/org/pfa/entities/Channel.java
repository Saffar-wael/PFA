package com.org.pfa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CH")
public class Channel extends Groupes {


	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Channel(long id_groupe, String nomgroupe, long code) {
		super(id_groupe, nomgroupe);
		
	}

	@Override
	public String toString() {
		return "Channel";
	}

	

	
		
	

}
