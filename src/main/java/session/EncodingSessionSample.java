package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;

@WebServlet("/encoding")
public class EncodingSessionSample extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw= resp.getWriter();		
		HttpSession session=req.getSession();
		pw.print("Hello" + session.getAttribute("name"));
	}

}
