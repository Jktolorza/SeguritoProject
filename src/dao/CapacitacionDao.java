package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import idao.iCapacitacionDao;

import modelo.Capacitacion;

import conectar.ConexionSingleton;

public class CapacitacionDao implements iCapacitacionDao {

	@Override
	public boolean crearCapacitacion(Capacitacion cap) {
		// TODO Auto-generated method stub

		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO usuarios VALUES (null,'" + cap.getFecha() + "','"+ cap.getHora()+"','"+cap.getTema()+"','"+cap.getContenido()+"')";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método crearUsuario");
			e.printStackTrace();
		}
		
		return registrar;	
	
	}

	@Override
	public List<Capacitacion> leerCapacitacion() {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from usuarios ORDER BY ID";
		
		List<Capacitacion> listaCapacitaciones = new ArrayList<Capacitacion>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Capacitacion c = new Capacitacion();
				c.setId_capacitacion(rs.getInt(1));
				c.setFecha(rs.getString(2));
				c.setHora(rs.getString(3));
				c.setTema(rs.getString(4));
				c.setContenido(rs.getString(5));
				listaCapacitaciones.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método leerUsuarios ");
			e.printStackTrace();
		}
		
		return listaCapacitaciones;
	}

	@Override
	public boolean actualizarCapacitacion(Capacitacion cap) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE usuarios SET fecha = '" + cap.getFecha() + "', hora = '" + cap.getHora() + "', tema = '" + cap.getTema() + "', contenido = '"+ cap.getContenido()+"' WHERE id = '" + cap.getId_capacitacion() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase CapacitacionDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;

	}

	@Override
	public boolean eliminarCapacitacion(Capacitacion cap) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM usuarios WHERE id = " + cap.getId_capacitacion();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase CapacitacionDao, método eliminarCapacitacion");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Capacitacion obtenerCapacitacion(int id_capacitacion) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from usuarios where ID = " + id_capacitacion;
		
		Capacitacion u = new Capacitacion();
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setId_capacitacion(rs.getInt(1));
				u.setFecha(rs.getString(2));
				u.setHora(rs.getString(3));
				u.setTema(rs.getString(4));
				u.setContenido(rs.getString(5));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase CapacitacionDao, método obtenerCapacitacion ");
			e.printStackTrace();
		}
		
		return u;
	}

	
	
}