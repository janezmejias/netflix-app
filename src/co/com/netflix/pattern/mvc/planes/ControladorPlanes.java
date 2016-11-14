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
package co.com.netflix.pattern.mvc.planes;

import co.com.netflix.pattern.mvc.Entidades.Plan;
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
public class ControladorPlanes implements InterfaceControlador, MouseListener {
    
    private VistaPantallaPlanes vistaPantallaPlanSubscripcion;

    /**
     *
     * @param controlado
     */
    @Override
    public void setControlado(InterfaceVista controlado) {
        this.vistaPantallaPlanSubscripcion = (VistaPantallaPlanes) controlado;
    }

    /**
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == vistaPantallaPlanSubscripcion.getjButtonGuardar()) {
            try {
                agregarSubscripcion();
            } catch (java.lang.NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
            }            
        } else if (event.getSource() == vistaPantallaPlanSubscripcion.getjTableListarSubscripciones()) {
            
        }
    }

    /**
     *
     * @throws java.lang.NumberFormatException
     */
    private void agregarSubscripcion() throws java.lang.NumberFormatException {
        AlmacenDatosTemporal.getInstance().setPlanToArrayList(new Plan(vistaPantallaPlanSubscripcion.getjTextField1().getText(),
                Double.parseDouble(vistaPantallaPlanSubscripcion.getjFormattedTextField1().getText()), AlmacenDatosTemporal.getInstance().getArrayListCategorias().get(vistaPantallaPlanSubscripcion.getjComboBox1().getSelectedIndex())));
        vistaPantallaPlanSubscripcion.getjTableListarSubscripciones().setModel(new ModelAbstractTableGeneric("plan"));
        JOptionPane.showMessageDialog(null, "Subscripcion agregada con exito.!");
        vistaPantallaPlanSubscripcion.limpiar();
    }
    
    @Override
    public void mouseClicked(MouseEvent event) {
        ArrayList<Plan> arrayListSubscripcion = AlmacenDatosTemporal.getInstance().getArrayListPlanes();
        if (event.getClickCount() == 2) {
            vistaPantallaPlanSubscripcion.getjTabbedPane1().setSelectedIndex(2);
            vistaPantallaPlanSubscripcion.getjTextField2().setText(arrayListSubscripcion.get(vistaPantallaPlanSubscripcion.
                    getjTableListarSubscripciones().getSelectedRow()).getNombre());
            vistaPantallaPlanSubscripcion.getjFormattedTextField2().setText(arrayListSubscripcion.get(vistaPantallaPlanSubscripcion.
                    getjTableListarSubscripciones().getSelectedRow()).getPrecio() + "");
            vistaPantallaPlanSubscripcion.getjTextField3().setText(arrayListSubscripcion.get(vistaPantallaPlanSubscripcion.getjTableListarSubscripciones().getSelectedRow()).getCategoria().getNombre());
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
