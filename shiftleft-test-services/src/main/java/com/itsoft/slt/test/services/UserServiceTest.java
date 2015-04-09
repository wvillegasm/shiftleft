package com.itsoft.slt.test.services;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.itsoft.slt.entities.User;
/**
 * 
 * @author wilfredo
 * 
 * WAS Must be started, and ejb application deployed.
 * The EJB must be deployed into the WAS
 */
public class UserServiceTest {
	public static void main(String[] args) {
		/*try {

			Context ctx = new InitialContext();
			IServiceRemote<User> serviceRemoteImpl = (IServiceRemote<User>) ctx
					.lookup("java:global/shiftleft-logic/UserServiceImpl!com.itsoft.slt.service.IServiceRemote");
			List<User> users = serviceRemoteImpl.findAll();

			for (User user : users) {
				System.out.println(user);
			}

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
