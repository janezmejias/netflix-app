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
package co.com.netflix.pattern.mvc.main;

import co.com.netflix.pattern.mvc.recursos.InterfaceControlador;
import co.com.netflix.pattern.mvc.recursos.InterfaceVista;
import javax.swing.JButton;
import javax.swing.JMenuItem;

/**
 *
 * @author janez
 */
public class VistaPantallaPrincipal extends javax.swing.JFrame implements InterfaceVista {

    private ControladorVistaPrincipal controladorVistaPrincipal;

    private static class VistaPantallaPrincipalEncapsulado {

        private static final VistaPantallaPrincipal INSTANCE = new VistaPantallaPrincipal();
    }

    public static VistaPantallaPrincipal getInstance() {
        return VistaPantallaPrincipalEncapsulado.INSTANCE;
    }

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPantallaPrincipal() {
        initComponents();
        this.setTitle(".:: NetFlix App ::.");
        this.setResizable(false);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void setControlador(InterfaceControlador controlador) {
        this.controladorVistaPrincipal = (ControladorVistaPrincipal) controlador;
        this.controladorVistaPrincipal.setControlado(this);
        adjuntarManejadorEventos(this.controladorVistaPrincipal);
    }

    @Override
    public void adjuntarManejadorEventos(InterfaceControlador controlador) {
        bottonPelicula.addActionListener(controlador);
        botonCategorias.addActionListener(controlador);
        botonUsuario.addActionListener(controlador);
        botonPlanes.addActionListener(controlador);
        jButtonSubscripciones.addActionListener(controlador);
    }

    @Override
    public void abrir() {
        setVisible(true);
    }

    /**
     *
     * @return
     */
    public JButton getBottonPelicula() {
        return bottonPelicula;
    }

    /**
     *
     * @return
     */
    public JButton getBotonCategorias() {
        return botonCategorias;
    }

    /**
     *
     * @return
     */
    public JButton getjButtonSubscripciones() {
        return jButtonSubscripciones;
    }

    /**
     *
     * @return
     */
    public JButton getBotonPlanes() {
        return botonPlanes;
    }

    /**
     *
     * @return
     */
    public JButton getBotonUsuario() {
        return botonUsuario;
    }

    @Override
    public void limpiar() {

    }

    public JMenuItem getjMenuItemSalir() {
        return jMenuItemSalir;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bottonPelicula = new javax.swing.JButton();
        botonCategorias = new javax.swing.JButton();
        botonPlanes = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        botonUsuario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonSubscripciones = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setFloatable(false);

        bottonPelicula.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        bottonPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/netflix/pattern/mvc/recursos/iconos/Movies-icon.png"))); // NOI18N
        bottonPelicula.setText("Peliculas");
        bottonPelicula.setFocusable(false);
        bottonPelicula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bottonPelicula.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bottonPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonPeliculaActionPerformed(evt);
            }
        });
        jToolBar1.add(bottonPelicula);

        botonCategorias.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        botonCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/netflix/pattern/mvc/recursos/iconos/Mimetype-video-icon.png"))); // NOI18N
        botonCategorias.setText("Categorias");
        botonCategorias.setFocusable(false);
        botonCategorias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCategorias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(botonCategorias);

        botonPlanes.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        botonPlanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/netflix/pattern/mvc/recursos/iconos/Actions-view-list-text-icon.png"))); // NOI18N
        botonPlanes.setText("Planes");
        botonPlanes.setFocusable(false);
        botonPlanes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPlanes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(botonPlanes);
        jToolBar1.add(jSeparator3);

        botonUsuario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        botonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/netflix/pattern/mvc/recursos/iconos/Places-user-identity-icon.png"))); // NOI18N
        botonUsuario.setText("Usuarios");
        botonUsuario.setFocusable(false);
        botonUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(botonUsuario);
        jToolBar1.add(jSeparator1);

        jButtonSubscripciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/netflix/pattern/mvc/recursos/iconos/Actions-view-list-text-icon.png"))); // NOI18N
        jButtonSubscripciones.setText("Subscripcion");
        jButtonSubscripciones.setFocusable(false);
        jButtonSubscripciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSubscripciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonSubscripciones);

        jMenu1.setText("Orden");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 488, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottonPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bottonPeliculaActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCategorias;
    private javax.swing.JButton botonPlanes;
    private javax.swing.JButton botonUsuario;
    private javax.swing.JButton bottonPelicula;
    private javax.swing.JButton jButtonSubscripciones;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
