package command;

import presentacion.Contexto;

/**
 * @author Ana Laura Corral Descargue
 */
public interface Command {

	public Contexto execute(Object dato);
}