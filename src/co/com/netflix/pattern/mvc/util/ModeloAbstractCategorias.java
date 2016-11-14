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
package co.com.netflix.pattern.mvc.util;

import co.com.netflix.pattern.mvc.Entidades.Categoria;
import co.com.netflix.pattern.mvc.Entidades.Pelicula;
import co.com.netflix.pattern.mvc.servicios.AlmacenDatosTemporal;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author janez
 */
public class ModeloAbstractCategorias extends AbstractListModel {

    private ArrayList<Pelicula> arrayListPeliculas;
    private ArrayList<Categoria> arrayListCategorias;
    private String type;

    public ModeloAbstractCategorias(String tipo) {
        this.type = tipo;
        switch (tipo) {
            case "inicial":
                arrayListPeliculas = AlmacenDatosTemporal.getInstance().getArrayListPeliculas();
                break;
            case "preferencial":
                arrayListCategorias = AlmacenDatosTemporal.getInstance().getArrayListCategorias();
                break;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public int getSize() {
        switch (getType()) {
            case "inicial":
                return arrayListPeliculas.size();
            case "preferencial":
                return arrayListCategorias.size();
        }
        return -1;
    }

    /**
     *
     * @param index
     * @return
     */
    @Override
    public Object getElementAt(int index) {
        switch (getType()) {
            case "inicial":
                return arrayListPeliculas.get(index).getTitulo();
            case "preferencial":
                String value = "";
                for (Pelicula peliculasAsociada : arrayListCategorias.get(index).getPeliculasAsociadas()) {
                    value += " | " + peliculasAsociada.getTitulo();
                }
                return value;
        }
        return null;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

}
