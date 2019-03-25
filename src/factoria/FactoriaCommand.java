/**
 * 
 */
package factoria;

import command.Command;

/**
 * @author Ana Laura Corral Descargue
 */
public abstract class FactoriaCommand {

	private static FactoriaCommand instance;

	public synchronized static FactoriaCommand getInstance() {
		if(instance == null){
			instance = new FactoriaCommandImp();
		}
		return instance;
	}

	public abstract Command generarComando(int evento);
}