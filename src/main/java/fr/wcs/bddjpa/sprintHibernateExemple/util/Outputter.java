package fr.wcs.bddjpa.sprintHibernateExemple.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.wcs.bddjpa.sprintHibernateExemple.entities.User;
import fr.wcs.bddjpa.sprintHibernateExemple.repositories.UserDao;

@Component
public class Outputter implements CommandLineRunner {

	private Logger LOG = LoggerFactory.getLogger("Wilder");
	
	@Autowired
	private UserDao repo;
	
	public Outputter() {
	}
	
	public UserDao getRepo() {
		return this.repo;
	}

	@Override
	public void run(String... args) throws Exception {
		User usr  = new User("Clems", "Godard", 23);
		User usr2 = new User("Clémence", "Pomme", 22);
		
		this.repo.deleteAll();
		LOG.info("La table User à été vidée");
		
		this.repo.save(usr);
		LOG.info(usr + " à été ajouté à la base");
		
		usr.setFirstName("Clémence");
		usr.setLastName("Pommer");
		this.repo.save(usr);
		LOG.info(usr + " à été modifié dans la base");
		
		
		this.repo.save(usr2);
		LOG.info(usr2 + " à été ajouté");
		
		LOG.info("La base contient " + this.repo.count() + " occurences");
		
		List<User> l = this.repo.findAll();
		
		for (User us : l) {
			LOG.info(us.getFirstName() + " - " + us.getLastName());
		}
	}
}
