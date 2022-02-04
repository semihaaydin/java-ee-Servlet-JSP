package helloJSP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/JSPMapExample")
public class JSPMapExample extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map<String,String> map=new HashMap<String, String>();
		map.put("key", "value");
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		request.setAttribute("mymap", map);

		RequestDispatcher disp=request.getRequestDispatcher("/jsp/JSPMapExample.jsp");
		disp.forward(request, response);
		
		
	}


}
