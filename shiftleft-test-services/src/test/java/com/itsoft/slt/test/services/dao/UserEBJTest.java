package com.itsoft.slt.test.services.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.ejb.embeddable.EJBContainer;

import org.junit.Before;
import org.junit.Test;

import com.itsoft.slt.entities.User;
import com.itsoft.slt.service.IServiceLocal;

public class UserEBJTest {
	EJBContainer container;
	private IServiceLocal<User> userService;

	@Before
	public void init() throws Exception {
		container = EJBContainerSinglenton.getInstance(); // EJBContainer.createEJBContainer();
		
		userService = (IServiceLocal<User>) container
				.getContext()
				.lookup("java:global/classes/UserServiceImpl!com.itsoft.slt.service.IServiceLocal");

	}

	@Test
	public void verify_find_all_users() {

		assertNotNull(userService);

		List<User> users = (List<User>) userService.findAll();
		assertNotNull(users);

		assertTrue(users.size() == 2);

	}
}
