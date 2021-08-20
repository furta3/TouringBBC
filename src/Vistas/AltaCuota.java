/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BD.Conexion;
import Clases.Cuota;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class AltaCuota extends javax.swing.JPanel {

    /**
     * Creates new form PanelVacio
     */
    Cuota sel = null;
    Principal main;
    //List<Cuota> cuotas;
    public AltaCuota(Principal main) {
        initComponents();
        dcFecha.setDate(new Date());
        lMod.setVisible(false);
        btnCancelar.setVisible(false);
        //cuotas = Conexion.getInstance().getCuotas();
        this.main = main;
        cargarCuotas();
    }
    
    public void cargarCuotas(){
        Iterator<Cuota> it = main.cuotas.iterator();
        DefaultTableModel mdl = (DefaultTableModel) tCuotas.getModel();
        mdl.setRowCount(0);
        while (it.hasNext()) {
            Cuota s = it.next();
            if (s.isVigente()) {  
                Object[] fila = new Object[5];
                fila[0] = Conexion.sdf.format(s.getFecha());
                fila[1] = s;
                fila[2] = s.getMonto();
                fila[3] = s.getDescripcion();
                fila[4] = s.getFrecuencia();
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

        jLabel1 = new javax.swing.JLabel();
        lPlantel = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lCarnet1 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        lPlantel1 = new javax.swing.JLabel();
        tfMonto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDesc = new javax.swing.JTextArea();
        lPlantel2 = new javax.swing.JLabel();
        lPlantel3 = new javax.swing.JLabel();
        cbFrec = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tCuotas = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lMod = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Gestión cuota");

        lPlantel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lPlantel.setText("Nombre:");

        tfNombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lCarnet1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lCarnet1.setText("Fecha:");

        lPlantel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lPlantel1.setText("Monto:");

        tfMonto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        taDesc.setColumns(20);
        taDesc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        taDesc.setRows(5);
        jScrollPane1.setViewportView(taDesc);

        lPlantel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lPlantel2.setText("Descripción:");

        lPlantel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lPlantel3.setText("Frecuencia:");

        cbFrec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Anual" }));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tCuotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Nombre", "Monto", "Descripción", "Frecuencia"
            }
        ));
        tCuotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tCuotasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tCuotas);

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lMod.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lMod.setText("Modificando:");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(btnModificar)
                        .addGap(98, 98, 98)
                        .addComponent(btnBorrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCarnet1)
                                    .addComponent(lPlantel)
                                    .addComponent(lPlantel1)
                                    .addComponent(lPlantel2)
                                    .addComponent(lPlantel3))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfNombre)
                                        .addComponent(dcFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfMonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbFrec, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lMod))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addGap(97, 97, 97)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(583, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lCarnet1)
                                .addGap(18, 18, 18)
                                .addComponent(lPlantel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lPlantel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPlantel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPlantel3)
                            .addComponent(cbFrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrar)
                        .addComponent(btnModificar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar)
                        .addComponent(btnCancelar)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(btnAgregar.getText().equals("Agregar")){
            Cuota c = new Cuota();
            c.setMonto(Integer.parseInt(tfMonto.getText()));
            c.setNombre(tfNombre.getText());
            c.setFecha(dcFecha.getDate());
            c.setDescripcion(taDesc.getText());
            c.setFrecuencia(cbFrec.getSelectedItem().toString());
            c.setVigente(true);
            Conexion.getInstance().persist(c);
            main.cuotas.add(c);
            cargarCuotas();
            JOptionPane.showMessageDialog(this, "Cuota agregada con éxito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }
        else{
            sel.setMonto(Integer.parseInt(tfMonto.getText()));
            sel.setNombre(tfNombre.getText());
            sel.setFecha(dcFecha.getDate());
            sel.setDescripcion(taDesc.getText());
            sel.setFrecuencia(cbFrec.getSelectedItem().toString());
            Conexion.getInstance().merge(sel);
            btnAgregar.setText("Agregar");
            main.cuotas.set(main.cuotas.indexOf(sel),sel);
            cargarCuotas();
            tfNombre.setEditable(true);
            JOptionPane.showMessageDialog(this, "Cuota "+sel.getNombre()+" modificada.", "Información", JOptionPane.INFORMATION_MESSAGE);
            sel = null;
            limpiar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if(sel!=null){
            sel.setVigente(false);
            Conexion.getInstance().merge(sel);
            cargarCuotas();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if(sel!=null){
            lMod.setVisible(true);
            btnCancelar.setVisible(true);
            btnAgregar.setText("Confirmar");
            tfMonto.setText(Integer.toString(sel.getMonto()));
            tfNombre.setText(sel.getNombre());
            tfNombre.setEditable(false);
            taDesc.setText(sel.getDescripcion());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tCuotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCuotasMousePressed
        // TODO add your handling code here:
        if(tCuotas.getSelectedRowCount()==1)
            sel = (Cuota) tCuotas.getValueAt(tCuotas.getSelectedRow(), 1);
    }//GEN-LAST:event_tCuotasMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        btnCancelar.setVisible(false);
        btnAgregar.setText("Agregar");
        lMod.setVisible(false);
        tfNombre.setEditable(true);
        sel = null;
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void limpiar(){
        dcFecha.setDate(new Date());
        tfNombre.setText("");
        tfMonto.setText("");
        taDesc.setText("");
        tCuotas.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbFrec;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lCarnet1;
    private javax.swing.JLabel lMod;
    private javax.swing.JLabel lPlantel;
    private javax.swing.JLabel lPlantel1;
    private javax.swing.JLabel lPlantel2;
    private javax.swing.JLabel lPlantel3;
    private javax.swing.JTable tCuotas;
    private javax.swing.JTextArea taDesc;
    private javax.swing.JTextField tfMonto;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
