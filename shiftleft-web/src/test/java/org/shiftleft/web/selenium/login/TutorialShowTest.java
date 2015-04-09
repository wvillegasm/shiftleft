package org.shiftleft.web.selenium.login;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TutorialShowTest {

	private static WebDriver driver;
	
	@Before
	public void init(){
		driver = new HtmlUnitDriver();
		driver.navigate().to("http://localhost:8080/shiftleft-web/tutorial_show.action");
	}
	
	@Test
	public void varify_title_for_tutorial_show(){		
		assertTrue("No expected title received", driver.getTitle().equals("Show Tutorial"));
	}
	
	
	@After
	public void shutdown(){
		driver.close();
		driver.quit();
	}
	
}
