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
package co.com.netflix.pattern.mvc.usuarios;

import co.com.netflix.pattern.mvc.Entidades.TarjetaCredito;
import co.com.netflix.pattern.mvc.Entidades.Usuario;
import co.com.netflix.pattern.mvc.recursos.InterfaceControlador;
import co.com.netflix.pattern.mvc.recursos.InterfaceVista;
import co.com.netflix.pattern.mvc.servicios.AlmacenDatosTemporal;
import co.com.netflix.pattern.mvc.util.ModelAbstractTableGeneric;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author janez
 */
public class ControladorUsuarios implements InterfaceControlador, MouseListener {

    private VistaPantallaUsuarios vistaPantallaUsuarios;

    @Override
    public void setControlado(InterfaceVista controlado) {
        this.vistaPantallaUsuarios = (VistaPantallaUsuarios) controlado;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == vistaPantallaUsuarios.getjButton1()) {
            vistaPantallaUsuarios.dispose();
        } else if (event.getSource() == vistaPantallaUsuarios.getjButton2()) {
            agregaUsuario();
        } else if (event.getSource() == vistaPantallaUsuarios.getjTable1()) {

        }

    }

    /**
     * Agrega un usuario
     */
    private void agregaUsuario() {
        AlmacenDatosTemporal.getInstance().setUsuarioToArrayList(new Usuario(vistaPantallaUsuarios.getjTextField1().getText(),
                vistaPantallaUsuarios.getjTextField2().getText(), vistaPantallaUsuarios.getjTextField3().getText(),
                new TarjetaCredito(vistaPantallaUsuarios.getjTextField4().getText(), vistaPantallaUsuarios.getjFormattedTextField2().getText(),
                        Integer.parseInt(vistaPantallaUsuarios.getjTextField5().getText())),
                vistaPantallaUsuarios.getDateChooserCombo1().getSelectedDate().getTime()));
        JOptionPane.showMessageDialog(null, "Usuario agregado con exito.!");
        vistaPantallaUsuarios.limpiar();
        vistaPantallaUsuarios.getjTable1().setModel(new ModelAbstractTableGeneric("users"));
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        ArrayList<Usuario> arrayListUsuarios = AlmacenDatosTemporal.getInstance().getArrayListUsuarios();
        if (event.getClickCount() == 2) {
            vistaPantallaUsuarios.getjTabbedPane1().setSelectedIndex(2);
            vistaPantallaUsuarios.getjTextField6().setText(arrayListUsuarios.get(vistaPantallaUsuarios.getjTable1().getSelectedRow()).getTarjetaCredito().getNumeroTarjetaCredito());
            vistaPantallaUsuarios.getjFormattedTextField3().setText(arrayListUsuarios.get(vistaPantallaUsuarios.getjTable1().getSelectedRow()).getTarjetaCredito().getFechaExpiracionTDC());
            vistaPantallaUsuarios.getjTextField7().setText(arrayListUsuarios.get(vistaPantallaUsuarios.getjTable1().getSelectedRow()).getTarjetaCredito().getCodigoSeguridad() + "");
            vistaPantallaUsuarios.getjTextField8().setText(arrayListUsuarios.get(vistaPantallaUsuarios.getjTable1().getSelectedRow()).getNombre());
            vistaPantallaUsuarios.getjTextField9().setText(arrayListUsuarios.get(vistaPantallaUsuarios.getjTable1().getSelectedRow()).getCorreo());
            vistaPantallaUsuarios.getjTextField10().setText(arrayListUsuarios.get(vistaPantallaUsuarios.getjTable1().getSelectedRow()).getPais());
            vistaPantallaUsuarios.getjTable1().setModel(new ModelAbstractTableGeneric("users"));
        }
    }

    @Override
    public void itemStateChanged(ItemEvent event) {

    }

    @Override
    public void mousePressed(MouseEvent event) {

    }

    @Override
    public void mouseReleased(MouseEvent event) {

    }

    @Override
    public void mouseEntered(MouseEvent event) {

    }

    @Override
    public void mouseExited(MouseEvent event) {

    }

}
