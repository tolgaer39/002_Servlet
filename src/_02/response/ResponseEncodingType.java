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
		
		

		//setCharacterEncoding METHODU  yazdýrmadan once belirtilmelidir... ilk yol
		resp.setCharacterEncoding("ISO-8859-9");
		
		PrintWriter pw = resp.getWriter();
		
		pw.print("<html>");
		pw.print("<head> <meta charset ='ISO-8859-9'> </head>");
		pw.print("çþðýÞÖÝ");
		pw.print("</html>");
		
		//tarayýcýda ? seklinde gosterecektir bunu cözmek icin encoding uyusmazlýgýný gidermek gerekir.
		// varsayýlan olarak ISO-8859-1 kullanýlýr. Bu yuzden Turkce karekter yazarken problem cýkmakta.
		
		String responseEncoding = resp.getCharacterEncoding();
		//String requestEncoding = req.getCharacterEncoding(); 
		
		System.out.println("responseEncoding : "+ responseEncoding);
		//System.out.println("requestEncoding : "+ requestEncoding);
		
		//bu method da ayný iþi yapar. ucuncu yol...
		//resp.setContentType("text/html; charset='UTF-8'");
		
	}
}
