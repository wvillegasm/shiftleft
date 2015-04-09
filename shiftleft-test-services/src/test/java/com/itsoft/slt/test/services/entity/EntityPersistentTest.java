package com.itsoft.slt.test.services.entity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itsoft.slt.entities.User;

/**
 * 
 * @author wilfredo
 * The persistence unit must be RESOURCE_LOCAL,
 * WAS must be stopped.
 */

public class EntityPersistentTest {

	static EntityManager em;
	static EntityManagerFactory emf;
	static EntityTransaction et;
	
	Logger log = LoggerFactory.getLogger(EntityPersistentTest.class);
	
	@BeforeClass
	public static void init() throws Exception{
		
		emf = Persistence.createEntityManagerFactory("SLTPu", getLocalTransactionPU());
		
	}

	/**
	 * @return
	 */
	private static Properties getLocalTransactionPU() {
		Properties properties = new Properties();
        properties.put("javax.persistence.provider", "org.hibernate.ejb.HibernatePersistence");
        properties.put("javax.persistence.transactionType", "RESOURCE_LOCAL");
        properties.put("hibernate.connection.username", "APP");
        properties.put("hibernate.connection.password", "APP");
        properties.put("hibernate.connection.driver_class", "org.apache.derby.jdbc.ClientDriver");
        properties.put("hibernate.connection.url", "jdbc:derby://localhost:1527/PersonaServDB;create=true");
        properties.put("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.generateDdl", "true");
        properties.put("hibernate.hbm2ddl.auto", "true");
		return properties;
	}
	
	@Before
	public void septup() throws Exception{
		em = emf.createEntityManager();
	}
	
	@Test
	public void verify_persistence_of_user_entity_in_database() {
		log.info("Starting Persistence of User Entity");
		assertNotNull(em);
		assertNotNull(emf);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		User u = new User("alicem","Alice", "Doe");
		
		assertNull(u.getUserId());
		em.persist(u);
		
		tx.commit();
		
		assertNotNull(u.getUserId());
		
	}

}
