package idao;
import java.util.List;
import modelo.DetalleFactura;

public interface iDetalleFacturaDao {
	
	    public boolean crearDetalleFactura(DetalleFactura detallefac);
	    public List<DetalleFactura> leerDetalleFactura();
	    public boolean actualizarDetalleFactura(DetalleFactura detallefac);
	    public boolean eliminarDetalleFactura(DetalleFactura detallefac);
	    DetalleFactura obtenerDetalleFactura(int id_detallefactura);

}
