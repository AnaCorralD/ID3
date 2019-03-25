package presentacion;

import javax.swing.JFrame;

/**
 * @author Ana Laura Corral Descargue
 */
public abstract class GUIMain extends JFrame implements GUI{

	private static GUIMain instance;
	
	public static GUIMain getInstance() {
		if(instance == null) {
			instance = new GUIMainImp();
		}
		return instance;
	}

}
