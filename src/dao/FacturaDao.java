package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import idao.iFacturaDao;
import modelo.Factura;

import conectar.ConexionSingleton;

public class FacturaDao implements iFacturaDao {

	@Override
	public boolean crearFactura(Factura fac) {
		// TODO Auto-generated method stub

		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO factura VALUES (null,'" + fac.getFechadecobro() + "','"+ fac.getFechaVencimiento()+"','"+fac.getExtras()+"','"+fac.getImpuestos()+"','"+fac.getSubtotal()+"','"+fac.getTotal()+"','"+fac.getId_cliente()+"')";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase FacturaDao, método crearFactura");
			e.printStackTrace();
		}
		
		return registrar;	
	
	}

	@Override
	public List<Factura> leerFactura() {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from factura ORDER BY ID";
		
		List<Factura> listaFactura = new ArrayList<Factura>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Factura c = new Factura();
				c.setId_factura(rs.getInt(1));
				c.setFechadecobro(rs.getString(2));
				c.setFechaVencimiento(rs.getString(3));
				c.setExtras(rs.getInt(4));
				c.setImpuestos(rs.getInt(5));
				c.setSubtotal(rs.getInt(6));
				c.setTotal(rs.getInt(7));
				c.setId_cliente(rs.getInt(8));
				listaFactura.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase FacturaDao, método leerFactura ");
			e.printStackTrace();
		}
		
		return listaFactura;
	}

	@Override
	public boolean actualizarFactura(Factura fac) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE factura SET id_factura = '" + fac.getId_factura() + "', fechacobro = '" + fac.getFechadecobro() + "', fechavencimiento = '" + fac.getFechaVencimiento() + "', extras = '"+ fac.getExtras()+"', impuestos = '"+ fac.getImpuestos() +"', subtotal = '"+ fac.getSubtotal()+"', total = '"+ fac.getTotal()+"', cliente_id_cliente'"+ fac.getId_cliente()+"' WHERE id = '" + fac.getId_factura() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase FacturaDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;

	}

	@Override
	public boolean eliminarFactura(Factura fac) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM factura WHERE id = " + fac.getId_factura();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase FacturaDao, método eliminarFactura");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Factura obtenerFactura(int id_factura) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from factura where ID = " + id_factura;
		
		Factura u = new Factura();
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setId_factura(rs.getInt(1));
				u.setFechadecobro(rs.getString(2));
				u.setFechaVencimiento(rs.getString(3));
				u.setExtras(rs.getInt(4));
				u.setImpuestos(rs.getInt(5));
				u.setSubtotal(rs.getInt(6));
				u.setTotal(rs.getInt(7));
				u.setId_cliente(rs.getInt(8));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase FacturaDao, método obtenerFactura");
			e.printStackTrace();
		}
		
		return u;
	}

	
	
}