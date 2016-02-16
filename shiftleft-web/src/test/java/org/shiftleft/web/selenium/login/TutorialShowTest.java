package org.shiftleft.web.selenium.login;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TutorialShowTest {

	private static final String PAGE = "tutorial_show.action";
	private static final String SITE = "http://localhost:8080/shiftleft-web/";

	private static WebDriver driver;

	@Before
	public void init() {
		driver = new HtmlUnitDriver();
		driver.navigate().to(SITE + PAGE);
	}

	@Test
	public void varify_title_for_tutorial_show() {
		assertTrue(
				String.format(
						"The title for %s do not match with the expected title.",
						PAGE), driver.getTitle().equals("Show Tutorial"));
	}

	@After
	public void shutdown() {
		driver.close();
		driver.quit();
	}

}
