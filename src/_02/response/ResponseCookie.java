package _02.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//cookie browser da saklanan kücük bilgilerdir. 

@WebServlet("/responseCookie")
public class ResponseCookie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Cookie userName = new Cookie("userName","Tolga" );
		Cookie password = new Cookie("password","12345" );
		
		resp.addCookie(userName);
		resp.addCookie(password);
		
	
	}
}
