package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import idao.iDetalleFacturaDao;
import modelo.DetalleFactura;

import conectar.ConexionSingleton;

public class DetalleFacturaDao implements iDetalleFacturaDao {

	@Override
	public boolean crearDetalleFactura(DetalleFactura detallefac) {
		// TODO Auto-generated method stub

		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO detallefactura VALUES (null,'" + detallefac.getNombre() + "','"+ detallefac.getPrecio()+"','"+ detallefac.getCantidad()+"','"+ detallefac.getId_factura()+"')";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase DetalleFacturaDao, m�todo crearDetalleFactura");
			e.printStackTrace();
		}
		
		return registrar;	
	
	}

	@Override
	public List<DetalleFactura> leerDetalleFactura() {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from detallefactura ORDER BY ID";
		
		List<DetalleFactura> listaDetalleFactura = new ArrayList<DetalleFactura>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				DetalleFactura c = new DetalleFactura();
				c.setId_detallefactura(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setPrecio(rs.getInt(3));
				c.setCantidad(rs.getInt(4));
				c.setId_factura(rs.getInt(5));
				listaDetalleFactura.add(c);
			}
			stm.close();
			rs.close();
			con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase DetalleFacturaDao, m�todo leerDetalleFactura ");
			e.printStackTrace();
		}
		
		return listaDetalleFactura;
	}

	@Override
	public boolean actualizarDetalleFactura(DetalleFactura detallefac) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE detallefactura SET id_detallefactura = '" + detallefac.getId_detallefactura() + "', nombre = '" + detallefac.getNombre() + "', Precio = '" + detallefac.getPrecio() + "', Cantidad = '"+ detallefac.getCantidad()+"', factura_id_factura = '"+ detallefac.getId_factura() +"' WHERE id = '" + detallefac.getId_detallefactura() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase DetalleFacturaDao, m�todo actualizar");
			e.printStackTrace();
		}
		
		return actualizar;

	}

	@Override
	public boolean eliminarDetalleFactura(DetalleFactura detallefac) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM detallefactura WHERE id = " + detallefac.getId_detallefactura();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase DetalleFacturaDao, m�todo eliminarDetalleFactura");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public DetalleFactura obtenerDetalleFactura(int id_detallefactura) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from detallefactura where ID = " + id_detallefactura;
		
		DetalleFactura u = new DetalleFactura();
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setId_detallefactura(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setPrecio(rs.getInt(3));
				u.setCantidad(rs.getInt(4));
				u.setId_factura(rs.getInt(5));
			}
			stm.close();
			rs.close();
			con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase DetalleFacturaDao, m�todo obtenerDetalleFactura");
			e.printStackTrace();
		}
		
		return u;
	}

	
	
}