package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import idao.iProfesionalDao;
import modelo.Profesional;
import conectar.ConexionSingleton;

public class ProfesionalDao implements iProfesionalDao {

	@Override
	public boolean crearProfesional(Profesional prf) {
		// TODO Auto-generated method stub

		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO profesional(nombre, apellido, correo, telefono, cargo) VALUES ('" + prf.getNombre() + "','"+ prf.getApellido()+"','"+prf.getCorreo()+"','"+prf.getTelefono()+"')";
//		System.out.println(sql);
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ProfesionalDao, m�todo crearProfesional");
			e.printStackTrace();
		}
		
		return registrar;	
	
	}

	@Override
	public List<Profesional> leerProfesional() {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from profesional ORDER BY ID_profesional";
		
		List<Profesional> listaProfesionales = new ArrayList<Profesional>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Profesional c = new Profesional();
				c.setId_profesional(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setApellido(rs.getString(3));
				c.setCorreo(rs.getString(4));
				c.setTelefono(rs.getString(5));
				c.setCargo(rs.getString(6));
				listaProfesionales.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase ProfesionalDao, m�todo leerProfesional ");
			e.printStackTrace();
		}
		
		return listaProfesionales;
	}

	@Override
	public boolean actualizarProfesional(Profesional prf) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE profesional SET nombre = '" + prf.getNombre() + "', apellido = '" + prf.getApellido() + "', correo = '" + prf.getCorreo() + "', telefono = '"+prf.getTelefono()+"', cargo = '"+ prf.getCargo()+"' WHERE id = '" + prf.getId_profesional() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ProfesionalDao, m�todo actualizar");
			e.printStackTrace();
		}
		
		return actualizar;

	}

	@Override
	public boolean eliminarProfesional(Profesional prf) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM profesional WHERE id = " + prf.getId_profesional();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase ProfesionalDao, m�todo eliminarProfesional");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Profesional obtenerProfesional(int id_profesional) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from profesional where ID = " + id_profesional;
		
		Profesional u = new Profesional();
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setId_profesional(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setApellido(rs.getString(3));
				u.setCorreo(rs.getString(4));
				u.setTelefono(rs.getString(5));
				u.setCargo(rs.getString(6));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase ProfesionalDao, m�todo obtenerProfesional ");
			e.printStackTrace();
		}
		
		return u;
	}

	
	
}