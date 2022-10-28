/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTable;
import negocio.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Elias Campo
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    
    public PantallaPrincipal() {
        initComponents();
        this.mostrarDatosFactura();
        this.mostrarDatosDetalle(3, 0);
        
    }
    
    int ID, varGlobalOpcion;
    String cuit, producto, cantidad;

    
    @SuppressWarnings("unchecked")
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        id = new javax.swing.JLabel();
        txtId1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFact = new javax.swing.JTable();
        txtCuit = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFactDetalle = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregarDetalle = new javax.swing.JButton();
        btnEditarDetalle = new javax.swing.JButton();
        btnBorrarDetalle = new javax.swing.JButton();
        txtIdProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnCancelarDetalle = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id.setText("ID");

        txtId1.setEditable(false);
        txtId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId1ActionPerformed(evt);
            }
        });

        jLabel2.setText("CUIT");

        tablaFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFactMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFact);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        tablaFactDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaFactDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFactDetalleMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaFactDetalle);

        jLabel3.setText("Producto");

        jLabel4.setText("Cantidad");

        jLabel5.setText("DETALLE");

        jLabel6.setText("FACTURA");

        btnAgregarDetalle.setText("Agregar");
        btnAgregarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDetalleActionPerformed(evt);
            }
        });

        btnEditarDetalle.setText("Editar");
        btnEditarDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarDetalleMouseClicked(evt);
            }
        });

        btnBorrarDetalle.setText("Borrar");
        btnBorrarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDetalleActionPerformed(evt);
            }
        });

        txtIdProducto.setEditable(false);

        jLabel1.setText("Id producto");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCancelarDetalle.setText("Cancelar");
        btnCancelarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBorrar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarDetalle)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarDetalle)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarDetalle)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarDetalle))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBorrar)
                                    .addComponent(btnEditar)
                                    .addComponent(btnAgregar)
                                    .addComponent(btnCancelar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id)
                                    .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarDetalle)
                    .addComponent(btnEditarDetalle)
                    .addComponent(btnBorrarDetalle)
                    .addComponent(btnCancelarDetalle))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId1ActionPerformed

    
    // hacemos clik en la tabla y nos carga todo en los cuadraditos del costado en el menu     
    private void tablaFactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFactMouseClicked
        varGlobalOpcion=2;
        
        JTable tabla=(JTable)evt.getSource(); 
        int idFactura = Integer.parseInt(tabla.getModel().getValueAt(tabla.getSelectedRow(),0).toString());
        
        this.mostrarDatosDetalle(2,idFactura );
        
        if(evt.getClickCount()==1){
            
            JTable receptor=(JTable)evt.getSource(); 
            
            try{
                txtId1.setText(receptor.getModel().getValueAt (receptor.getSelectedRow(),0).toString());
                txtCuit.setText(receptor.getModel().getValueAt (receptor.getSelectedRow(),1).toString());
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true); 
    
       
    }//GEN-LAST:event_tablaFactMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        varGlobalOpcion=3;
        cuit=(txtCuit.getText());
        
        Factura objDatos=recuperarDatosFactura();
        objDatos.botonAgregar(1,cuit, "", 0, 0 ); //(producto, cantidad, id)
        
        this.mostrarDatosFactura();
        this.mostrarDatosDetalle(3,0);
        this.limpiar();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Factura objDatos = recuperarDatosFactura();
        objDatos.botonBorrar(Integer.parseInt(txtId1.getText()), 1);
        
        this.mostrarDatosFactura();
        this.limpiar();
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDetalleActionPerformed
        
        Factura objDatos=recuperarDatosFacturaDetalle();// Factura objDatos = new Factura();
        producto = (txtProducto.getText());
        cantidad = (txtCantidad.getText());
        
        int idFactura =(txtId1.getText().isEmpty())?0: Integer.parseInt(txtId1.getText());
            
        objDatos.botonAgregar(3, "" ,producto , Integer.parseInt(cantidad) , idFactura ); //(producto, cantidad, id)
        
        this.mostrarDatosDetalle(varGlobalOpcion, idFactura);
        this.limpiarDetalle();
        
        btnAgregar.setEnabled(false);
        btnBorrar.setEnabled(true);
        btnEditar.setEnabled(true);

        
    }//GEN-LAST:event_btnAgregarDetalleActionPerformed

    private void tablaFactDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFactDetalleMouseClicked

        JTable tabla=(JTable)evt.getSource(); 
        int idFactura =(txtId1.getText().isEmpty())?0: Integer.parseInt(txtId1.getText());

        if(evt.getClickCount()==1){
            
            JTable receptor=(JTable)evt.getSource(); 
            
            try{
                txtIdProducto.setText(receptor.getModel().getValueAt (receptor.getSelectedRow(),0).toString());
                txtProducto.setText(receptor.getModel().getValueAt (receptor.getSelectedRow(),2).toString());
                txtCantidad.setText(receptor.getModel().getValueAt (receptor.getSelectedRow(),3).toString());

                
                this.mostrarDatosDetalle(2,idFactura);
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        
        btnAgregar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true); 
    
       
    } 
  
    }//GEN-LAST:event_tablaFactDetalleMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
       Factura objDatos=recuperarDatosFactura();
        objDatos.Editar(Integer.parseInt(txtId1.getText()),txtCuit.getText(), 0, "", 0,1);
        
        this.mostrarDatosFactura();
        this.limpiar();
  
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarDetalleMouseClicked
         Factura objDatos=recuperarDatosFacturaDetalle();
         int idFactura =(txtId1.getText().isEmpty())?0: Integer.parseInt(txtId1.getText());
         
        objDatos.Editar(0, "" ,Integer.parseInt(txtIdProducto.getText()),txtProducto.getText() , Integer.parseInt(txtCantidad.getText()), 2);
        
        this.mostrarDatosDetalle(2, idFactura);
        this.limpiarDetalle();
        btnAgregar.setEnabled(false);
        btnBorrar.setEnabled(true);
        btnEditar.setEnabled(true);
 
    }//GEN-LAST:event_btnEditarDetalleMouseClicked

    private void btnBorrarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDetalleActionPerformed
         Factura objDatos = recuperarDatosFactura();
        objDatos.botonBorrar(Integer.parseInt(txtIdProducto.getText()), 2);
        
        this.mostrarDatosDetalle(2,Integer.parseInt(txtId1.getText()));
        this.limpiarDetalle();
  
        
    }//GEN-LAST:event_btnBorrarDetalleActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.mostrarDatosDetalle(2, 0);
        this.limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDetalleActionPerformed
        
        this.mostrarDatosDetalle(2, 0);
        this.limpiarDetalle();
        btnEditar.setEnabled(true);
        
    }//GEN-LAST:event_btnCancelarDetalleActionPerformed


    public void mostrarDatosFactura(){
        Factura objDatos = new Factura();

            tablaFact.setModel(objDatos.buscarTodos(1,0));

    }
    
    public void mostrarDatosDetalle(int opcion, int id){
        Factura objDatos = new Factura();
        
        if (opcion == 2){
            tablaFactDetalle.setModel(objDatos.buscarTodos(2, id));
        }
        else { 
            if (opcion == 3){
                tablaFactDetalle.setModel(objDatos.buscarTodos(3,id));
            }
        } 

    }
    
   public Factura recuperarDatosFactura (){
       Factura fact = new Factura();
       
       int ID =(txtId1.getText().isEmpty())?0: Integer.parseInt(txtId1.getText());
       
       fact.setCuit(txtCuit.getText());
       
       return fact;
       
   } 
   
   
      public Factura recuperarDatosFacturaDetalle (){
         Factura fact = new Factura();
       
       int Producto =(txtId1.getText().isEmpty())?0: Integer.parseInt(txtId1.getText());
       
       fact.setProducto(txtProducto.getText());
       fact.setCantidad(Integer.parseInt(txtCantidad.getText()));
          
       
       return fact;
       
   } 
   
   
   public void limpiar(){
       txtId1.setText("");
       txtCuit.setText("");
       
       btnAgregar.setEnabled(true);
       btnBorrar.setEnabled(false);
       btnEditar.setEnabled(false);
   
   }
   
   
   public void limpiarDetalle(){
       txtProducto.setText("");
       txtCantidad.setText("");
       txtIdProducto.setText("");
       
       btnAgregar.setEnabled(true);
       btnBorrar.setEnabled(false);
       btnEditar.setEnabled(false);
   
   
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarDetalle;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarDetalle;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarDetalle;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarDetalle;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaFact;
    private javax.swing.JTable tablaFactDetalle;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
