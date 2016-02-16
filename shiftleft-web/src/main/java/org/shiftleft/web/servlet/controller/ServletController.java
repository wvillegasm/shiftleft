package org.shiftleft.web.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.shiftleft.web.dto.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class ServletController
 */
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	final Logger log = LoggerFactory.getLogger(ServletController.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		log.info("executing doGet method");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex + 1);

		log.info("ACTION: " + action);

		// Redirections
		String urlRetorno = null;

		// Execute action adapted
		if (action.equals("Add_client.action")) {
			urlRetorno = "/jsp/serv/AddModifyClient.jsp";
		} else if (action.equals("ConfirmAdd_client.action")) {
			// instance obj
			Client client = new Client(request.getParameter("name"),
					request.getParameter("password"));
			// return the object to the view
			request.setAttribute("client", client);

			// the view page
			urlRetorno = "/jsp/serv/ShowClient.jsp";

		}

		// Redirect to the view page
		if (urlRetorno != null) {
			request.getRequestDispatcher(urlRetorno).forward(request, response);
		}

	}

}
