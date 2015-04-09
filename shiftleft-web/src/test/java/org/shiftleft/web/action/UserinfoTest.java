package org.shiftleft.web.action;

import org.shiftleft.web.example.ConfigTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.config.entities.ActionConfig;

public class UserinfoTest extends ConfigTest {
	
	private static final Logger log = LoggerFactory.getLogger(UserinfoTest.class);

	public void _testLoginConfig() throws Exception {
		ActionConfig config = assertClass("/", "tutorial_show",
				"org.shiftleft.web.action.UserinfoAction");
		assertResult(config, UserinfoAction.SHOW, "/user/show.jsp");
		//assertResult(config, ActionSupport.INPUT, "/example/Login.jsp");
	}

	public void test_show() throws Exception {
		UserinfoAction userinfo = new UserinfoAction();
		//login.setUsername("username");
		//login.setPassword("password");
		String result = userinfo.show();
		
		assertShow(result);
	}

	// Needs access to an envinronment that includes validators
	/*public void FIXME_testLoginSubmitInput() throws Exception {
		Login login = new Login();
		String result = login.execute();
		assertInput(result);
		Map errors = assertFieldErrors(login);
		assertFieldError(errors, "username", "Username is required.");
		assertFieldError(errors, "password", "Password is required.");
	}*/
}
