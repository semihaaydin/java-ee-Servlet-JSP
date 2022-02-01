package responseCookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseCookieServlet")
public class ResponseCookieServlet extends HttpServlet {
	
	//özelleþmiþ response headerlardýr
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//bir çok site cookie bilgisi olmadan sistemden atar. 
		Cookie usernameCookie=new Cookie("name", "semiha");
	    resp.addCookie(usernameCookie);
	    
	    Cookie[] cookies=req.getCookies();
	    if(cookies !=null) {
	    	for(Cookie c: cookies) {
	    		System.out.println("name: "+c.getName());
	    		System.out.println("value: "+c.getValue());
	    		System.out.println("domain: "+c.getDomain());
	    		System.out.println("maxAge: "+c.getMaxAge());
	    		System.out.println("path: "+c.getPath());
	    		System.out.println("versiyon: "+c.getVersion());
	    		System.out.println("class: "+c.getClass());
	    		System.out.println("------------------");
	    		
	    	}
	    }
	}

}
