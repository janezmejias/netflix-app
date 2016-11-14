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
package co.com.netflix.pattern.mvc.Peliculas;

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
public class ControladorModuloPeliculas implements InterfaceControlador, MouseListener {

    private VistaPantallaPelicula vistaPantallaPelicula;

    @Override
    public void setControlado(InterfaceVista controlado) {
        this.vistaPantallaPelicula = (VistaPantallaPelicula) controlado;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == vistaPantallaPelicula.getjButton1()) {
            agregarPelicula();
        } else if (event.getSource() == vistaPantallaPelicula.getjButton2()) {

        } else if (event.getSource() == vistaPantallaPelicula.getjButtonActualizar()) {
            actualizarPelicula();
        }
    }

    private void actualizarPelicula() {
        AlmacenDatosTemporal.getInstance().actualizarPelicula(vistaPantallaPelicula.getjTable2().getSelectedRow(),
                new Pelicula(vistaPantallaPelicula.getjTextField7().getText(),
                        vistaPantallaPelicula.getjTextField8().getText(),
                        vistaPantallaPelicula.getjTextField9().getText(),
                        vistaPantallaPelicula.getjTextField10().getText(),
                        vistaPantallaPelicula.getjTextField11().getText(),
                        vistaPantallaPelicula.getjTextField12().getText(),
                        vistaPantallaPelicula.getjTextArea2().getText(),
                        vistaPantallaPelicula.getjComboBox2().getSelectedIndex()));
        vistaPantallaPelicula.getjTable2().setModel(new ModelAbstractTableGeneric("pel"));
        JOptionPane.showMessageDialog(null, "Pelicula actualizada con exito.!");
        vistaPantallaPelicula.limpiar();
    }

    private void agregarPelicula() {
        AlmacenDatosTemporal.getInstance().setPeliculaToArrayList(new Pelicula(vistaPantallaPelicula.getjTextField1().getText(),
                vistaPantallaPelicula.getjTextField2().getText(), vistaPantallaPelicula.getjTextField3().getText(),
                vistaPantallaPelicula.getjTextField4().getText(), vistaPantallaPelicula.getjTextField5().getText(),
                vistaPantallaPelicula.getjTextField6().getText(), vistaPantallaPelicula.getjTextArea1().getText(),
                (vistaPantallaPelicula.getjComboBox1().getSelectedIndex() + 1)));
        vistaPantallaPelicula.getjTable2().setModel(new ModelAbstractTableGeneric("pel"));
        JOptionPane.showMessageDialog(null, "Pelicula agregada con exito.!");
        vistaPantallaPelicula.limpiar();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent event) {
        ArrayList<Pelicula> arrayListCategorias = AlmacenDatosTemporal.getInstance().getArrayListPeliculas();
        if (event.getClickCount() == 2) {
            vistaPantallaPelicula.getjTabbedPane1().setSelectedIndex(2);
            vistaPantallaPelicula.getjTextField7().setText(arrayListCategorias.get(vistaPantallaPelicula.getjTable2().getSelectedRow()).getTitulo());
            vistaPantallaPelicula.getjTextField8().setText(arrayListCategorias.get(vistaPantallaPelicula.getjTable2().getSelectedRow()).getGenero());
            vistaPantallaPelicula.getjTextField9().setText(arrayListCategorias.get(vistaPantallaPelicula.getjTable2().getSelectedRow()).getPaisOrigen());
            vistaPantallaPelicula.getjTextField10().setText(arrayListCategorias.get(vistaPantallaPelicula.getjTable2().getSelectedRow()).getActoresPrincipales());
            vistaPantallaPelicula.getjTextField11().setText(arrayListCategorias.get(vistaPantallaPelicula.getjTable2().getSelectedRow()).getDirector());
            vistaPantallaPelicula.getjTextField12().setText(arrayListCategorias.get(vistaPantallaPelicula.getjTable2().getSelectedRow()).getAnoEstreno());
            vistaPantallaPelicula.getjTextArea2().setText(arrayListCategorias.get(vistaPantallaPelicula.getjTable2().getSelectedRow()).getResumenTrama());
            vistaPantallaPelicula.getjComboBox2().setSelectedIndex(arrayListCategorias.get(vistaPantallaPelicula.getjTable2().getSelectedRow()).getCalificacion());
        }
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
