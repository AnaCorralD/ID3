/**
 * 
 */
package factoria;

import command.Command;
import command.CommandBuscar;
import presentacion.Events;

/**
 * @author Ana Laura Corral Descargue
 */
public class FactoriaCommandImp extends FactoriaCommand {

	@Override
	public Command generarComando(int evento) {
		Command command = null;
		switch(evento){
		case(Events.BUSCAR_ID3):
			return new CommandBuscar();
		}
		return command;
	
	}
}