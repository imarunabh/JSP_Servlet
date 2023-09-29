import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html:charset=UTF-8");
		try(PrintWriter out= response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet1</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet S1 at "+request.getContextPath() + "</h1>");
			
			
		   String n1 = request.getParameter("n1");
		   String n2 = request.getParameter("n2");
			
			int nn1 = Integer.parseInt(n1);
			int nn2 = Integer.parseInt(n2);
			
			//add
			int s =nn1 + nn2;
			
			//attribute.........
			
			request.setAttribute("sum", s);
			
			//request ....request dispatcher
			
			RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
			
			
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

