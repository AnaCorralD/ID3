package command;

import factoria.FactoriaNegocio;
import negocio.TDatos;
import presentacion.Contexto;
import presentacion.Events;

/**
 * @author Ana Laura Corral Descargue
 */
public class CommandBuscar implements Command{

	@Override
	public Contexto execute(Object dato) {
		TDatos tDatos = (TDatos) dato;
		Object n = FactoriaNegocio.getInstance().crearBusquedaID3().busqueda(tDatos);
		if(n instanceof Integer) return new Contexto(Events.BUSCAR_KO, n);
		else return new Contexto(Events.BUSCAR_OK, n);
	}

}
