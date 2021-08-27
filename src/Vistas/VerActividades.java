/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BD.Conexion;
import Clases.Actividad;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class VerActividades extends javax.swing.JPanel {

    /**
     * Creates new form PanelVacio
     */
    Principal main;
    public VerActividades(Principal main) {
        initComponents();
        this.main=main;
        cargarAct();
        tfBuscar.setText("Buscar");
    }
    
    public void cargarAct(){
        DefaultTableModel mdl = (DefaultTableModel) tActividades.getModel();
        mdl.setRowCount(0);
        Iterator<Actividad> it = main.actividades.iterator();
        while (it.hasNext()) {
            Actividad s = it.next();
            if (s.isVigente()) {  
                Object[] fila = new Object[3];
                fila[0] = s;
                fila[1] = s.getCupos();
                fila[2] = s.showHorarios();
                mdl.addRow(fila); 
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tActividades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Cupos", "Horarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tActividades);
        if (tActividades.getColumnModel().getColumnCount() > 0) {
            tActividades.getColumnModel().getColumn(0).setResizable(false);
            tActividades.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Actividades");

        tfBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBuscarFocusLost(evt);
            }
        });
        tfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(194, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnBuscar)))))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tActividadesMouseClicked
        // TODO add your handling code here:
        if(tActividades.getSelectedRowCount()==1){
            main.AbrirDetallesActividad( new DetallesActividad(main,(Actividad) tActividades.getValueAt(tActividades.getSelectedRow(), 0)));
        }
    }//GEN-LAST:event_tActividadesMouseClicked

    public void buscarSocios(String buscar){
        DefaultTableModel mdl = (DefaultTableModel) tActividades.getModel();
        Iterator<Actividad> it = main.actividades.iterator();
        mdl.setRowCount(0);
        while (it.hasNext()) {
            Actividad s = it.next();
            if (s.isVigente() && s.getNombre().toUpperCase().contains(buscar.toUpperCase())) {  
                Object[] fila = new Object[4];
                fila[0] = s;
                fila[1] = s.getCupos();
                fila[2] = s.getHorarios();
                mdl.addRow(fila); 
            }
        }
    }
    
    private void tfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarKeyReleased
        // TODO add your handling code here:
        if(tfBuscar.getText().equals("")){
            cargarAct();
        }
        else
            buscarSocios(tfBuscar.getText());
    }//GEN-LAST:event_tfBuscarKeyReleased

    private void tfBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarFocusGained
        // TODO add your handling code here:
        if(tfBuscar.getText().trim().equals("Buscar")){
            tfBuscar.setText("");
        }
    }//GEN-LAST:event_tfBuscarFocusGained

    private void tfBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBuscarFocusLost
        // TODO add your handling code here:
        if(tfBuscar.getText().trim().equals("")){
            tfBuscar.setText("Buscar");
        }
    }//GEN-LAST:event_tfBuscarFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tActividades;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables
}
