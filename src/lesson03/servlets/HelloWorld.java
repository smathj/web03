package lesson03.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class HelloWorld extends GenericServlet {
	
	// GenericServlet 추상 클래스를 상속받으면 서비스만 구현하면된다
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service");
		
	}
	
}

//public class HelloWorld implements Servlet {
//	
//	ServletConfig config;
//	
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		System.out.println("init() 호출됨!");
//		this.config = config;
//		
//	}
//	
//	@Override
//	public void destroy() {
//		System.out.println("destory() 호출됨!");
//	}
//	
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("service");
//		
//	}
//	
//	@Override
//	public ServletConfig getServletConfig() {
//		System.out.println("getServletConfig() 호출됨!");
//		return this.config;
//	}
//	
//	@Override
//	public String getServletInfo() {
//		System.out.println("getServletInfo() 호출됨!");
//		return "version=1.0;author=NataeKoon;copyright=NataeKoon";
//	}
//}
