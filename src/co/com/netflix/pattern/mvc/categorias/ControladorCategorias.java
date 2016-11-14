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
package co.com.netflix.pattern.mvc.categorias;

import co.com.netflix.pattern.mvc.Entidades.Categoria;
import co.com.netflix.pattern.mvc.Entidades.Pelicula;
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
public class ControladorCategorias implements InterfaceControlador, MouseListener {

    private VistaPantallaCategorias vistaPantallaCategorias;    

    @Override
    public void setControlado(InterfaceVista controlado) {
        this.vistaPantallaCategorias = (VistaPantallaCategorias) controlado;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == vistaPantallaCategorias.getjMenuItemEdit()) {
        } else if (event.getSource() == vistaPantallaCategorias.getjMenuItemDetalle()) {
        } else if (event.getSource() == vistaPantallaCategorias.getjTable1()) {
        } else if (event.getSource() == vistaPantallaCategorias.getjButton1()) {
            agregarCategoria();
        }

    }

    private void agregarCategoria() {
        ArrayList<Pelicula> arrayListUtil = new ArrayList<>();
        for (Object selectedValuesList : vistaPantallaCategorias.getjList1().getSelectedValuesList()) {
            arrayListUtil.add(new Pelicula(selectedValuesList.toString()));
        }
        AlmacenDatosTemporal.getInstance().setCategoriaToArrayList(new Categoria(vistaPantallaCategorias.getjTextField1().getText(),
                vistaPantallaCategorias.getjTextField2().getText(), arrayListUtil));
        vistaPantallaCategorias.getjTable1().setModel(new ModelAbstractTableGeneric("cat"));        
        JOptionPane.showMessageDialog(null, "Categoria agregada con exito.!");
        vistaPantallaCategorias.limpiar();
    }

    /**
     *
     * @param event
     */
    @Override
    public void mouseClicked(MouseEvent event) {
        ArrayList<Categoria> arrayListCategorias = AlmacenDatosTemporal.getInstance().getArrayListCategorias();
        String valTemp = "";
        if (event.getClickCount() == 2) {
            vistaPantallaCategorias.getjTabbedPane1().setSelectedIndex(2);
            vistaPantallaCategorias.getjTextField3().setText(arrayListCategorias.get(vistaPantallaCategorias.getjTable1().getSelectedRow()).getNombre());
            vistaPantallaCategorias.getjTextField4().setText(arrayListCategorias.get(vistaPantallaCategorias.getjTable1().getSelectedRow()).getDescripcion());            
            for (Pelicula peliculasAsociada : arrayListCategorias.get(vistaPantallaCategorias.getjTable1().getSelectedRow()).getPeliculasAsociadas()) {
                valTemp += peliculasAsociada.getTitulo() + "\n";                
            }
            vistaPantallaCategorias.getjTextArea1().setText(valTemp);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent event) {

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
