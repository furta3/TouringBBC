/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BD.Conexion;
import Clases.Actividad;
import Clases.Horario;
import Clases.SocioActividad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class DetallesActividad extends javax.swing.JPanel {

    /**
     * Creates new form PanelVacio
     */
    Actividad act;
    Principal main;
    public DetallesActividad(Principal main,Actividad act) {
        initComponents();
        this.act=act;
        load();
    }
    
    public void load(){
        lNombre.setText(act.getNombre());
        sCosto.setValue(act.getCupos());
        cargarHorarios();
    }
    public void cargarHorarios(){
        //Conexion.getInstance().refresh(f);
        Iterator<Horario> it = act.getHorarios().iterator();
        DefaultTableModel mdl = (DefaultTableModel) tHorarios.getModel();
        mdl.setRowCount(0);
        while (it.hasNext()) {
                Horario h = it.next();
                if (h.isVigente()) {  
                        Object[] fila = new Object[5];
                        fila[0] = h;
                        fila[1] = h.getHora();
                        fila[2] = h.getDuracion();
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

        btnConfirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sDuracion = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        sCosto = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHorarios = new javax.swing.JTable();
        btnQuitar = new javax.swing.JButton();
        cbDia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfHora = new javax.swing.JTextField();
        btnConfirmar1 = new javax.swing.JButton();
        lNombre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnConfirmar.setText("Actualizar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Duración:");

        sDuracion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Actividad: ");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        sCosto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Horarios");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Costo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Datos");

        tHorarios.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Día", "Hora", "Duración"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tHorarios);

        btnQuitar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" }));
        cbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Día:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Hora:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        tfHora.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraActionPerformed(evt);
            }
        });

        btnConfirmar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnConfirmar1.setText("Eliminar");
        btnConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar1ActionPerformed(evt);
            }
        });

        lNombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lNombre.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(sCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConfirmar1)))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfHora)
                                    .addComponent(cbDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQuitar)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(115, 115, 115)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(lNombre)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnQuitar)
                            .addComponent(btnConfirmar)
                            .addComponent(btnConfirmar1))
                        .addGap(40, 172, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        if((int)sCosto.getValue() > 0 && tHorarios.getRowCount()>0){
            
            
            act.setCupos((int)sCosto.getValue());
            act.setVigente(true);
            //
            Conexion.getInstance().merge(act);
            //intercambianel
            /*List<Horario> horarios = new ArrayList<Horario>();
            for(int f = 0; f < tHorarios.getRowCount(); f++){
                Horario h = (Horario) tHorarios.getValueAt(f, 0);
                h.setActividad(a);
                Conexion.getInstance().merge(h);
            }
            //
            tfNombre.setText("");
            sCosto.setValue(0);
            sDuracion.setValue(0);
            tfHora.setText("");
            cbDia.setSelectedIndex(0);
            DefaultTableModel mdl = (DefaultTableModel) tHorarios.getModel();
            mdl.setRowCount(0);*/
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(cbDia.getSelectedItem()!=null && (int) sDuracion.getValue() > 0 && !tfHora.equals("")){//verificar que no se pisen horas y demás
            Horario h = new Horario();
            h.setDia(cbDia.getSelectedItem().toString());
            h.setHora(tfHora.getText());
            h.setDuracion((int) sDuracion.getValue());
            h.setVigente(true);

            //Conexion.getInstance().persist(h);

            DefaultTableModel mdl = (DefaultTableModel) tHorarios.getModel();
            Object[] fila = new Object[5];
            fila[0] = h;
            fila[1] = h.getHora();
            fila[2] = h.getDuracion();
            mdl.addRow(fila);
            sDuracion.setValue(0);
            tfHora.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        // TODO add your handling code here:
        if(tHorarios.getSelectedRowCount()==1){
            Horario h2 = (Horario) tHorarios.getValueAt(tHorarios.getSelectedRow(), 0);
            h2.setVigente(false);
            h2.setSocioActividadHorario(new ArrayList<SocioActividad>());
            Conexion.getInstance().merge(h2);
            
            ((DefaultTableModel)tHorarios.getModel()).removeRow(tHorarios.getSelectedRow());
            /*Horario h2 = (Horario) tHorarios.getValueAt(tHorarios.getSelectedRow(), 0);
            Conexion.getInstance().delete(h2);
            ((DefaultTableModel)tHorarios.getModel()).removeRow(tHorarios.getSelectedRow());*/
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiaActionPerformed

    private void tfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraActionPerformed

    private void btnConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar1ActionPerformed
        // TODO add your handling code here:
        
        //CONFIRMACIÓN
        act.setVigente(false);
        Conexion.getInstance().merge(act);
        main.AbrirVerActividades();
    }//GEN-LAST:event_btnConfirmar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConfirmar1;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lNombre;
    private javax.swing.JSpinner sCosto;
    private javax.swing.JSpinner sDuracion;
    private javax.swing.JTable tHorarios;
    private javax.swing.JTextField tfHora;
    // End of variables declaration//GEN-END:variables
}
