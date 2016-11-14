/*
 * Copyright (C) 2015 janez
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package co.com.netflix.pattern.mvc.subcripcion;

import co.com.netflix.pattern.mvc.recursos.InterfaceControlador;
import co.com.netflix.pattern.mvc.recursos.InterfaceVista;
import co.com.netflix.pattern.mvc.servicios.AlmacenDatosTemporal;
import co.com.netflix.pattern.mvc.util.ModelAbstractTableGeneric;
import co.com.netflix.pattern.mvc.util.ModeloComboPlanes;
import co.com.netflix.pattern.mvc.util.ModeloComboUsuarios;
import datechooser.beans.DateChooserCombo;
import java.awt.event.MouseListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author janez
 */
public class VistaPantallaSuscripciones extends javax.swing.JFrame implements InterfaceVista {

    private ControladorSubscripciones controladorSubscripciones;

    /**
     * Creates new form VistaPantallaSuscripciones
     */
    public VistaPantallaSuscripciones() {
        initComponents();
        this.setTitle(".:: Subscripciones ::.");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.jComboBox1.setModel(new ModeloComboUsuarios(AlmacenDatosTemporal.getInstance().getArrayListUsuarios()));
        this.jComboBox2.setModel(new ModeloComboPlanes(AlmacenDatosTemporal.getInstance().getArrayListPlanes()));
        this.jComboBox1.setSelectedIndex(0);
        this.jComboBox2.setSelectedIndex(0);
        this.jTableListarSubscripciones.setModel(new ModelAbstractTableGeneric("subs"));
        this.jTextField3.setEnabled(false);
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateChooserComboFechaInicio = new datechooser.beans.DateChooserCombo();
        dateChooserComboFechaFin = new datechooser.beans.DateChooserCombo();
        jTextField3 = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarSubscripciones = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlabelNombreUsuario = new javax.swing.JLabel();
        jLabelcorreo = new javax.swing.JLabel();
        jLabelpais = new javax.swing.JLabel();
        jLabelfechaReg = new javax.swing.JLabel();
        jLabeltdc = new javax.swing.JLabel();
        jLabelfechaexp = new javax.swing.JLabel();
        jLabelcvs = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelnombreplan = new javax.swing.JLabel();
        jLabelprecio = new javax.swing.JLabel();
        jLabelfechainicial = new javax.swing.JLabel();
        jLabelfechavenc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Plan");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Fecha Inicio");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Fecha Fin");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Tiempo");

        dateChooserComboFechaInicio.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateChooserComboFechaInicioOnSelectionChange(evt);
            }
        });

        dateChooserComboFechaFin.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateChooserComboFechaFinOnSelectionChange(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextField3.setText("jTextField3");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateChooserComboFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(dateChooserComboFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dateChooserComboFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dateChooserComboFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Subscripcion", jPanel1);

        jScrollPane1.setViewportView(jTableListarSubscripciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista Subscripciones", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102)));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Correo");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Pais");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("Fecha Reg");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("TDC");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Fecha Exp.");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("CSV");

        jlabelNombreUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlabelNombreUsuario.setText("jLabel6");

        jLabelcorreo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelcorreo.setText("jLabel6");

        jLabelpais.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelpais.setText("jLabel6");

        jLabelfechaReg.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelfechaReg.setText("jLabel6");

        jLabeltdc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabeltdc.setText("jLabel6");

        jLabelfechaexp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelfechaexp.setText("jLabel6");

        jLabelcvs.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelcvs.setText("jLabel6");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelfechaReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabelNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jLabelcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelpais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabeltdc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelcvs, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabelfechaexp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jlabelNombreUsuario)
                    .addComponent(jLabeltdc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabelcorreo)
                    .addComponent(jLabelfechaexp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(jLabelpais)
                    .addComponent(jLabelcvs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelfechaReg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setText("Nombre");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setText("Precio");

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setText("Fecha Ini");

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setText("Fecha Venc");

        jLabelnombreplan.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelnombreplan.setText("jLabel6");

        jLabelprecio.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabelprecio.setText("jLabel6");

        jLabelfechainicial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelfechainicial.setText("jLabel6");

        jLabelfechavenc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelfechavenc.setText("jLabel6");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelnombreplan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelfechainicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelfechavenc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelnombreplan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabelfechainicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabelfechavenc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabelprecio))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Detalle Subscripcion", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateChooserComboFechaInicioOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserComboFechaInicioOnSelectionChange
        jTextField3.setText(calcularTiempoSubscripcion());
    }//GEN-LAST:event_dateChooserComboFechaInicioOnSelectionChange

    private void dateChooserComboFechaFinOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserComboFechaFinOnSelectionChange
        jTextField3.setText(calcularTiempoSubscripcion());
    }//GEN-LAST:event_dateChooserComboFechaFinOnSelectionChange

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    public String calcularTiempoSubscripcion() {
        int value = (getDateChooserComboFechaFin().getSelectedDate().get(Calendar.DAY_OF_YEAR) - getDateChooserComboFechaInicio().getSelectedDate().get(Calendar.DAY_OF_YEAR));
        String tiempoSubscripcion = null;
        if (value <= 31) {
            value = (getDateChooserComboFechaFin().getSelectedDate().get(Calendar.DAY_OF_YEAR) - getDateChooserComboFechaInicio().getSelectedDate().get(Calendar.DAY_OF_YEAR));
            if (value > 1) {
                tiempoSubscripcion = value + " Dias";
            } else {
                tiempoSubscripcion = value + " Dia";
            }
        } else if (value > 31) {
            value = (getDateChooserComboFechaFin().getSelectedDate().get(Calendar.MONTH) - getDateChooserComboFechaInicio().getSelectedDate().get(Calendar.MONTH));
            if (value > 1) {
                tiempoSubscripcion = value + " Meses";
            } else {
                tiempoSubscripcion = value + " Mes";
            }
        } else if (value > 365) {
            value = (getDateChooserComboFechaFin().getSelectedDate().get(Calendar.YEAR) - getDateChooserComboFechaInicio().getSelectedDate().get(Calendar.YEAR));
            if (value > 1) {
                tiempoSubscripcion = value + " Años";
            } else {
                tiempoSubscripcion = value + " Año";
            }
        }
        return tiempoSubscripcion;
    }

    public DateChooserCombo getDateChooserComboFechaFin() {
        return dateChooserComboFechaFin;
    }

    public DateChooserCombo getDateChooserComboFechaInicio() {
        return dateChooserComboFechaInicio;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserComboFechaFin;
    private datechooser.beans.DateChooserCombo dateChooserComboFechaInicio;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelcorreo;
    private javax.swing.JLabel jLabelcvs;
    private javax.swing.JLabel jLabelfechaReg;
    private javax.swing.JLabel jLabelfechaexp;
    private javax.swing.JLabel jLabelfechainicial;
    private javax.swing.JLabel jLabelfechavenc;
    private javax.swing.JLabel jLabelnombreplan;
    private javax.swing.JLabel jLabelpais;
    private javax.swing.JLabel jLabelprecio;
    private javax.swing.JLabel jLabeltdc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableListarSubscripciones;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jlabelNombreUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @return
     */
    public JButton getjButtonGuardar() {
        return jButtonGuardar;
    }

    /**
     *
     * @return
     */
    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    /**
     *
     * @return
     */
    public JTable getjTableListarSubscripciones() {
        return jTableListarSubscripciones;
    }

    /**
     *
     * @return
     */
    public JComboBox getjComboBox1() {
        return jComboBox1;
    }

    public JLabel getjLabelcorreo() {
        return jLabelcorreo;
    }

    public JLabel getjLabelcvs() {
        return jLabelcvs;
    }

    public JLabel getjLabelfechaReg() {
        return jLabelfechaReg;
    }

    public JLabel getjLabelfechaexp() {
        return jLabelfechaexp;
    }

    public JLabel getjLabelfechainicial() {
        return jLabelfechainicial;
    }

    public JLabel getjLabelfechavenc() {
        return jLabelfechavenc;
    }

    public JLabel getjLabelnombreplan() {
        return jLabelnombreplan;
    }

    public JLabel getjLabelpais() {
        return jLabelpais;
    }

    public JLabel getjLabelprecio() {
        return jLabelprecio;
    }

    public JLabel getjLabeltdc() {
        return jLabeltdc;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public JLabel getJlabelNombreUsuario() {
        return jlabelNombreUsuario;
    }

    /**
     *
     * @return
     */
    public JComboBox getjComboBox2() {
        return jComboBox2;
    }

    /**
     *
     * @param controlador
     */
    @Override
    public void setControlador(InterfaceControlador controlador) {
        this.controladorSubscripciones = (ControladorSubscripciones) controlador;
        this.controladorSubscripciones.setControlado(this);
        adjuntarManejadorEventos(this.controladorSubscripciones);
    }

    /**
     *
     * @param controlador
     */
    @Override
    public void adjuntarManejadorEventos(InterfaceControlador controlador) {
        this.jButtonGuardar.addActionListener(controlador);
        this.jButtonCancelar.addActionListener(controlador);
        this.jTableListarSubscripciones.addMouseListener((MouseListener) controlador);
    }

    @Override
    public void abrir() {
        setVisible(true);
    }

    @Override
    public void limpiar() {
        this.jTextField3.setText("");
        this.jLabelcorreo.setText("");
        this.jLabelcvs.setText("");
        this.jLabelfechaReg.setText("");
        this.jLabelfechaexp.setText("");
        this.jLabelfechainicial.setText("");
        this.jLabelfechavenc.setText("");
        this.jLabelnombreplan.setText("");
        this.jLabelpais.setText("");
        this.jLabelprecio.setText("");
        this.jLabeltdc.setText("");
        this.jlabelNombreUsuario.setText("");

    }
}
