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
import Clases.Jugador;

import java.awt.Component;
import java.awt.Container;
import java.awt.PopupMenu;
import javax.swing.ImageIcon;
public class Principal extends javax.swing.JFrame {


    static Principal padre;
    static AltaSocio aj;
    static AltaActividad aa;
    static DetallesSocio dj;
    static AsociarActividad asac;
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
        jMenu1 = new javax.swing.JMenu();
        mIInicio = new javax.swing.JMenuItem();
        mSocios = new javax.swing.JMenu();
        mSVer = new javax.swing.JMenuItem();
        mSASocio = new javax.swing.JMenuItem();
        mActividades = new javax.swing.JMenu();
        mAAgregar = new javax.swing.JMenuItem();
        mCuotas = new javax.swing.JMenu();
        mCAgregar = new javax.swing.JMenuItem();

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

        jMenu1.setText("Principal");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mIInicio.setText("Inicio");
        mIInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIInicioActionPerformed(evt);
            }
        });
        jMenu1.add(mIInicio);

        jMenuBar1.add(jMenu1);

        mSocios.setBackground(new java.awt.Color(255, 255, 255));
        mSocios.setText("Socios");

        mSVer.setText("Ver");
        mSVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSVerActionPerformed(evt);
            }
        });
        mSocios.add(mSVer);

        mSASocio.setBackground(new java.awt.Color(255, 255, 255));
        mSASocio.setText("Agregar");
        mSASocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSASocioActionPerformed(evt);
            }
        });
        mSocios.add(mSASocio);

        jMenuBar1.add(mSocios);

        mActividades.setBackground(new java.awt.Color(255, 255, 255));
        mActividades.setText("Actividades");
        mActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActividadesActionPerformed(evt);
            }
        });

        mAAgregar.setText("Agregar");
        mAAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAAgregarActionPerformed(evt);
            }
        });
        mActividades.add(mAAgregar);

        jMenuBar1.add(mActividades);

        mCuotas.setText("Cuotas");

        mCAgregar.setText("Agregar");
        mCAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCAgregarActionPerformed(evt);
            }
        });
        mCuotas.add(mCAgregar);

        jMenuBar1.add(mCuotas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActividadesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mActividadesActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mIInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIInicioActionPerformed
        // TODO add your handling code here:
        vaciarVista();
    }//GEN-LAST:event_mIInicioActionPerformed

    private void mAAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAAgregarActionPerformed
        // TODO add your handling code here:
        System.out.println("Hola? en action");
        aa = new AltaActividad(this);
        aa.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(aa);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_mAAgregarActionPerformed

    private void mSASocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSASocioActionPerformed
        // TODO add your handling code here:
        AbrirAltaJugador(new AltaSocio(this));
    }//GEN-LAST:event_mSASocioActionPerformed

    private void mSVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSVerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mSVerActionPerformed

    private void mCAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCAgregarActionPerformed
        // TODO add your handling code here:
        AltaCuota ac = new AltaCuota(this);
        jPanel1.removeAll();
        jPanel1.add(ac);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_mCAgregarActionPerformed

    public static void AbrirAsociarActividad(AsociarActividad alJu){
        asac = alJu;
        asac.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(asac);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirAltaJugador(AltaSocio alJu){
        aj = alJu;
        aj.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(aj);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirDetallesJugador(DetallesSocio djp){
        dj = djp;
        dj.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(dj);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    /*public static void Abrir(Object vista){
        jPanel1.removeAll();
        jPanel1.add((jPanel) vista);
        jPanel1.repaint();
        jPanel1.revalidate();
    }*/
    
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
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mAAgregar;
    private javax.swing.JMenu mActividades;
    private javax.swing.JMenuItem mCAgregar;
    private javax.swing.JMenu mCuotas;
    private javax.swing.JMenuItem mIInicio;
    private javax.swing.JMenuItem mSASocio;
    private javax.swing.JMenuItem mSVer;
    private javax.swing.JMenu mSocios;
    // End of variables declaration//GEN-END:variables
}
