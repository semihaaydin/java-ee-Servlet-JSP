package requestFormPost;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/requestmethod")
public class RequestMethod extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Locale local=req.getLocale();
		int port= req.getLocalPort();
		String localAdd=req.getLocalAddr();
        StringBuffer url= req.getRequestURL();
		String getscheme=req.getScheme();
		HttpSession session=req.getSession();
		ServletContext context=req.getServletContext();
		String host=req.getHeader("host");
		Enumeration<String> headNames=req.getHeaderNames();
		
	    System.out.println(local);
		
		
	}

}
