package helloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testUrlServlet")
public class HelloServletExample extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Çalýþtý");
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>Server Calisti</h1>");
		
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	}

}
