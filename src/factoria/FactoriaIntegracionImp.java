package factoria;

import integracion.Archivo;
import integracion.ArchivoImp;

/**
 * @author Ana Laura Corral Descargue
 */
public class FactoriaIntegracionImp extends FactoriaIntegracion{

	@Override
	public Archivo crearArchivo() {
		return new ArchivoImp();
	}

}
