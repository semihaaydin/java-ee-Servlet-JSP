package servletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextServlet")
public class ServletContextClass extends HttpServlet{
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   PrintWriter pw=resp.getWriter();
	   ServletContext context=getServletContext();
	   pw.write(context.getInitParameter("rootPath"));
	   pw.write(System.lineSeparator());
	   pw.write(context.getRealPath("/test.txt"));
	}

}
