

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationPage
 */
@WebServlet("/RegistrationPage")
public class RegistrationPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
   		
   		//System.out.println("Welcome To Registration Page");
   		PrintWriter out = response.getWriter();
   		out.println("<font color=green><font size=120%> Welcome to Registration Page </font></font>");
	}

}
