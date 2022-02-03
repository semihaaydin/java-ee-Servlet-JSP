package servletDownload;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/response.download")
public class ResponseDownload extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("header1","value1");
		resp.setHeader("header1", "valu2");
		resp.addHeader("header1", "valu3");
		//resp.setHeader("Connect-Disposition", "attacment; filename-test.xlsx");
	}

}
