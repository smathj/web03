package lesson03.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/calc", "/hi"})
public class CalculatorServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		String ipv4 = req.getRemoteAddr();
		
		res.setContentType("text/plain");	// 출력 인코딩, 문자 집합 설정 ( 순정 텍스트 )
		res.setCharacterEncoding("UTF-8");	// 출력 데이터 문자 집합을 지정(기본 ISO-8859-1)
		
//		[한번에 적용]
//		res.setContentType("text/plain;chartset=UTF-8");
		
		PrintWriter writer = res.getWriter();
		
		writer.println("a= " + a + ", " + "b=" + b + " 의 계산 결과 입니당");
		writer.println("a + b = " + (a + b));
		writer.println("a - b = " + (a - b));
		writer.println("a * b = " + (a * b));
		writer.println("a / b = " + ((float)a / (float)b));
		writer.println("a % b = " + (a % b));
		writer.println("Client IP =" + ipv4);
		
		
	}
	
	
}
