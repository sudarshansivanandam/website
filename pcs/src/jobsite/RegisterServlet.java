package jobsite;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name="RegisterServlet",urlPatterns="/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		boolean exist = false;

		String FN = request.getParameter("N");
		String SN = request.getParameter("US");
		String PWD = request.getParameter("PWD");
		String email = request.getParameter("email");
		String PN = request.getParameter("PN");
		String S = request.getParameter("e");
		
		System.out.println(FN+SN+PWD+email+PN);

		RegisterDatabase db = new RegisterDatabase();
		exist = db.registerAdd(FN, SN, PWD, email, PN,S);
		if (exist == true) {
			RequestDispatcher req = request.getRequestDispatcher("RegisterFailed.jsp");
			req.forward(request, response);
		} else {
			RequestDispatcher req = request.getRequestDispatcher("RegisterSuccess.jsp");
			req.forward(request, response);
		}
	}
}
