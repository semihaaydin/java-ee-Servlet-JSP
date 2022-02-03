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

@WebServlet("/encodingOrnek")
public class EncodingSessionShowSample extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw= resp.getWriter();
	
		HttpSession session=req.getSession();
		session.setAttribute("name","semiha");
		
		//String nonEncodeURL="encoding";
		String encode=resp.encodeURL(getServletContext().getContextPath()+"/encoding");

	
		//pw.println("<a href=\"" + nonEncodeURL + "\"> Click Here</a>");
		pw.println("<a href=\"" + encode + "\"> Click Here</a>");
	}

}
