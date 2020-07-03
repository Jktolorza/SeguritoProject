package controlador.ControladorAsesoria;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AsesoriaDao;
import modelo.Asesoria;

/**
 * Servlet implementation class CrearAsesoria
 */
@WebServlet("/CrearAsesoria")
public class CrearAsesoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearAsesoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("FormularioAsesoria.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Date fecha = null;
//		try {
//			fecha = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("txtfecha"));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}  
//		Date hora = null;
//		try {
//			hora = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("txthora"));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		} 
		String fecha = request.getParameter("txtfecha");
		String hora = request.getParameter("txthora");
		String motivo = request.getParameter("txtmotivo");
		String detalle = request.getParameter("txtdetalle");
		int id_profesional = Integer.parseInt(request.getParameter("txtid_profesional"));
		int id_cliente = Integer.parseInt(request.getParameter("txtid_cliente"));

		Asesoria asesoria = new Asesoria(fecha, hora, motivo, detalle, id_profesional, id_cliente);
		
		AsesoriaDao asesoriadao = new AsesoriaDao();
		boolean agregar = asesoriadao.crearAsesoria(asesoria);
		
		String mensaje = "";
		
		if (agregar)
			mensaje = "La asesoria se ha creado exitosamente";
		else
			mensaje = "Ocurrio un error al crear la asesoria";
		
		request.setAttribute("cumensaje", mensaje);
		
		request.getRequestDispatcher("FormularioAsesoria.jsp").forward(request, response);
		
	}

}
