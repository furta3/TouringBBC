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
import Clases.Actividad;
import Clases.Categoria;
import Clases.Cuota;
import Clases.Funcionario;
import Clases.Jugador;
import Clases.Socio;
import Clases.TipoSocio;

import java.awt.Component;
import java.awt.Container;
import java.awt.PopupMenu;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
public class Principal extends javax.swing.JFrame {


    static Principal padre;
    static AltaSocio aj;
    static AltaActividad aa;
    static AsociarActividad asac;
    static AltaCuota ac;
    static VerSocios vs;
    static AbmTipoSocios ats;
    Inicio i = new Inicio();
    static VerActividades vact;
    static DetallesActividad da;
    static DetallesSocio dju;
    
    public static List<Cuota> cuotas;
    public static List<Actividad> actividades;
    public static List<Socio> socios;
    public static List<Categoria> categorias;
    public static List<TipoSocio> tiposSocios;
    public static List<Jugador> jugadores;
    public static List<Funcionario> funcionarios;
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/touringIco.png")).getImage());
        Conexion.getInstance();
        this.padre = this;
        AbrirInicio();
        cargarDatos();
        //ImageIcon icono = new ImageIcon("src/Images/ico.png");
        //this.setIconImage(icono.getImage());
    }
    
    public void verificarCategorias(){
        Iterator<Jugador> it = jugadores.iterator();
        Date hoy = new Date();
        while (it.hasNext()) {
            Jugador j = it.next();
            if (j.isVigente() && (hoy.getYear()-j.getFechaNac().getYear() > j.getPlantel().getEdadMax()) && categorias.get(categorias.size()-1) != j.getPlantel()) {  
                j.setPlantel( categorias.get(categorias.indexOf(j.getPlantel())+1) );
                Conexion.getInstance().merge(j);
                jugadores.add(jugadores.indexOf(j), j);
            }
        }
    }
    
    public void cargarDatos(){
        cuotas = Conexion.getInstance().getCuotas();
        actividades = Conexion.getInstance().getActividades();
        socios = Conexion.getInstance().getSocios();
        categorias = Conexion.getInstance().getCategorias();
        tiposSocios = Conexion.getInstance().getTiposSocios();
        
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
        mSTipos = new javax.swing.JMenuItem();
        mSCategorias = new javax.swing.JMenuItem();
        mActividades = new javax.swing.JMenu();
        mAVer = new javax.swing.JMenuItem();
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
        setTitle("Touring BBC");
        setBackground(new java.awt.Color(36, 36, 36));
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

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

        mSTipos.setText("Tipos");
        mSTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSTiposActionPerformed(evt);
            }
        });
        mSocios.add(mSTipos);

        mSCategorias.setText("Categorías");
        mSCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSCategoriasActionPerformed(evt);
            }
        });
        mSocios.add(mSCategorias);

        jMenuBar1.add(mSocios);

        mActividades.setBackground(new java.awt.Color(255, 255, 255));
        mActividades.setText("Actividades");
        mActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActividadesActionPerformed(evt);
            }
        });

        mAVer.setText("Ver");
        mAVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAVerActionPerformed(evt);
            }
        });
        mActividades.add(mAVer);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
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
        AbrirInicio();
    }//GEN-LAST:event_mIInicioActionPerformed

    private void mAAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAAgregarActionPerformed
        // TODO add your handling code here:
        aa = new AltaActividad(this);
        aa.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(aa);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_mAAgregarActionPerformed

    private void mSASocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSASocioActionPerformed
        // TODO add your handling code here:
        AbrirAltaSocio(new AltaSocio(this,null));
    }//GEN-LAST:event_mSASocioActionPerformed

    private void mSVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSVerActionPerformed
        // TODO add your handling code here:
        AbrirVerSocios(new VerSocios(this));
    }//GEN-LAST:event_mSVerActionPerformed

    private void mCAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCAgregarActionPerformed
        // TODO add your handling code here:
        AbrirAltaCuota(new AltaCuota(this));
        
    }//GEN-LAST:event_mCAgregarActionPerformed

    private void mSTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSTiposActionPerformed
        // TODO add your handling code here:
        AbrirAbmTiposSocios(new AbmTipoSocios(this));
    }//GEN-LAST:event_mSTiposActionPerformed

    private void mSCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSCategoriasActionPerformed
        // TODO add your handling code here:
        AbrirAbmCategorias(new AbmCategorias(this));
    }//GEN-LAST:event_mSCategoriasActionPerformed

    private void mAVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAVerActionPerformed
        // TODO add your handling code here:
        vact=new VerActividades(this);
        AbrirVerActividades();
    }//GEN-LAST:event_mAVerActionPerformed
    
    public static void AbrirDetallesJugador(DetallesSocio djv){
        dju = djv;
        jPanel1.removeAll();
        jPanel1.add(dju);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirDetallesActividad(DetallesActividad dav){
        da = dav;
        jPanel1.removeAll();
        jPanel1.add(da);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirVerActividades(){
        jPanel1.removeAll();
        jPanel1.add(vact);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    public void AbrirAbmCategorias(AbmCategorias a){
        jPanel1.removeAll();
        jPanel1.add(a);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    public void AbrirInicio(){
        jPanel1.removeAll();
        jPanel1.add(i);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirAbmTiposSocios(AbmTipoSocios atsv){
        ats = atsv;
        ats.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(ats);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirVerSocios(VerSocios vsv){
        vs = vsv;
        vs.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(vs);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirAsociarActividad(AsociarActividad alJu){
        asac = alJu;
        asac.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(asac);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirAltaSocio(AltaSocio alJu){
        aj = alJu;
        aj.setVisible(true);
        jPanel1.removeAll();
        jPanel1.add(aj);
        jPanel1.repaint();
        jPanel1.revalidate();
    }
    
    public static void AbrirAltaCuota(AltaCuota acv){
        ac = acv;
        jPanel1.removeAll();
        jPanel1.add(ac);
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
    private javax.swing.JMenuItem mAVer;
    private javax.swing.JMenu mActividades;
    private javax.swing.JMenuItem mCAgregar;
    private javax.swing.JMenu mCuotas;
    private javax.swing.JMenuItem mIInicio;
    private javax.swing.JMenuItem mSASocio;
    private javax.swing.JMenuItem mSCategorias;
    private javax.swing.JMenuItem mSTipos;
    private javax.swing.JMenuItem mSVer;
    private javax.swing.JMenu mSocios;
    // End of variables declaration//GEN-END:variables
}
