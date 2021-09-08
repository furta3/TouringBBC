/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BD.Conexion;
import Clases.Categoria;
import Clases.Jugador;
import Clases.TipoSocio;
import Renderes.RenderIntercalado;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class AbmCategorias extends javax.swing.JPanel {

    /**
     * Creates new form PanelVacio
     */
    Categoria cat;
    Principal main;
    List<Categoria> listaCat;
    List<Categoria> mods= new ArrayList<Categoria>();
    List<Jugador> sinCat= new ArrayList<Jugador>();
    List<Jugador> jmods = new ArrayList<Jugador>();
    public AbmCategorias(Principal main) {
        initComponents();
        this.main = main;
        modificando(false);
        listaCat = main.categorias;
        tCategorias.setDefaultRenderer(Object.class, new RenderIntercalado());
        cargarCat();
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
        tCategorias = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sMin = new javax.swing.JSpinner();
        sMax = new javax.swing.JSpinner();
        btnLimpiar = new javax.swing.JButton();
        lEstado = new javax.swing.JLabel();
        panelMod = new javax.swing.JPanel();
        btnCancelarMod = new javax.swing.JButton();
        btnConfirmarMod = new javax.swing.JButton();
        lJSC = new javax.swing.JLabel();
        lSinCat = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tCategorias.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad Min.", "Edad Max."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tCategoriasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tCategorias);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Categorías");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Edad min:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Edad max:");

        sMin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        sMax.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lEstado.setText("Alta");

        panelMod.setBackground(new java.awt.Color(255, 255, 255));
        panelMod.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificación"));

        btnCancelarMod.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancelarMod.setText("Cancelar");
        btnCancelarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModActionPerformed(evt);
            }
        });

        btnConfirmarMod.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnConfirmarMod.setText("Confirmar");
        btnConfirmarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarModActionPerformed(evt);
            }
        });

        lJSC.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lJSC.setText("Jugadores sin categoría:");

        lSinCat.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lSinCat.setText("Num");

        javax.swing.GroupLayout panelModLayout = new javax.swing.GroupLayout(panelMod);
        panelMod.setLayout(panelModLayout);
        panelModLayout.setHorizontalGroup(
            panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnConfirmarMod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnCancelarMod)
                .addGap(30, 30, 30))
            .addGroup(panelModLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lJSC)
                .addGap(18, 18, 18)
                .addComponent(lSinCat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelModLayout.setVerticalGroup(
            panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lJSC)
                    .addComponent(lSinCat))
                .addGap(33, 33, 33)
                .addGroup(panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarMod)
                    .addComponent(btnConfirmarMod))
                .addGap(23, 23, 23))
        );

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(sMax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                                .addComponent(sMin, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAgregar)
                                            .addComponent(btnEliminar))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(lEstado)))
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lEstado)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnAgregar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(panelMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tCategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCategoriasMousePressed
        // TODO add your handling code here:
        if(tCategorias.getSelectedRowCount()==1){
            cat = (Categoria) tCategorias.getValueAt(tCategorias.getSelectedRow(), 0);
            /*tfNombre.setText(cat.getNombre());
            sMin.setValue(cat.getEdadMin());
            sMax.setValue(cat.getEdadMax());*/
        }
    }//GEN-LAST:event_tCategoriasMousePressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(tfNombre.getText().equals(""))
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        else if((int) sMin.getValue()<0 || (int) sMax.getValue()<=0)
            JOptionPane.showMessageDialog(this, "Las edades no pueden ser menores a 0.", "Error", JOptionPane.ERROR_MESSAGE);
        else{
            Categoria ts = new Categoria();
            ts.setNombre(tfNombre.getText());
            ts.setEdadMin((int) sMin.getValue());
            ts.setEdadMax((int) sMax.getValue());
            ts.setVigente(true);
            ts.setJugadores(new ArrayList<Jugador>());

            if(main.categorias.contains(ts))
                JOptionPane.showMessageDialog(this, "Ya existe una categoria con este nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            else if(verificarEdades(ts)){
                Conexion.getInstance().persist(ts);
                tfNombre.setText("");
                sMin.setValue(0);
                sMax.setValue(0);
                //main.categorias  = Conexion.getInstance().getCategorias();
                listaCat.add(ts); //= main.categorias;
                main.categorias.add(ts);
                cargarCat();
                if(sinCat.size()>0)
                    acomodarJugadores();
                limpiar();
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public boolean verificarEdades(Categoria nueva){
        Iterator<Categoria> it = listaCat.iterator();
        while (it.hasNext()) {
            Categoria s = it.next();
            if(s.isVigente() && s != nueva && ((s.getEdadMax()>= nueva.getEdadMin() && s.getEdadMin() <= nueva.getEdadMin()) || (s.getEdadMax()>= nueva.getEdadMax() && s.getEdadMin() <= nueva.getEdadMax()))) {
                JOptionPane.showMessageDialog(this, "Error con las edad, verificar que no haya incompatibilidad con otras categorias.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        if((int)sMin.getValue() > (int)sMax.getValue()){
            JOptionPane.showMessageDialog(this, "Error con las edad, la edad máxima no puede ser menor a la mínima.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void cargarCat(){
        Iterator<Categoria> it = listaCat.iterator();
        DefaultTableModel mdl = (DefaultTableModel) tCategorias.getModel();
        mdl.setRowCount(0);
        while (it.hasNext()) {
            Categoria s = it.next();
            if (s.isVigente()) {  
                Object[] fila = new Object[3];
                fila[0] = s;
                fila[1] = s.getEdadMin();
                fila[2] = s.getEdadMax();
                mdl.addRow(fila); 
            }
        }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        List<Jugador> sinCatActual  =new ArrayList<Jugador>();
        if(tCategorias.getSelectedRowCount()==1){
            if (JOptionPane.showConfirmDialog(this, "¿Seguro de que quiere eliminar esta categoría?", "Consulta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                cat = (Categoria) tCategorias.getValueAt(tCategorias.getSelectedRow(),0);
                cat.setVigente(false);
                if(cat.getJugadores()!=null && cat.getJugadores().size()>0){
                    System.out.println("en el if de null && >0");
                    
                    //sinCatActual = cat.getJugadores();
                    Iterator<Jugador> it = cat.getJugadores().iterator();
                    while(it.hasNext()){
                        Jugador j = it.next();
                        j.setPlantel(null);
                        sinCatActual.add(j);
                    }
                    if(sinCatActual.size()==0){
                        Conexion.getInstance().delete(cat);
                        main.categorias.remove(cat);
                        listaCat.remove(cat);
                        cargarCat();
                    }
                    else{
                        sinCat.addAll(sinCatActual);
                        acomodarJugadores();
                        mods.add(cat);
                        listaCat.remove(cat);
                        cargarCat();
                        modificando(true);
                    }
                }
                else{
                    System.out.println("en el else");
                    Conexion.getInstance().delete(cat);
                    main.categorias.remove(cat);
                    listaCat.remove(cat);
                    cargarCat();
                }
                    
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if(cat != null ){
            
            if( btnModificar.getText().equals("Modificar")){
                tfNombre.setText(cat.getNombre());
                sMin.setValue(cat.getEdadMin());
                sMax.setValue(cat.getEdadMax());
                btnModificar.setText("Confirmar");
            }
            else{// si el botón dice CONFIRMAR
                if (JOptionPane.showConfirmDialog(this, "¿Seguro de que quiere modificar está categoría?", "Consulta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    modificando(true);
                    cat.setNombre(tfNombre.getText());
                    cat.setEdadMin((int)sMin.getValue());
                    cat.setEdadMax((int)sMax.getValue());
                    
                    if(verificarEdades(cat)){
                        mods.add(cat);

                        acomodarJugadores();

                        if(cat.getJugadores().size()==0){
                            btnModificar.setText("Modificar");
                            Conexion.getInstance().merge(cat);
                            main.categorias = Conexion.getInstance().getCategorias();
                            cargarCat();
                            limpiar();
                        }
                        else{
                            Iterator<Jugador> itjs = cat.getJugadores().iterator();
                            List<Jugador> sinCatA = new ArrayList<Jugador>();
                            while(itjs.hasNext()){
                                Jugador j  = itjs.next();
                                if(j.getEdad() < cat.getEdadMin() || j.getEdad() > cat.getEdadMax()){
                                    j.setPlantel(null);
                                    j.setPlantel(null);
                                    sinCatA.add(j);
                                }
                            }
                            if(sinCatA.isEmpty()){
                                btnModificar.setText("Modificar");
                                Conexion.getInstance().merge(cat);
                                main.categorias = Conexion.getInstance().getCategorias();
                                listaCat = main.categorias;
                                cargarCat();
                                limpiar();
                            }
                            else{
                                mods.add(cat);
                                sinCat.addAll(sinCatA);
                                lSinCat.setText(""+sinCat.size());
                                listaCat.set(listaCat.indexOf(cat), cat);
                                acomodarJugadores();
                                modificando(true);
                                limpiar();
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public void acomodarJugadores(){
        
        int edadMin, edadMax;//LAS EDADES  DE LOS JUGADRES SIN CATEGORIA
        
        List<Jugador> temp = new ArrayList<Jugador>();
        
        Iterator<Categoria> itC = listaCat.iterator();
        while(itC.hasNext()){
            Categoria ca = itC.next();
            System.out.println("ca: "+ca);
            if(ca.isVigente()){
                Iterator<Jugador> itJ = sinCat.iterator();
                while(itJ.hasNext()){
                    Jugador ju = itJ.next();
                    System.out.println("ju: "+ju.getCi()+" - "+ju.getApellido());
                    if(ca.isVigente() && ju.getEdad() >= ca.getEdadMin() && ju.getEdad() <= ca.getEdadMax()){
                        ju.setPlantel(ca);
                        temp.add(ju);
                        jmods.add(ju);
                    }
                }
            }
        }
        Iterator<Categoria> itMC = mods.iterator();
        while(itMC.hasNext()){
            Categoria ca = itMC.next();
            System.out.println("ca: "+ca);
            if(ca.isVigente()){
                Iterator<Jugador> itJ2 = sinCat.iterator();
                while(itJ2.hasNext()){
                    Jugador ju = itJ2.next();
                    System.out.println("ju: "+ju.getCi()+" - "+ju.getApellido());
                    if(ca.isVigente() && ju.getEdad() >= ca.getEdadMin() && ju.getEdad() <= ca.getEdadMax()){
                        ju.setPlantel(ca);
                        temp.add(ju);
                        jmods.add(ju);
                    }
                }
            }
        }
        
        if(!temp.isEmpty()){
            sinCat.removeAll(temp);
        }
        
        lSinCat.setText(""+sinCat.size());
        if(!sinCat.isEmpty()){
            panelMod.setBackground(new Color(255,153,153));//ROJO
        }
        else{
            panelMod.setBackground(new Color(156,204,101));//VERDE
        }
        System.out.println("mods: "+mods.size()+" jmods: "+jmods.size()+" sinCat: "+sinCat.size());
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConfirmarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarModActionPerformed
        // TODO add your handling code here:
        if(sinCat.size()!=0){
            JOptionPane.showMessageDialog(this, "Para confirmar los cambios tiene que acomodoar a todos los jugadores en una categoría.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(Jugador ju : jmods){
                Conexion.getInstance().merge(ju);
            }
            for(Categoria cate : mods){
                if(!cate.isVigente())
                    Conexion.getInstance().delete(cate);
                else
                    Conexion.getInstance().merge(cate);
            }
            limpiar();
            modificando(false);
            main.categorias = Conexion.getInstance().getCategorias();
            main.jugadores = Conexion.getInstance().getJugadores();
            listaCat = main.categorias;
            cargarCat();
            JOptionPane.showMessageDialog(this, "Categorías actualizadas.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarModActionPerformed

    private void btnCancelarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModActionPerformed
        // TODO add your handling code here:
        listaCat = main.categorias;
        limpiar();
        modificando(false);
    }//GEN-LAST:event_btnCancelarModActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        modificando(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

        
    public void modificando(boolean b){
        lJSC.setVisible(b);
        lSinCat.setVisible(b);
        btnConfirmarMod.setVisible(b);
        btnCancelarMod.setVisible(b);
        //btnEliminar.setVisible(b);
        panelMod.setVisible(b);
        if(b){
            lEstado.setText("Modificando");
            
        } 
        else{
            lEstado.setText("Alta");
            sinCat.clear();
            mods.clear();
            jmods.clear();
        }
    }
    
    public void limpiar(){
        tfNombre.setText("");
        sMin.setValue(0);
        sMax.setValue(0);
        cat = null;
        btnModificar.setText("Modificar");
        tCategorias.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelarMod;
    private javax.swing.JButton btnConfirmarMod;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lJSC;
    private javax.swing.JLabel lSinCat;
    private javax.swing.JPanel panelMod;
    private javax.swing.JSpinner sMax;
    private javax.swing.JSpinner sMin;
    private javax.swing.JTable tCategorias;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
