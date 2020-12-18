package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter salida=response.getWriter();
		salida.println("<html>");
		salida.println("<head>");
		salida.println("<meta http-equiv='Content-type' content='text/html'; charset=UTF-8 />");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("<h1 style='text-align:center'>prueba servlet</h1>");
		salida.println("<p>Fecha actual: "+LocalDate.now()+"</p>");
		salida.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
