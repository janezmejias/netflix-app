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
import co.com.netflix.pattern.mvc.Entidades.Plan;
import co.com.netflix.pattern.mvc.Entidades.Subscripcion;
import co.com.netflix.pattern.mvc.Entidades.Usuario;
import co.com.netflix.pattern.mvc.servicios.AlmacenDatosTemporal;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author janez
 */
public class ModelAbstractTableGeneric extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    private Object[][] data = new Object[0][0];
    private int indice = 0;
    private int size = 0;
    private String tipo;

    public ModelAbstractTableGeneric(String tipo) {
        this.tipo = tipo;
        if (null != tipo) {
            switch (tipo) {
                case "cat":
                    cargarDatosCategoria(AlmacenDatosTemporal.getInstance().getArrayListCategorias());
                    break;
                case "pel":
                    cargarDatosPelicula(AlmacenDatosTemporal.getInstance().getArrayListPeliculas());
                    break;
                case "users":
                    cargarDatosUsuarios(AlmacenDatosTemporal.getInstance().getArrayListUsuarios());
                    break;
                case "plan":
                    cargarDatosPlanes(AlmacenDatosTemporal.getInstance().getArrayListPlanes());
                    break;
                case "subs":
                    cargarDatosSuscripciones(AlmacenDatosTemporal.getInstance().getArrayListSubscripciones());
                    break;
            }
        }
    }

    /**
     *
     * @param column
     * @return
     */
    @Override
    public String getColumnName(int column) {
        if (null != getTipo()) {
            switch (getTipo()) {
                case "cat":
                    return Constantes.columNameCategoria[column];
                case "pel":
                    return Constantes.columNamePelicula[column];
                case "plan":
                    return Constantes.columNamePlanes[column];
                case "users":
                    return Constantes.columNameUsuario[column];
                case "subs":
                    return Constantes.columNameSubscripcion[column];
            }
        }
        return null;
    }

    /**
     *
     * @param categoria
     */
    private void agregarFila(Object object) {
        if (object instanceof Pelicula) {
            Pelicula pelicula = (Pelicula) object;
            data[indice][0] = pelicula.getTitulo();
            data[indice][1] = pelicula.getGenero();
            data[indice][2] = pelicula.getActoresPrincipales();
            data[indice][3] = pelicula.getAnoEstreno();
            data[indice][4] = pelicula.getCalificacion();
            indice++;
            fireTableDataChanged();
        } else if (object instanceof Categoria) {
            Categoria categoria = (Categoria) object;
            data[indice][0] = categoria.getNombre();
            data[indice][1] = categoria.getDescripcion();
            indice++;
            fireTableDataChanged();
        } else if (object instanceof Usuario) {
            Usuario usuario = (Usuario) object;
            data[indice][0] = usuario.getNombre();
            data[indice][1] = usuario.getCorreo();
            data[indice][2] = usuario.getPais();
            data[indice][3] = usuario.getFechaRegistro();
            indice++;
            fireTableDataChanged();
        } else if (object instanceof Plan) {
            Plan planSubscripcion = (Plan) object;
            data[indice][0] = planSubscripcion.getNombre();
            data[indice][1] = planSubscripcion.getPrecio();
            data[indice][2] = planSubscripcion.getCategoria().getNombre();
            indice++;
            fireTableDataChanged();
        } else if (object instanceof Subscripcion) {
            Subscripcion subscripcion = (Subscripcion) object;
            data[indice][0] = subscripcion.getUsuario().getNombre();
            data[indice][1] = subscripcion.getPlan().getNombre();
            data[indice][2] = subscripcion.getFechaInicio();
            data[indice][3] = subscripcion.getFechaFin();
            indice++;
            fireTableDataChanged();
        }
    }

    /**
     *
     * @param listaCategorias
     */
    private void cargarDatosPelicula(ArrayList<Pelicula> arrayListPeliculas) {
        size = arrayListPeliculas.size();
        data = new Object[size][Constantes.CANT_COLUMNAS_PELICULA];
        for (Pelicula element : arrayListPeliculas) {
            agregarFila(element);
        }
    }

    /**
     *
     * @param listaCategorias
     */
    private void cargarDatosCategoria(ArrayList<Categoria> listaCategorias) {
        size = listaCategorias.size();
        data = new Object[size][Constantes.CANT_COLUMNAS_CATEGORIA];
        for (Categoria element : listaCategorias) {
            agregarFila(element);
        }
    }

    /**
     *
     * @param arrayListUsuarios
     */
    private void cargarDatosUsuarios(ArrayList<Usuario> arrayListUsuarios) {
        size = arrayListUsuarios.size();
        data = new Object[size][Constantes.CANT_COLUMNAS_USUARIO];
        for (Usuario element : arrayListUsuarios) {
            agregarFila(element);
        }
    }

    /**
     *
     * @param planSubscripcions
     */
    private void cargarDatosPlanes(ArrayList<Plan> arrayListPlan) {
        size = arrayListPlan.size();
        data = new Object[size][Constantes.CANT_COLUMNAS_PLANES];
        for (Plan element : arrayListPlan) {
            agregarFila(element);
        }
    }

    /**
     *
     * @param arrayListSubscripcions
     */
    private void cargarDatosSuscripciones(ArrayList<Subscripcion> arrayListSubscripcions) {
        size = arrayListSubscripcions.size();
        data = new Object[size][Constantes.CANT_COLUMNAS_SUBSCRIPCION];
        for (Subscripcion element : arrayListSubscripcions) {
            agregarFila(element);
        }
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public int getColumnCount() {
        if (null != getTipo()) {
            switch (getTipo()) {
                case "pel":
                    return Constantes.columNamePelicula.length;
                case "cat":
                    return Constantes.columNameCategoria.length;
                case "users":
                    return Constantes.columNameUsuario.length;
                case "plan":
                    return Constantes.columNamePlanes.length;
                case "subs":
                    return Constantes.columNameSubscripcion.length;
            }
        }
        return -1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (data.length > 0) {
            return data[rowIndex][columnIndex];
        }
        return new Object();
    }

}
