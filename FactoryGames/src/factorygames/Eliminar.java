
package factorygames;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego-PC
 */
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMostrarJ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNom = new javax.swing.JLabel();
        jTextIngreseTit = new javax.swing.JTextField();
        jButtEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jButtonMostrarJ1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButtonMostrarJ.setText("Mostrar Juegos en Lista");
        jButtonMostrarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarJActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabelNom.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelNom.setForeground(new java.awt.Color(0, 0, 255));
        jLabelNom.setText("Nombre del Juego:");

        jTextIngreseTit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jButtEliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButtEliminar.setForeground(new java.awt.Color(204, 0, 0));
        jButtEliminar.setText("Eliminar");
        jButtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtEliminarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Juego", "Plataforma Juego", "Precio", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableDatos);

        jButtonMostrarJ1.setText("Mostrar Juegos en Lista");
        jButtonMostrarJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarJ1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("(nota: el juego debe salir tal cual está en la lista)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNom)
                .addGap(54, 54, 54)
                .addComponent(jTextIngreseTit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButtEliminar)
                        .addGap(86, 86, 86)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jButtonMostrarJ1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonMostrarJ1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jTextIngreseTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNom)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtEliminar))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarJActionPerformed
        String nombre_juego = null;
        String  plataforma_juego;
        int precio_juego;
        boolean estado_juego;

        Registro rg = new Registro();
        DefaultTableModel modelo = (DefaultTableModel) jTableDatos.getModel();

        modelo.setRowCount(0);

        if (nombre_juego == null) {
            List<Juego> lista = rg.buscarTodos();

            for (Juego tmp : lista) {
                nombre_juego = tmp.getNombre_juego();
                plataforma_juego = tmp.getPlataforma_juego();
                precio_juego = tmp.getPrecio_juego();
                estado_juego = tmp.isEstado_juego();

                modelo.addRow(new Object[]{nombre_juego, plataforma_juego, precio_juego, estado_juego});
            }

        } else {
            Juego juego = rg.buscarPorNom(nombre_juego);
            nombre_juego = juego.getNombre_juego();
            plataforma_juego = juego.getPlataforma_juego();
            precio_juego = juego.getPrecio_juego();
            estado_juego = juego.isEstado_juego();

            modelo.addRow(new Object[]{nombre_juego, plataforma_juego, precio_juego, estado_juego});

        }
    }//GEN-LAST:event_jButtonMostrarJActionPerformed

    private void jButtonMostrarJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarJ1ActionPerformed
        String nombre_juego = null;
        String  plataforma_juego;
        int precio_juego;
        boolean estado_juego;

        Registro rg = new Registro();
        DefaultTableModel modelo = (DefaultTableModel) jTableDatos.getModel();

        modelo.setRowCount(0);

        if (nombre_juego == null) {
            List<Juego> lista = rg.buscarTodos();

            for (Juego tmp : lista) {
                nombre_juego = tmp.getNombre_juego();
                plataforma_juego = tmp.getPlataforma_juego();
                precio_juego = tmp.getPrecio_juego();
                estado_juego = tmp.isEstado_juego();

                modelo.addRow(new Object[]{nombre_juego, plataforma_juego, precio_juego, estado_juego});
            }

        } else {
            Juego juego = rg.buscarPorNom(nombre_juego);
            nombre_juego = juego.getNombre_juego();
            plataforma_juego = juego.getPlataforma_juego();
            precio_juego = juego.getPrecio_juego();
            estado_juego = juego.isEstado_juego();

            modelo.addRow(new Object[]{nombre_juego, plataforma_juego, precio_juego, estado_juego});

        }
    }//GEN-LAST:event_jButtonMostrarJ1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtEliminarActionPerformed
        String nombre_juego;
        
            
        nombre_juego = jTextIngreseTit.getText();
        if (nombre_juego.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese nombre", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextIngreseTit.requestFocus();
            return;
        }            
        
        Registro rg = new Registro();
        
        if(rg.buscarPorNom(nombre_juego).getNombre_juego().equals(nombre_juego)){
            if(rg.eliminar(nombre_juego)){
                JOptionPane.showMessageDialog(this, "Se eliminó el juego " + nombre_juego, "Información", JOptionPane.INFORMATION_MESSAGE);               
            }else {
                JOptionPane.showMessageDialog(this, "No se logró eliminar el juego  " + nombre_juego, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El Juego " + nombre_juego+ " no existe", "Información", JOptionPane.WARNING_MESSAGE);
        }
        
        
           
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtEliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonMostrarJ;
    private javax.swing.JButton jButtonMostrarJ1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTextIngreseTit;
    // End of variables declaration//GEN-END:variables
}
