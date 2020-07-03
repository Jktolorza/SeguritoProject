package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import idao.iActividadesMejorasDao;
import modelo.ActividadesMejoras;
import conectar.ConexionSingleton;

public class ActividadMejorasDao implements iActividadesMejorasDao {

	
//	private int idActMejora;
//	private String Nombre;
//	private String fechaInicio;
//	private String fechaTermino;
//	private String estado;
//	private String detalle;
	
	
	@Override
	public boolean crearActividad(ActividadesMejoras act) {
		// TODO Auto-generated method stub

		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO actividadesmejora VALUES (null,'" + act.getNombre() + "','"+ act.getFechaInicio() +"','"+act.getFechaTermino()+"','"+act.getEstado()+"','"+ act.getDetalle()+"')";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ActividadesMejorasDao, método crearActividad");
			e.printStackTrace();
		}
		
		return registrar;	
	
	}

	@Override
	public List<ActividadesMejoras> leerActividad() {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from actividadesmejora ORDER BY ID";
		
		List<ActividadesMejoras> listaActividades = new ArrayList<ActividadesMejoras>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				ActividadesMejoras c = new ActividadesMejoras();
				c.setIdActMejora(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setFechaInicio(rs.getString(3));
				c.setFechaTermino(rs.getString(4));
				c.setEstado(rs.getString(5));
				c.setDetalle(rs.getString(6));
				listaActividades.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase ActividadesMejoraDao, método leerActividad ");
			e.printStackTrace();
		}
		
		return listaActividades;
	}

	@Override
	public boolean actualizarActividad(ActividadesMejoras act) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE actividadesmejora SET nombre = '" + act.getNombre() + "', fechainicio = '" + act.getFechaInicio() + "', fechatermino = '" + act.getFechaTermino() + "', estado = '"+act.getEstado()+"', detalle = '"+ act.getDetalle()+"' WHERE id = '" + act.getIdActMejora() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ActividadesMejoraDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;

	}

	@Override
	public boolean eliminarActividad(ActividadesMejoras act) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM actividadesmejora WHERE id = " + act.getIdActMejora();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ActividadesMejorasDao, método eliminarActividad");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public ActividadesMejoras obtenerActividad(int idActMejora) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from actividadesmejora where ID = " + idActMejora;
		
		ActividadesMejoras u = new ActividadesMejoras();
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setIdActMejora(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setFechaInicio(rs.getString(3));
				u.setFechaTermino(rs.getString(4));
				u.setEstado(rs.getString(5));
				u.setDetalle(rs.getString(6));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase ActividadesMejorasDao, método obtenerActividad ");
			e.printStackTrace();
		}
		
		return u;
	}

	
	
}