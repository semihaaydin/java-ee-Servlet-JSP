import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/implicitServlet")
public class ImplicitServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie=new Cookie("username", "admin");
		resp.addCookie(cookie);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/jsp/implicit.jsp");
		dispatcher.forward(req, resp);
	}

}
