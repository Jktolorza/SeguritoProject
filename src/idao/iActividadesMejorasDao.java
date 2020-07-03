package idao;

import java.util.List;

import modelo.ActividadesMejoras;


public interface iActividadesMejorasDao {
	
	public boolean crearActividad(ActividadesMejoras act);
	public List<ActividadesMejoras> leerActividad();
	public boolean actualizarActividad(ActividadesMejoras act);
	public boolean eliminarActividad(ActividadesMejoras act);
	ActividadesMejoras obtenerActividad(int idActMejora);

}
