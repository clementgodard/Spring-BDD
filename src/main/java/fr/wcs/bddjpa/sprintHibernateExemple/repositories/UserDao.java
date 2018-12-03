package fr.wcs.bddjpa.sprintHibernateExemple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.wcs.bddjpa.sprintHibernateExemple.entities.User;

public interface UserDao extends JpaRepository<User, Long> {
}
