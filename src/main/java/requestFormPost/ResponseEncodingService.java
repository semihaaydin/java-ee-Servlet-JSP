package requestFormPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseEncodingService")
public class ResponseEncodingService extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("ISO-8859-9");
		// bu method println metodundan once cagrilmaldir!
		// Ask durumda ise yaramayacaktir.

		PrintWriter pw = resp.getWriter();
		pw.println("<p>ışçğüö</p>");
                pw.print("<html>");
                pw.print("<head> <meta charset='ISO-8859-9'> </head>");
                pw.print("<body>");
                pw.println("<p>ışçğüö</p>");
                pw.print("</body> </html>");

		String responseEncoding = resp.getCharacterEncoding();
		// If no character encoding has been specified, ISO-8859-1
		// is returned.
		// Eger belirtilen bir encoding yoksa bu durumda varsayilan encoding
		// ISO-8859-1 olacaktir.
		System.out.println("responseEncoding:" + responseEncoding);
	}

}
