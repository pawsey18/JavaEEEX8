package edu.nbcc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.nbcc.user.IUser;
import edu.nbcc.user.UserFactory;

/**
 * Servlet implementation class EmailServlet
 */
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int globalCount;
    /**
     * Default constructor. 
     */
    public EmailServlet() {
    	super();
        // TODO Auto-generated constructor stub
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		throw new ServletException("Get calls are not allowed");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "";
		String url = "index.jsp";
		if (request.getParameter("btnSubmit") != null) {
			try {
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				String emailAddress = request.getParameter("emailAddress");
				
				IUser user = UserFactory.createInstance(firstName, lastName, emailAddress);
				if (!user.hasRequiredFields()) {
					message= "please provide all info ";
							
				}else if (!user.isEmailValid()) {
					message= "please provide valid email ";
				}else {
					url = "/thanks.jsp";
					globalCount++;
					response.setContentType("text/html");
					request.setAttribute("user", user);
					request.setAttribute("globalCount",  globalCount);
				}
			}
	
			catch(Exception e) {
				message = e.getMessage();
			}
			request.setAttribute("message",  message);
			getServletContext().getRequestDispatcher(url).forward(request, response);
		}else {
			request.setAttribute("message",  "Improper call" );
		}
	}

}
