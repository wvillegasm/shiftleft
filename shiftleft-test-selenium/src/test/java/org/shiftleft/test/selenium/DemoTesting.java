package org.shiftleft.test.selenium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTesting {

	static Logger log = LoggerFactory.getLogger(DemoTesting.class);

	@BeforeSuite
	public void beforeSuite() {
		log.info("Before Suite Method");
	}

	@AfterSuite
	public void afterSuite() {
		log.info("After Suite Method");
	}

	@BeforeTest
	public void beforeTest() {
		log.info("Before Test");
	}

	@AfterTest
	public void afterTest() {
		log.info("After Test");
	}

	@BeforeClass
	public void beforeClass() {
		log.info("Before Class");
	}

	@AfterClass
	public void afterClass() {
		log.info("After Class");
	}

	@BeforeGroups(groups={"LoginTest"})
	public void beforeGroups() {
		log.info("Before Groups");
	}

	@AfterGroups(groups={"LoginTest"})
	public void afterGroups() {
		log.info("AfterGroups");
	}

	@Test
	public void just_first_test() {
		AssertJUnit.assertTrue(false);
	}

	@Test(groups={"LoginTest"})
	public void login_validation_test() {
		log.info("Login Validation testing");
	}

	@Test(groups={"LoginTest"})
	public void login_message_in_wrong_password_test() {
		log.info("Wrong password testing");
	}

	@Test(groups={"LoginTest"})
	public void login_message_in_wrong_username_test() {
		log.info("Wrong username testing");
	}
}
