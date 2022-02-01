package lifeCycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testLifeCyle")
public class ServletLifeCyleTest extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("LifeCyleServlettttt$init is called"); 	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		pw.print("LifeCyleServlet$doGet");
		
		System.out.println("LifeCyleServlet$doGet is called");
	}

}
