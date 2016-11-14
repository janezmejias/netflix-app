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

import co.com.netflix.pattern.mvc.Entidades.Subscripcion;
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
public class ControladorSubscripciones implements InterfaceControlador, MouseListener {

    private VistaPantallaSuscripciones vistaPantallaSuscripciones;

    @Override
    public void setControlado(InterfaceVista controlado) {
        this.vistaPantallaSuscripciones = (VistaPantallaSuscripciones) controlado;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == vistaPantallaSuscripciones.getjButtonGuardar()) {
            agregarSubscripcion();
        }
    }

    private void agregarSubscripcion() {
        AlmacenDatosTemporal.getInstance().setSubscripcionToArrayList(new Subscripcion(AlmacenDatosTemporal
                .getInstance().getArrayListUsuarios().get(vistaPantallaSuscripciones.getjComboBox1()
                        .getSelectedIndex()),
                AlmacenDatosTemporal.getInstance().getArrayListPlanes().get(vistaPantallaSuscripciones
                        .getjComboBox2().getSelectedIndex()), vistaPantallaSuscripciones
                .getDateChooserComboFechaInicio().getSelectedDate().getTime(), vistaPantallaSuscripciones
                .getDateChooserComboFechaFin().getSelectedDate().getTime(), vistaPantallaSuscripciones
                .getjTextField3().getText()));
        vistaPantallaSuscripciones.getjTableListarSubscripciones().setModel(new ModelAbstractTableGeneric("subs"));
        JOptionPane.showMessageDialog(null, "Subscripcion agregada con exito.!");
        vistaPantallaSuscripciones.getjComboBox1().setSelectedIndex(0);
        vistaPantallaSuscripciones.getjComboBox2().setSelectedIndex(0);
        vistaPantallaSuscripciones.limpiar();
    }

    @Override
    public void itemStateChanged(ItemEvent event) {

    }

    @Override
    public void mouseClicked(MouseEvent event) {
        ArrayList<Subscripcion> arrayListCategorias = AlmacenDatosTemporal.getInstance().getArrayListSubscripciones();
        if (event.getClickCount() == 2) {
            vistaPantallaSuscripciones.getjTabbedPane1().setSelectedIndex(2);
            vistaPantallaSuscripciones.getJlabelNombreUsuario().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getUsuario().getNombre());
            vistaPantallaSuscripciones.getjLabelcorreo().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getUsuario().getCorreo());
            vistaPantallaSuscripciones.getjLabelpais().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getUsuario().getPais());
            vistaPantallaSuscripciones.getjLabelfechaReg().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getUsuario().getFechaRegistro() + "");
            vistaPantallaSuscripciones.getjLabeltdc().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getUsuario().getTarjetaCredito().getNumeroTarjetaCredito());
            vistaPantallaSuscripciones.getjLabelfechaexp().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getUsuario().getTarjetaCredito().getFechaExpiracionTDC());
            vistaPantallaSuscripciones.getjLabelcvs().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getUsuario().getTarjetaCredito().getCodigoSeguridad() + "");
            vistaPantallaSuscripciones.getjLabelnombreplan().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getPlan().getNombre());
            vistaPantallaSuscripciones.getjLabelprecio().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getPlan().getPrecio() + "");
            vistaPantallaSuscripciones.getjLabelfechainicial().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getFechaInicio() + "");
            vistaPantallaSuscripciones.getjLabelfechavenc().setText(arrayListCategorias.get(vistaPantallaSuscripciones.getjTableListarSubscripciones().getSelectedRow()).getFechaFin() + "");
        }
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
