
package com.mycompany.peluqueriacanina.igu;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logica.ControladoraLogica;
import logica.Mascota;


public class ModificarDatos extends javax.swing.JFrame {

    ControladoraLogica control=new ControladoraLogica();
    int num_cliente;
    Mascota mascota;
    
    public ModificarDatos(int num_cliente) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        cargarDatos(num_cliente);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblAlergico = new javax.swing.JLabel();
        lblNomDueño = new javax.swing.JLabel();
        lblAtEsp = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        lblCelDueño = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNomDueño = new javax.swing.JTextField();
        txtCelDueño = new javax.swing.JTextField();
        cmbAlergia = new javax.swing.JComboBox<>();
        cmbAtEsp = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 187, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificación de datos");

        lblNombre.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");

        lblColor.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblColor.setForeground(new java.awt.Color(0, 0, 0));
        lblColor.setText("Color:");

        lblRaza.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblRaza.setForeground(new java.awt.Color(0, 0, 0));
        lblRaza.setText("Raza:");

        lblAlergico.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblAlergico.setForeground(new java.awt.Color(0, 0, 0));
        lblAlergico.setText("Alérgico:");

        lblNomDueño.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblNomDueño.setForeground(new java.awt.Color(0, 0, 0));
        lblNomDueño.setText("Nombre Dueño:");

        lblAtEsp.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblAtEsp.setForeground(new java.awt.Color(0, 0, 0));
        lblAtEsp.setText("Atencion Especial:");

        lblObservaciones.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        lblObservaciones.setText("Observaciones:");

        lblCelDueño.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblCelDueño.setForeground(new java.awt.Color(0, 0, 0));
        lblCelDueño.setText("Cel. Dueño:");

        btnGuardar.setBackground(new java.awt.Color(35, 187, 193));
        btnGuardar.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("guardar cambios");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(35, 187, 193));
        btnLimpiar.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\Users\\Oscar\\Downloads\\peluqueria-logo.png")); // NOI18N
        jLabel11.setMinimumSize(new java.awt.Dimension(719, 750));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));
        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtNomDueño.setBackground(new java.awt.Color(255, 255, 255));
        txtNomDueño.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        txtNomDueño.setForeground(new java.awt.Color(0, 0, 0));
        txtNomDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomDueñoActionPerformed(evt);
            }
        });

        txtCelDueño.setBackground(new java.awt.Color(255, 255, 255));
        txtCelDueño.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        txtCelDueño.setForeground(new java.awt.Color(0, 0, 0));
        txtCelDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelDueñoActionPerformed(evt);
            }
        });

        cmbAlergia.setBackground(new java.awt.Color(255, 255, 255));
        cmbAlergia.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        cmbAlergia.setForeground(new java.awt.Color(0, 0, 0));
        cmbAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        cmbAtEsp.setBackground(new java.awt.Color(255, 255, 255));
        cmbAtEsp.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        cmbAtEsp.setForeground(new java.awt.Color(0, 0, 0));
        cmbAtEsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        txtObservaciones.setForeground(new java.awt.Color(0, 0, 0));
        txtObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAlergico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomDueño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomDueño))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblColor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCelDueño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelDueño))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAtEsp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbAtEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRaza)
                                .addGap(18, 18, 18)
                                .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblObservaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaza)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlergico)
                            .addComponent(cmbAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAtEsp)
                            .addComponent(cmbAtEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomDueño)
                            .addComponent(txtNomDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCelDueño)
                            .addComponent(txtCelDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCelDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelDueñoActionPerformed

    private void txtNomDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomDueñoActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
    
    
    //Creamos un metodo para limpiar las pantalla al presionar el boton LIMPIAR
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cmbAlergia.setSelectedIndex(0);
        cmbAtEsp.setSelectedIndex(0);
        txtNomDueño.setText("");
        txtCelDueño.setText("");
        txtObservaciones.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    //Creamos un Metodo que traiga un JOptionPane para mostrar un mensaje
    public void mostrarMensaje(String mensaje,String tipo, String titulo){
        JOptionPane optionPane=new JOptionPane(mensaje);
        if(tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if(tipo.equals("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog=optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    //Creamos un metodo para guardar la informacion en la Base de Datos
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreMasco=txtNombre.getText();
        String raza=txtRaza.getText();
        String color=txtColor.getText();
        String alergia=(String) cmbAlergia.getSelectedItem();
        String atenEsp=(String) cmbAtEsp.getSelectedItem();
        String nombreDueño=txtNomDueño.getText();
        String celDueño=txtCelDueño.getText();
        String observaciones=txtObservaciones.getText();
        
        //LLamamos a la logica para que modifique los datos
        control.modificarDatos(mascota,nombreMasco,raza,color,alergia,atenEsp,nombreDueño,celDueño,observaciones);
        
        //Aviso al usuario
        mostrarMensaje("Datos modificados correctamente", "info", "Edicion correcta");
        
        //Volvemos a cargar la pantalla de ver datos
        VerDatos pantalla=new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        //Cerramos la ventana de edicion
        this.dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergia;
    private javax.swing.JComboBox<String> cmbAtEsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergico;
    private javax.swing.JLabel lblAtEsp;
    private javax.swing.JLabel lblCelDueño;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblNomDueño;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JTextField txtCelDueño;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNomDueño;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {
        this.mascota=control.traerMascota(num_cliente);
        txtNombre.setText(mascota.getNombre());
        txtRaza.setText(mascota.getRaza());
        txtColor.setText(mascota.getColor());
        txtNomDueño.setText(mascota.getUnDueño().getNombre());
        txtCelDueño.setText(mascota.getUnDueño().getCelDueño());
        txtObservaciones.setText(mascota.getObservaciones());
        
        if(mascota.getAlergico().equals("Si")){
            cmbAlergia.setSelectedIndex(1);
        }else if(mascota.getAlergico().equals("No")){
            cmbAlergia.setSelectedIndex(2);
        }
        
        if(mascota.getAtenEsp().equals("Si")){
            cmbAtEsp.setSelectedIndex(1);
        }else if(mascota.getAtenEsp().equals("No")){
            cmbAtEsp.setSelectedIndex(2);
        }
        
        
    }
}
