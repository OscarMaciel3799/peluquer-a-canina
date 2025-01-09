
package com.mycompany.peluqueriacanina.igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.ControladoraLogica;
import logica.Mascota;

public class VerDatos extends javax.swing.JFrame {

    ControladoraLogica control=new ControladoraLogica();
    
    public VerDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JButton();
        lblEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 187, 193));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("visualizacion de datos");

        tablaMascotas.setBackground(new java.awt.Color(255, 255, 255));
        tablaMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaMascotas.setForeground(new java.awt.Color(255, 255, 255));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaMascotas.setSelectionBackground(new java.awt.Color(35, 187, 193));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 187, 193));
        jLabel2.setText("Datos de Mascotas:");

        lblEliminar.setBackground(new java.awt.Color(35, 187, 193));
        lblEliminar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setText("Eliminar");
        lblEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEliminarActionPerformed(evt);
            }
        });

        lblEditar.setBackground(new java.awt.Color(35, 187, 193));
        lblEditar.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");
        lblEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEliminarActionPerformed
        //Controlamos que la tabla no este vacia
        if(tablaMascotas.getRowCount()>0){
            //Controlo que se haya seleccionado una mascota
            if(tablaMascotas.getSelectedRow()!=-1){
                //Buscamos el id de la mascota a eliminar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0)));
                //Llamo al metodo borrar
                control.borrarMascota(num_cliente);
                
                //Aviso al usuario
                 mostrarMensaje("Mascota eliminada correctamente", "info", "Borrado de Mascota");
                 cargarTabla();
            }else{
               mostrarMensaje("No selecciono ninguna mascota", "error", "Error al eliminar"); 
            }
            
        }else{
            mostrarMensaje("No hay nada para eliminar en la tabla", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_lblEliminarActionPerformed
   
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
    
    
    
    private void lblEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEditarActionPerformed
        if(tablaMascotas.getRowCount()>0){
            //Controlo que se haya seleccionado una mascota
            if(tablaMascotas.getSelectedRow()!=-1){
                //Buscamos el id de la mascota que se desea editar
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0)));
                
                ModificarDatos pantallamodif= new ModificarDatos(num_cliente);
                pantallamodif.setVisible(true);
                pantallamodif.setLocationRelativeTo(null);
                
                this.dispose();
            }else{
               mostrarMensaje("No selecciono ninguna mascota", "error", "Error al editar"); 
            }
            
        }else{
            mostrarMensaje("No hay nada para editar en la tabla", "error", "Error al editar");
        }
    }//GEN-LAST:event_lblEditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblEditar;
    private javax.swing.JButton lblEliminar;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definimos el modelo de la tabla
        DefaultTableModel modeloTabla=new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas
        String titulos[] = {"Num","Nombre","Color","Raza","Alergico","At. Esp.","Dueño","Cel Dueño"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Cargamos los datos de la base de datos
        List<Mascota> listaMascotas=control.traerMascotas();
        
        //Recorremos cada elemento de la lista y los mostramos en la tabla
        if(listaMascotas!=null){
            for(Mascota masco:listaMascotas){
                Object[] objeto={masco.getNum_cliente() , masco.getNombre(), masco.getColor(), masco.getRaza(),
                masco.getAlergico(), masco.getAtenEsp(),masco.getUnDueño().getNombre(), masco.getUnDueño().getCelDueño()};
                
                modeloTabla.addRow(objeto);
            }
        }
        
        tablaMascotas.setModel(modeloTabla);
    }
}
