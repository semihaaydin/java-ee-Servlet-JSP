package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.catalina.SessionListener;

@WebListener
public class ServletHttpSessionImp implements HttpSessionListener {
	
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Ýnitialize Session !!!!");
		System.out.println(se.getSession().getId());
	}

}
