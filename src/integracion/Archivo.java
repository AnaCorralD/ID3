package integracion;

import java.util.ArrayList;

import negocio.TDatos;
import tablas.Atributo;
import tablas.Ejemplos;

/**
 * @author Ana Laura Corral Descargue
 */
public interface Archivo {
	public ArrayList<Atributo> leerAtributos(TDatos tDatos);
	public int leerEjemplos(TDatos tDatos, ArrayList<Atributo> listaAtributos, Ejemplos listaDeEjemplos);
}
