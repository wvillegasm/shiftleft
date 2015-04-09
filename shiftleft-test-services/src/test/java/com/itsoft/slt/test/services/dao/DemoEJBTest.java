package com.itsoft.slt.test.services.dao;

import static org.junit.Assert.assertEquals;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import org.junit.Before;
import org.junit.Test;

import com.itsoft.slt.service.impl.DemoEJB;

/**
 * 
 * @author wilfredo
 * Due this start a embedded glassfish WAS, then W.A.S. must be stopped.
 * Remember stop all WAS.
 */
public class DemoEJBTest {

	private static EJBContainer container;
	private static Context context;
	private static DemoEJB demoEjb;
	
	
	@Before
	public void init() throws Exception{
		
		container = EJBContainerSinglenton.getInstance(); //EJBContainer.createEJBContainer();
		if(container == null) throw new Exception("Embedded Container is null");
		context = container.getContext();
		demoEjb = (DemoEJB) context.lookup("java:global/classes/DemoEJB!com.itsoft.slt.service.impl.DemoEJB");
		
	}
	
	
	@Test
	public void sum_two_number_demoejb() {
		Integer result = demoEjb.sumInt();
		Integer expected = 5;
		assertEquals(result, expected);
	}

}
