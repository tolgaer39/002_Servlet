package _01.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/morerequestmethods")
public class MoreRequestMethods extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String hostName = req.getHeader("host");
		String serverName = req.getServerName();
		int localPort = req.getLocalPort();
		String method = req.getMethod();
		
		System.out.println("hostName " + hostName);
		System.out.println("serverName " + serverName);
		System.out.println("localPort " + localPort);
		System.out.println("method " + method);
		
		System.out.println("headers");
		
		Enumeration<String> headerNames = req.getHeaderNames();
		
		while(headerNames.hasMoreElements()){
			
			String headerName = headerNames.nextElement();
			System.out.println(req.getHeader(headerName));
			
		}
		
		
		
	}
}
