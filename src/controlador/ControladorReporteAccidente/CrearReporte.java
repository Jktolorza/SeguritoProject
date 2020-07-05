package controlador.ControladorReporteAccidente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReporteAccidenteDao;
import dao.ClienteDao;
import modelo.ReporteAccidente;
import modelo.Cliente;


/**
 * Servlet implementation class CrearReporte
 */
@WebServlet("/CrearReporte")
public class CrearReporte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearReporte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ClienteDao clientedao = new ClienteDao();
		List<Cliente> lclientes = new ArrayList<Cliente>();
		
		lclientes = clientedao.leerCliente();
		
		request.setAttribute("listadoclientes",lclientes);
		
		//mostrarlista
		List<ReporteAccidente> lreporteaccidentes = new ArrayList<ReporteAccidente>();
		ReporteAccidenteDao reporteaccidentedao = new ReporteAccidenteDao();
		lreporteaccidentes = reporteaccidentedao.leerReporteAccidente();
			
		request.setAttribute("listadoreporteaccidentes",lreporteaccidentes);
		
		
		request.getRequestDispatcher("accidenteCliente.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
