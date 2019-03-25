package factoria;

import negocio.BusquedaID3;

/**
 * @author Ana Laura Corral Descargue
 */
public abstract class FactoriaNegocio {

	private static FactoriaNegocio instance;
	
	public static FactoriaNegocio getInstance() {
		if(instance == null) {
			instance = new FactoriaNegocioImp();
		}
		return instance;
	}
	
	public abstract BusquedaID3 crearBusquedaID3();
}
