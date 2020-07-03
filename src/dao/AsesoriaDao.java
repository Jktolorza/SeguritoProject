package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conectar.ConexionSingleton;
import idao.iAsesoriaDao;
import modelo.Asesoria;

public class AsesoriaDao implements iAsesoriaDao {

	@Override
	public boolean crearAsesoria(Asesoria asesoria) {

		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO asesorias(fecha, hora, motivo, detalle, profesional_id_profesional, cliente_id_cliente) VALUES (TO_DATE('" + asesoria.getFecha() + "','dd/mm/yyyy'), TO_DATE('" + asesoria.getHora() + "','dd/mm/yyyy hh:mi:ss'),'" + asesoria.getMotivo() + "','" + asesoria.getDetalle() + "','" + asesoria.getId_profesional() + "','" + asesoria.getId_cliente() + "')";
		System.out.println(sql);
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase AsesoriaDao, metodo crearAsesoria");
			e.printStackTrace();
		}
		
		return registrar;	
	
	}

	@Override
	public List<Asesoria> leerAsesoria() {

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from asesorias ORDER BY ID";
		
		List<Asesoria> listaAsesorias = new ArrayList<Asesoria>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Asesoria c = new Asesoria();
				c.setId_asesoria(rs.getInt("id_asesoria"));
				c.setFecha(rs.getString("fecha"));
				c.setHora(rs.getString("hora"));
				c.setMotivo(rs.getString("motivo"));
				c.setDetalle(rs.getString("detalle"));
				c.setId_profesional(rs.getInt("profesional_id_profesional"));
				c.setId_cliente(rs.getInt("cliente_id_cliente"));
				listaAsesorias.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase AsesoriaDao, metodo leerAsesoria ");
			e.printStackTrace();
		}
		
		return listaAsesorias;
	}

	@Override
	public boolean actualizarAsesoria(Asesoria asesoria) {

		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE asesorias SET fecha = '" + asesoria.getFecha() + "', hora = '" + asesoria.getHora() + "', motivo = '" + asesoria.getMotivo() + "', detalle = '"+asesoria.getDetalle()+"', profesional_id_profesional = '"+ asesoria.getId_profesional()+"', cliente_id_cliente = '"+ asesoria.getId_cliente()+"' WHERE id_asesoria = '" + asesoria.getId_asesoria() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase AsesoriaDao, metodo actualizar");
			e.printStackTrace();
		}
		
		return actualizar;

	}

	@Override
	public boolean eliminarAsesoria(Asesoria asesoria) {

		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM asesorias WHERE id_asesoria = " + asesoria.getId_asesoria();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase AsesoriaDao, metodo eliminar");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Asesoria obtenerAsesoria(int idAsesoria) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from asesorias where id_asesoria = " + idAsesoria;
		
		Asesoria u = new Asesoria();
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setId_asesoria(rs.getInt("id_asesoria"));
				u.setFecha(rs.getString("fecha"));
				u.setHora(rs.getString("hora"));
				u.setMotivo(rs.getString("motivo"));
				u.setDetalle(rs.getString("detalle"));
				u.setId_profesional(rs.getInt("profesional_id_profesional"));
				u.setId_cliente(rs.getInt("cliente_id_cliente"));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase AsesoriaDao, metodo obtener ");
			e.printStackTrace();
		}
		
		return u;
	}

	
	
}