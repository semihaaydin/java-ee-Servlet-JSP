package requestFormPost;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestformpost")
public class RequestFormPost extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String marital_status= req.getParameter("marital status");
		String[] langs= req.getParameterValues("lang");
		
		PrintWriter pw=resp.getWriter();
		pw.println(firstName);
		pw.println(lastName);
		pw.println(marital_status);
		pw.println(Arrays.asList(langs));
		
		Map<String,String[]> paramaterMap=req.getParameterMap();
		//ekrana form le alýnan verilerin deðerlerini basar. 
		for (Map.Entry<String,String[]> entry: paramaterMap.entrySet()) {
			System.out.println(entry.getKey() +" : "+ Arrays.asList(entry.getValue()));
			
		}
		
	}

}
