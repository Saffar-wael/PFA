package com.org.pfa.dao;

import com.org.pfa.entities.Groupes;
import com.org.pfa.entities.Statuts;
import com.org.pfa.entities.User;

public interface IPfaDao {
public User addUser (User u);
public Statuts AddStatuts(Statuts s,long id_users);
public Groupes addGroupes(Groupes g);
public void addUserToGroupe(Long id_user,Long id_groupe);
public void addAdminToGroupe(Long id_user,Long id_groupe);
public void blockedUser(Long id_user,Long id_groupe);

}
