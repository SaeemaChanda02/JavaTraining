

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("name");
		HttpSession session = request.getSession();
		
		if(username != " " &&  username != null){
			session.setAttribute("savedUname" , username);
			
		}
		pw.println("Request parameter has user name as "+ username);
		pw.println("Session parameter has user name as "+ (String)session.getAttribute("savedUname"));
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
		rd.include(request, response);
		
		
	}

}
