package _02.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseEncodingType")
public class ResponseEncodingType extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		

		//setCharacterEncoding METHODU  yazd�rmadan once belirtilmelidir... ilk yol
		resp.setCharacterEncoding("ISO-8859-9");
		
		PrintWriter pw = resp.getWriter();
		
		pw.print("<html>");
		pw.print("<head> <meta charset ='ISO-8859-9'> </head>");
		pw.print("�������");
		pw.print("</html>");
		
		//taray�c�da ? seklinde gosterecektir bunu c�zmek icin encoding uyusmazl�g�n� gidermek gerekir.
		// varsay�lan olarak ISO-8859-1 kullan�l�r. Bu yuzden Turkce karekter yazarken problem c�kmakta.
		
		String responseEncoding = resp.getCharacterEncoding();
		//String requestEncoding = req.getCharacterEncoding(); 
		
		System.out.println("responseEncoding : "+ responseEncoding);
		//System.out.println("requestEncoding : "+ requestEncoding);
		
		//bu method da ayn� i�i yapar. ucuncu yol...
		//resp.setContentType("text/html; charset='UTF-8'");
		
	}
}
