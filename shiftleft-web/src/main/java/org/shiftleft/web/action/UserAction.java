package org.shiftleft.web.action;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static Logger log = LoggerFactory.getLogger(UserAction.class);

	private static final long serialVersionUID = 7970481909314786912L;

	private static final String SHOW = "show";

	private String name;
	private String lastname;

	public String input() {
		log.info(getText("user.name"));
		log.info("Executing input method");
		return INPUT;
	}

	public String save() {
		log.info("Saving User");
		return SHOW;
	}

	@Override
	public void validate() {
		super.validate();
		
		if(name == null || StringUtils.isBlank(name)){
			addFieldError("user.name", getText("user.name"));
		}
		
		if(lastname == null || StringUtils.isBlank(lastname)){
			addFieldError("user.lastname", getText("user.lastname"));
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
