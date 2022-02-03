package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


public class ServletContexListenerTest implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Ýnitialize oldum !!!! ");
	}
	
	

}
