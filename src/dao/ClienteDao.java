package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conectar.ConexionSingleton;
import idao.iClienteDao;
import modelo.Cliente;

public class ClienteDao implements iClienteDao {

    @Override
    public boolean crearCliente(Cliente cl) {
        // TODO Auto-generated method stub
        boolean registrar = false;
        
        Statement stm = null;
        Connection con = null;
        
        String sql = "INSERT INTO cliente VALUES (null,'" +cl.getNombreEmpresa()+ "','"+ cl.getRut()+"','"+cl.getFechaRegistro()+"')";       
        try {
                con = ConexionSingleton.getConnection();
                stm = con.createStatement();
                stm.execute(sql);
                registrar = true;
                stm.close();
                //con.close();
        }catch(SQLException e) {
                System.out.println("Error: Clase ClienteDao, metodo crearCliente");
                e.printStackTrace();
        }
        
        return registrar;
    }

    @Override
    public List<Cliente> leerCliente(Cliente cl) {
        // TODO Auto-generated method stub
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        
        String sql = "select * from cliente ORDER BY ID";
        
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        
        try {
                con = ConexionSingleton.getConnection();
                stm = con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                        Cliente c = new Cliente();
                        c.setId(rs.getInt(1));
                        c.setNombreEmpresa(rs.getString(2));
                        c.setRut(rs.getString(3));
                        c.setFechaRegistro(rs.getString(4));
                        listaClientes.add(c);
                }
                stm.close();
                rs.close();
                //con.close();
        } catch(SQLException e) {
                System.out.println("Error: Clase ClienteDao, metodo leerCliente ");
                e.printStackTrace();
        }
        
        return listaClientes;
}
    

    @Override
    public boolean actualizarCliente(Cliente cl) {
        // TODO Auto-generated method stub
        Connection con = null;
        Statement stm = null;
        
        boolean actualizar = false;
        
        String sql = "UPDATE cliente SET nombre = '" + cl.getNombreEmpresa()+ "','"+ cl.getRut()+"','"+cl.getFechaRegistro()+"')";
        
        try {
                con = ConexionSingleton.getConnection();
                stm = con.createStatement();
                stm.execute(sql);
                actualizar = true;
                stm.close();
                //con.close();
        }catch(SQLException e) {
                System.out.println("Error: Clase ClienteDao, metodo actualizarUsuario");
                e.printStackTrace();
        }
        
        return actualizar;

    }

    @Override
    public boolean eliminarCliente(Cliente cl) {
        // TODO Auto-generated method stub
        Connection con = null;
        Statement stm = null;
        
        boolean eliminar = false;
        
        String sql = "DELETE FROM cliente WHERE id = " + cl.getId();
        
        try {
                con = ConexionSingleton.getConnection();
                stm = con.createStatement();
                stm.execute(sql);
                eliminar = true;
                stm.close();
                //con.close();
        }catch(SQLException e) {
                System.out.println("Error: Clase ClienteDao, metodo eliminarCliente");
                e.printStackTrace();
        }
        
        return eliminar;
    }

    @Override
    public Cliente obtenerCliente(int id_cliente) {
        // TODO Auto-generated method stub
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        
        String sql = "select * from cliente where ID = " + id_cliente;
        
        Cliente u = new Cliente();
        try {
                con = ConexionSingleton.getConnection();
                stm = con.createStatement();
                rs = stm.executeQuery(sql);
                while (rs.next()) {
                        u.setId(rs.getInt(1));
                        u.setNombreEmpresa(rs.getString(2));
                        u.setRut(rs.getString(3));
                        u.setFechaRegistro(rs.getString(4));
                }
                stm.close();
                rs.close();
                //con.close();
        } catch(SQLException e) {
                System.out.println("Error: Clase ClienteDao, metodo obtenerCliente ");
                e.printStackTrace();
        }
        
        return u;
    }

}

