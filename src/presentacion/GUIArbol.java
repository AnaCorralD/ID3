package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import com.placeholder.PlaceHolder;

import tablas.Atributo;
import arbol.Nodo;
import controlador.Controlador;
import negocio.TComprobacion;
import negocio.TDatos;

/**
 * @author Ana Laura Corral Descargue
 */
public class GUIArbol  extends JFrame{

	private static final long serialVersionUID = 1L;
	private Nodo arbol;
	private TDatos tDatos;
	
	
	public GUIArbol(){
		super("Algoritmo ID3 - Ana Laura Corral Descargue");
	}	
	
	public void initView() {
		mxGraph graph= new mxGraph();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	//PREPARA EL GRAFICO PARA ACTUALIZAR
	graph.getModel().beginUpdate();
	//Estilo flechas
			Map<String, Object> edge = new HashMap<String, Object>();
		    edge.put(mxConstants.STYLE_ROUNDED, true);
		    edge.put(mxConstants.STYLE_ORTHOGONAL, false);
		    edge.put(mxConstants.STYLE_EDGE, "elbowEdgeStyle");
		    edge.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_CONNECTOR);
		    edge.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_CLASSIC);
		    edge.put(mxConstants.STYLE_VERTICAL_ALIGN, mxConstants.ALIGN_MIDDLE);
		    edge.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_CENTER);
		    edge.put(mxConstants.STYLE_STROKECOLOR, "#000000");
		    edge.put(mxConstants.STYLE_FONTCOLOR, "#3084a8");
		    edge.put(mxConstants.STYLE_FONTSIZE, "30");
		    edge.put(mxConstants.STYLE_FONTFAMILY, "Rockwell Condensed");
		    mxStylesheet edgeStyle = new mxStylesheet();
		    edgeStyle.setDefaultEdgeStyle(edge);
		    graph.setStylesheet(edgeStyle);
		    //Fin estilo flechas
	try{
		
		
	 pintarArbol(arbol, graph,null );
	
	}finally{
	   graph.getModel().endUpdate();
	}
	
	graph.setCellsMovable(false);
	graph.setCellsEditable(false);
	graph.setCellsBendable(false);
	graph.setCellsLocked(true);
	graph.setCellsSelectable(false);
	graph.setCellsResizable(true);
	
	mxIGraphLayout layout = new mxHierarchicalLayout(graph);
    layout.execute(graph.getDefaultParent());

    final mxGraphComponent graphComponent = new mxGraphComponent(graph);
    graphComponent.setBackground(Color.WHITE);
	
    JPanel arbolPanel = new JPanel();
    JPanel panel = new JPanel();
    JTextField tex = new JTextField();
	panel = new JPanel();
	arbolPanel = new JPanel();
	arbolPanel.setLayout(new GridLayout(1, 1));
	arbolPanel.add(graphComponent);
	//arbolPanel.setSize(graphComponent.getSize());
	this.add(graphComponent,BorderLayout.CENTER);

	JButton boton = new JButton("Buscar");
	boton.setFont(new Font ("Rockwell Condensed", Font.BOLD, 20));
	boton.setBackground(Color.CYAN);
	boton.addActionListener(new ActionListener( ) {
		@Override
		public void actionPerformed(ActionEvent e) {
			String cadena = tex.getText();
			cadena.trim();
			String aux[] = cadena.split(",");
			if(aux.length == arbol.getAtributos().size()) {
				ArrayList<String> ejemplos = new ArrayList<>();
				for(String a : aux) {
					ejemplos.add(a);
				}
				TComprobacion tComprobacion = new TComprobacion(tDatos.getPositivo(), tDatos.getNegativo(), arbol, arbol.getAtributos(), ejemplos);
				Controlador.getInstance().accion(new Contexto(Events.COMPROBAR, tComprobacion));
			}
			else {
				JLabel label = new JLabel("Faltan atributos. Tienen que ser " + arbol.getAtributos().size());
				label.setFont(new Font("Rockwell Condensed", Font.BOLD, 24));
				JOptionPane.showMessageDialog(null, label, "¡Alerta!", JOptionPane.ERROR_MESSAGE);
			}
		}
	});
	
	JButton boton2 = new JButton("Volver");
	boton2.setFont(new Font ("Rockwell Condensed", Font.BOLD, 25));
	boton2.setBackground(Color.CYAN);
	boton2.addActionListener(new ActionListener( ) {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Controlador.getInstance().accion(new Contexto(Events.GUI_MAIN, null));
		}
	});
	
	
	
	panel.setLayout(new GridLayout(2,2));
	PlaceHolder tf = new PlaceHolder(tex, "Introduce los atributos separados por comas");
	tf.setFont("Rockwell Condensed");
	tex.setFont(new java.awt.Font("Rockwell Condensed", Font.BOLD, 20));
	tex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	
	
	JPanel panelArriba = new JPanel();
	JPanel panelAbajo = new JPanel();
	panelArriba.setLayout(new GridLayout(1,2));
	panelArriba.add(boton);
	panelArriba.add(tex);
	panelAbajo.add(boton2);
	panel.add(panelArriba, BorderLayout.NORTH);
	panel.add(panelAbajo, BorderLayout.SOUTH);

	
	this.add(panel,BorderLayout.PAGE_END);
	this.setSize(graphComponent.getSize());

	this.pack();	
	this.setResizable(false);
	this.setVisible(true);
	this.setLocationRelativeTo(null);
	
	}

	private void pintarArbol(Nodo padre, mxGraph graph, Object verticePadre){		
		Object v1;		
		if(verticePadre!=null){
			v1 = verticePadre;
		}else {
			v1 = graph.insertVertex(graph.getDefaultParent(), null, padre.getNombre(),0, 0, 150,50,  padre.getNombre(), false);
		}
		graph.setCellStyles(mxConstants.STYLE_FILLCOLOR, "#3084a8", new Object[]{v1});
		graph.setCellStyles(mxConstants.STYLE_FONTCOLOR, "#f2eaeb", new Object[]{v1});
		graph.setCellStyles(mxConstants.STYLE_FONTFAMILY, "Rockwell Condensed", new Object[]{v1});
		graph.setCellStyles(mxConstants.STYLE_FONTSIZE, "30", new Object[]{v1});
		for(Nodo edge: padre.getHijos()){
			for(Nodo vertices: edge.getHijos()) {
			   Object v2 = graph.insertVertex(graph.getDefaultParent(), null, vertices.getNombre(),0,0,150,50);
			   graph.setCellStyles(mxConstants.STYLE_FILLCOLOR, "#e01a31", new Object[]{v2});
			   graph.setCellStyles(mxConstants.STYLE_FONTCOLOR, "#f2eaeb", new Object[]{v2});
			   graph.setCellStyles(mxConstants.STYLE_FONTFAMILY, "Rockwell Condensed", new Object[]{v2});
			   graph.setCellStyles(mxConstants.STYLE_FONTSIZE, "30", new Object[]{v2});
			   graph.insertEdge(graph.getDefaultParent(), null, edge.getNombre(), v1, v2);
			   if(vertices.getHijos().size()>0)
			   		pintarArbol(vertices, graph, v2);   	
			}
		}	
	}

	public void setArbol(Nodo arbol) {
		this.arbol = arbol;
	}

	public TDatos getTDatos() {
		return tDatos;
	}

	public void setTDatos(TDatos tDatos) {
		this.tDatos = tDatos;
	}
	
}
