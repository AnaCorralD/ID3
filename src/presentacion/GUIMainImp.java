package presentacion;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import arbol.Nodo;
import controlador.Controlador;
import negocio.TDatos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana Corral
 */
public class GUIMainImp extends GUIMain {

    /**
     * Creates new form GUIMainImp
     */
    public GUIMainImp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	this.setTitle("Algoritmo ID3 - Ana Laura Corral Descargue");
    	this.setMinimumSize(new Dimension(800,550));
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        tituloAtributo = new javax.swing.JLabel();
        tituloEjemplo = new javax.swing.JLabel();
        tituloNyP = new javax.swing.JLabel();
        positivo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAtributo = new javax.swing.JTextField();
        jTextFieldEjemplo = new javax.swing.JTextField();
        jTextFieldPositivo = new javax.swing.JTextField();
        jTextFieldNegativo = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));
        setForeground(new java.awt.Color(51, 204, 255));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        titulo.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Algoritmo ID3");

        tituloAtributo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tituloAtributo.setText("Nombre del archivo de los atributos:");

        tituloEjemplo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tituloEjemplo.setText("Nombre del archivo de los ejemplos:");

        tituloNyP.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        tituloNyP.setText("Indicar el valor positivo y negativo");

        positivo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        positivo.setText("Positivo:");

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel1.setText("Negativo");

        jTextFieldAtributo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jTextFieldAtributo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldEjemplo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jTextFieldEjemplo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldPositivo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jTextFieldPositivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldNegativo.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jTextFieldNegativo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    
        jButtonAceptar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAceptar.setContentAreaFilled(false);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(positivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPositivo)
                                    .addComponent(jTextFieldNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloNyP, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloEjemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAtributo)
                                    .addComponent(jTextFieldEjemplo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                            .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(197, 197, 197)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(225, 225, 225)))
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(titulo)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloEjemplo)
                        .addComponent(jTextFieldEjemplo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(tituloNyP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(positivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldPositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

   

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
    	String archivoAtributo = "", archivoEjemplo = "", positivo ="", negativo ="";
    	int nErrores = 0;
    	if(!this.jTextFieldAtributo.getText().matches("^(?!\\s*$).+")){
    		nErrores++;
    	}
    	else {
    		archivoAtributo = this.jTextFieldAtributo.getText();;
    	}
    	if(!this.jTextFieldEjemplo.getText().matches("^(?!\\s*$).+")){
    		nErrores++;
    	}
    	else {
    		archivoEjemplo = this.jTextFieldEjemplo.getText();;
    	}
    	if(!this.jTextFieldPositivo.getText().matches("^(?!\\s*$).+")){
    		nErrores++;
    	}
    	else {
    		positivo = this.jTextFieldPositivo.getText();;
    	}
    	if(!this.jTextFieldNegativo.getText().matches("^(?!\\s*$).+")){
    		nErrores++;
    	}
    	else {
    		negativo = this.jTextFieldNegativo.getText();
    	}
    	if(nErrores == 0) {
    		this.clearData();
    		TDatos tDatos = new TDatos(archivoAtributo, archivoEjemplo, positivo, negativo);
    		Controlador.getInstance().accion(new Contexto(Events.BUSCAR_ID3, tDatos));
    	}
    	else {
    		JLabel label = new JLabel("<html><body>Todos los campos son obligatorios</body></html>");
			label.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
			JOptionPane.showMessageDialog(null, label, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
    	}
    }//GEN-LAST:event_jButtonAceptarActionPerformed
    
    private void clearData() {
		this.jTextFieldAtributo.setText("");
		this.jTextFieldEjemplo.setText("");
		this.jTextFieldNegativo.setText("");
		this.jTextFieldPositivo.setText("");
		this.setVisible(false);
	}
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
    	JLabel label = new JLabel("<html><body>Vuelve pronto<center>😄</center></body></html>");
		label.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		JOptionPane.showMessageDialog(null, label, "¡Hasta pronto!", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAtributo;
    private javax.swing.JTextField jTextFieldEjemplo;
    private javax.swing.JTextField jTextFieldNegativo;
    private javax.swing.JTextField jTextFieldPositivo;
    private javax.swing.JLabel positivo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloAtributo;
    private javax.swing.JLabel tituloEjemplo;
    private javax.swing.JLabel tituloNyP;
    // End of variables declaration//GEN-END:variables
	@Override
	public void actualizar(Contexto contexto) {
		int evento = contexto.getEvento();
		switch(evento) {
		case(Events.GUI_MAIN):
			this.setVisible(true);
		break;
		case(Events.BUSCAR_OK):
			Nodo nodo = (Nodo) contexto.getDato();
			GUIArbol vista = GUIArbol.getInstance();
			vista.setArbol(nodo);
			vista.initView();
		break;
		case(Events.BUSCAR_KO):
			this.setVisible(true);
			int res = (int) contexto.getDato();
			switch(res){
			case(-1):
				JLabel label1 = new JLabel("<html><body>Fallo en la lectura del archivo de ejemplos</body></html>");
				label1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
				JOptionPane.showMessageDialog(null, label1, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
			break;
			case(-2):
				JLabel label2 = new JLabel("<html><body>No coincide el valor del positivo y/o negativo</body></html>");
				label2.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
				JOptionPane.showMessageDialog(null, label2, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
			break;
			case(-3):
				JLabel label3 = new JLabel("<html><body>Fallo en la lectura del archivo de atributos</body></html>");
				label3.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
				JOptionPane.showMessageDialog(null, label3, "¡Aviso!", JOptionPane.INFORMATION_MESSAGE);
			break;
			}
		break;
		}
		
	}
}