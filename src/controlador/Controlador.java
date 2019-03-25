package controlador;

import presentacion.Contexto;

/**
 * @author Ana Laura Corral Descargue
 */
public abstract class Controlador {

	private static Controlador instance;
	
	public static Controlador getInstance() {
		if(instance == null) {
			instance = new ControladorImp();
		}
		return instance;
	}
	
	public abstract void accion(Contexto contexto);
}
