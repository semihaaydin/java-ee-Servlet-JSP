package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class ServletRequestListenerImpl implements ServletRequestListener {
	
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		ServletRequestListener.super.requestDestroyed(sre);
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("ServletRequestInitializer###requestInit");
		HttpServletRequest request=(HttpServletRequest) sre.getServletRequest();
		//hangiServleti çaðýrdýðýmýza bakalým. 
		System.out.println(request.getServletPath());
	}
	
	

}
