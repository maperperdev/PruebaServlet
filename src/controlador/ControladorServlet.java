package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControladorServlet")
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productos[]= {"destornillador", "serrucho", "tornillo", "taladro"};
		//Almacena un atributo en el request- Se usa junto a RequestDispather
		request.setAttribute("lista_productos", productos);
		//Comunicamos con el JSP
	//	RequestDispatcher miDispacher=request.getRequestDispatcher("/vistas/VistaJSP.jsp");
		//enviamos la info
		//miDispacher.forward(request, response);
		//request.getRequestDispatcher("/vistas/VistaJSP.jsp").forward(request, response);
	//	request.getRequestDispatcher("index.html").forward(request, response);
		request.getRequestDispatcher("/VistaJSP.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
