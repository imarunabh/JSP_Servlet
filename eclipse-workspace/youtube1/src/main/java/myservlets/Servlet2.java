package myservlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out= response.getWriter()){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet servlet</title>");
			out.println("</head>");
			out.println("<body>");
			//name fetch
			String name = request.getParameter("user_name");
			out.println("<h1 style='color:red;'>welcome back"+name+"</h1>");
			
			
			
			
			out.println("</body>");
			out.println("</html>");
			
			
		}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}

}