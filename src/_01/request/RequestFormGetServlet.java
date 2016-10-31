package _01.request;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//annotation kullanarak servlet tan�m� yap�yoruz.
//FormGet html sayfas�nda get oldu�u i�in doGet i owerride etmem gerekiyor.
//formGet k�m�ndan verileri req.getParameter("..."); ile al�yoruz..

@WebServlet("/requestgetform")
public class RequestFormGetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String maritalStatus = req.getParameter("marital status");
		
		//Eger getparameter checkbox lar i�in kullan�l�rsa ne kadar secililirse secilsin geriye sadece bir deger doner...
		
		String[] progLangs = req.getParameterValues("lang");
		
		if(progLangs !=null){
			for(String prog : progLangs){
				System.out.println("lang"+prog);
			}
		}
		
		String aprogLang = req.getParameter("lang"); //se�ilen checkboxlar i�inde tek bir deger donecektir.
		
		System.out.println("firsName"+ firstName);
		System.out.println("lastName"+ lastName);
		System.out.println("gender"+ gender);
		System.out.println("maritalStatus"+ maritalStatus);
		
		
		Enumeration<String> paramNames= req.getParameterNames();
		while(paramNames.hasMoreElements()){
		
			String name = paramNames.nextElement();
			System.out.println(name);
		
		}
		
}
}
