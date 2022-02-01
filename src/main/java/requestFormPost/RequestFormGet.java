package requestFormPost;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestgetform")
public class RequestFormGet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String marital_status= req.getParameter("marital status");
		String[] langs= req.getParameterValues("lang");
		
		PrintWriter pw=resp.getWriter();
		pw.println(firstName);
		pw.println(lastName);
		pw.println(marital_status);
		pw.println(Arrays.asList(langs));
		
	}

}
