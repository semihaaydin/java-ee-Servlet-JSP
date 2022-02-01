package servletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletConfigClass extends HttpServlet{
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(req, resp);
    	
    	ServletConfig config=getServletConfig();
    	PrintWriter pw=resp.getWriter();
		pw.print(config.getInitParameter("username"));
		pw.print(config.getInitParameter("password"));
		pw.print(config.getServletName());
		pw.print(config.getInitParameterNames());
    }

}
