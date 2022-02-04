package helloJSP;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helloJSP.model.Department;
import helloJSP.model.Kullanici;



@WebServlet("/HelloJSPAction")
public class HelloJSPAction extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Department department = new Department();
		department.setName("Yazýlým Geliþtirme");
		Kullanici user=new Kullanici("Semiha","Aydin",department,new BigDecimal(8000.56));
		request.setAttribute("user", user);
		
		

		RequestDispatcher disp=request.getRequestDispatcher("/jsp/userBean.jsp");
		disp.forward(request, response);
		
		
	}


}
