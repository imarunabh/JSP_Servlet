import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out= response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet1</title>");
			out.println("</head>");
			out.println("<body>");
			
			
		   String name = request.getParameter("name");
		   out.println("<h1>Hello,"+name +"welcome to my website...</h1>");
		   out.println("<h1><a href='Servlet2'>Go to servlet 2</a></h1>");
		
			out.println("</body>");
			out.println("</html>"); 
		}
		
	}
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response )throws ServletException, IOException {
		processRequest(request,response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		processRequest(request,response);
	}
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}

