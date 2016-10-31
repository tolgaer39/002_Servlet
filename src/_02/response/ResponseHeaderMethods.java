package _02.response;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/responseHeader")
public class ResponseHeaderMethods extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setHeader("headerName1", "headerValue1");
		
		resp.setHeader("headerName1", "Override-headerValue1"); // ayný isimle yazarsak owerride eder
		
		//getHeader
		
		String headerName = resp.getHeader("headerName1");
		
		System.out.println(headerName);
		
		resp.addHeader("headerName2", "header2");
		resp.addHeader("headerName2", "header2 2 ");
		
		Collection<String> headers2 = resp.getHeaders("headerName2");
		
		for(String h : headers2){
			System.out.println(h);
		}
	}
	
}
