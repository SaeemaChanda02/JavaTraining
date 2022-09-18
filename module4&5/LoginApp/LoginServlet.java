

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("t1");
		String pass = request.getParameter("t2");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		if(n.equals("Saeema") && pass.equals("0212")) {
			HttpSession hs = request.getSession();
			hs.setAttribute("uname", n);
			response.sendRedirect("Success.jsp");
		}
		else {
			pw.println("<font color=red>Sorry! Username or Password incorrect...Try Again:(</font>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			//rd.forward(request,response);
			rd.include(request, response);
			}
		
	}

}
