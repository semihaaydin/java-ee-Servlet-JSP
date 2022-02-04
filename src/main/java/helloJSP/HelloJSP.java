package helloJSP;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloJSP")
public class HelloJSP extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message="request attribute message!";
		req.setAttribute("message", message);
		RequestDispatcher dispacher=req.getRequestDispatcher("jsp/helloJSP.jsp");
		dispacher.forward(req, resp);
		
		
	}


}
