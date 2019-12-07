package pl.n2god;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author n2god on 07/12/2019
 * @project redirect
 */
@WebServlet(name = "AdminServlet", urlPatterns = "/AdminServlet")
public class AdminServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("Admin servlet POST" + username);

		//W takiej sytuacji do przeglądarki zostaje wysłana odpowiedź z kodem 302 lub 301, po czym przeglądarka wysyła następnie żądanie do serwera pod wskazany jako argument adres.
		response.sendRedirect("LoginServlet");
	}
}
