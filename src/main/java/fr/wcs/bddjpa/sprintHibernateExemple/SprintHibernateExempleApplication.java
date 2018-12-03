package fr.wcs.bddjpa.sprintHibernateExemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wcs.bddjpa.sprintHibernateExemple.entities.User;
import fr.wcs.bddjpa.sprintHibernateExemple.repositories.UserDao;
import fr.wcs.bddjpa.sprintHibernateExemple.util.Outputter;
import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

@SpringBootApplication
public class SprintHibernateExempleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintHibernateExempleApplication.class, args);
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:app.xml");
        
        // UserBdd bdd = new UserBdd();
        
//        Outputter bdd = context.getBean("out", Outputter.class);
//        
//		User usr = new User("Clément", "Godard", 23);
//		
//		System.out.println(usr);
//		
//		bdd.getRepo().save(usr);
//		
//		System.out.println("Enregistrer en bdd");
        
//        UserBdd test = new UserBdd();
//        
//        test.testSave();
	}
}
