/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author nacho
 */

import BD.Conexion;

import java.awt.Component;
import java.awt.Container;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
public class Principal extends javax.swing.JFrame {


    static Principal padre;
    static AltaJugador aj;
    //AltaContratacion altaCon;
    //Contrataciones con;

    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Conexion.getInstance();
        this.padre = this;
        ImageIcon icono = new ImageIcon("src/Images/ico.png");
        this.setIconImage(icono.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mNuevaCon = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mContrataciones = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buriano Fotograía Digital");
        setBackground(new java.awt.Color(36, 36, 36));
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        mNuevaCon.setBackground(new java.awt.Color(255, 255, 255));
        mNuevaCon.setText("Socios");
        mNuevaCon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("jMenu1");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mNuevaCon.add(jMenu1);

        jMenuBar1.add(mNuevaCon);

        mContrataciones.setBackground(new java.awt.Color(255, 255, 255));
        mContrataciones.setText("Contrataciones");
        mContrataciones.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jMenuBar1.add(mContrataciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        aj = new AltaJugador();
        aj.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(aj);
        //jPanel1.setVisible(true);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    
    /*public static void AbrirContrataciones(Contrataciones ctras){
        contrataciones = ctras;
        contrataciones.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(contrataciones);
        jPanel1.repaint();
        jPanel1.revalidate();
        
    }*/
    public static void vaciarVista(){
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mContrataciones;
    private javax.swing.JMenu mNuevaCon;
    // End of variables declaration//GEN-END:variables
}
