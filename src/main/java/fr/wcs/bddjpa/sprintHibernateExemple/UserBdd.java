package fr.wcs.bddjpa.sprintHibernateExemple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import fr.wcs.bddjpa.sprintHibernateExemple.entities.User;
import fr.wcs.bddjpa.sprintHibernateExemple.repositories.UserDao;

public class UserBdd {

	@Autowired
	private UserDao bdd;
	
	public UserBdd() {
		User usr = new User("Clément", "Godard", 23);
		System.out.println("Attempt saving !");
		this.bdd.save(usr);
	}
}
