package jobsite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
	public static String User;
	private static final long serialVersionUID = 1L;

	/**
	 * n
	 * 
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entered Servlet Module");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String u = request.getParameter("login");
		String p = request.getParameter("password");
		Boolean check = false;
		LoginDatabase db = new LoginDatabase();
		check = db.loginValidate(u, p);

		if (check == true) {
			// out.println("Login Successfull");
			User = u;
			System.out.println("Login Sucessfull");
			RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(request, response);
		} else {
			// out.println("Username or password is incorrect");
			System.out.println("Username or password is incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("LoginFailed.jsp");
			rd.forward(request, response);
		}

	}

}
