package org.shiftleft.web.action;

import org.shiftleft.web.dto.AddressDTO;
import org.shiftleft.web.dto.UserinfoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserinfoAction extends ActionSupport implements
		ModelDriven<UserinfoDTO> {

	public static final Logger log = LoggerFactory
			.getLogger(UserinfoAction.class);
	public static final String LIST = "list";
	public static final String SHOW = "show";
	private static final long serialVersionUID = 1L;
	private UserinfoDTO user = new UserinfoDTO();

	public UserinfoAction() {
		super();
		user.setAdd(new AddressDTO());
	}

	public String execute() throws Exception {
		log.info("execute method ...");

		return SUCCESS;
	}

	public String show() throws Exception {

		log.info("show method executing ...");
		log.info("user values {}", user);

		return SHOW;
	}

	public String update() throws Exception {
		
		log.info("update method executing ...");
		log.info("user values {}", user);

		return SHOW;
	}

	public String list() throws Exception {
		System.out.println("List");
		return LIST;
	}

	@Override
	public UserinfoDTO getModel() {
		return user;
	}

	public UserinfoDTO getUser() {
		return user;
	}

	public void setUser(UserinfoDTO user) {
		this.user = user;
	}

}
