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
package co.com.netflix.pattern.mvc.servicios;

import co.com.netflix.pattern.mvc.Entidades.Categoria;
import co.com.netflix.pattern.mvc.Entidades.Pelicula;
import co.com.netflix.pattern.mvc.Entidades.Plan;
import co.com.netflix.pattern.mvc.Entidades.Subscripcion;
import co.com.netflix.pattern.mvc.Entidades.Usuario;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author janez
 */
public class AlmacenDatosTemporal {

    public AlmacenDatosTemporal() {
    }

    private static class AlmacenDatosEncapsulado {

        private static final AlmacenDatosTemporal INSTANCE = new AlmacenDatosTemporal();
    }

    public static AlmacenDatosTemporal getInstance() {
        return AlmacenDatosEncapsulado.INSTANCE;
    }

    private ArrayList<Categoria> arrayListCategorias = new ArrayList<>();
    private ArrayList<Pelicula> arrayListPeliculas = new ArrayList<>();
    private ArrayList<Plan> arrayListPlanes = new ArrayList<>();
    private ArrayList<Usuario> arrayListUsuarios = new ArrayList<>();
    private ArrayList<Subscripcion> arrayListSubscripciones = new ArrayList<>();
    private HashMap<Categoria, ArrayList<Pelicula>> mapPeliculaAsociadaCategoria = new HashMap<>();

    /**
     *
     * @return
     */
    public ArrayList<Categoria> getArrayListCategorias() {
        AlmacenDatosTemporal instance = getInstance();
        return instance.arrayListCategorias;
    }

    /**
     *
     * @return
     */
    public ArrayList<Pelicula> getArrayListPeliculas() {
        AlmacenDatosTemporal instance = getInstance();
        return instance.arrayListPeliculas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Plan> getArrayListPlanes() {
        AlmacenDatosTemporal instance = getInstance();
        return instance.arrayListPlanes;
    }

    /**
     *
     * @return
     */
    public ArrayList<Usuario> getArrayListUsuarios() {
        AlmacenDatosTemporal instance = getInstance();
        return instance.arrayListUsuarios;
    }

    /**
     *
     * @return
     */
    public ArrayList<Subscripcion> getArrayListSubscripciones() {
        AlmacenDatosTemporal instance = getInstance();
        return instance.arrayListSubscripciones;
    }

    /**
     *
     * @param arrayListSubscripciones
     */
    public void setArrayListSubscripciones(ArrayList<Subscripcion> arrayListSubscripciones) {
        this.arrayListSubscripciones = arrayListSubscripciones;
    }

    /**
     * *
     *
     * @param arrayListPeliculas
     */
    public void setArrayListPeliculas(ArrayList<Pelicula> arrayListPeliculas) {
        this.arrayListPeliculas = arrayListPeliculas;
    }

    /**
     *
     * @param arrayListCategorias
     */
    public void setArrayListCategorias(ArrayList<Categoria> arrayListCategorias) {
        this.arrayListCategorias = arrayListCategorias;
    }

    /**
     *
     * @param arrayListUsuarios
     */
    public void setArrayListUsuarios(ArrayList<Usuario> arrayListUsuarios) {
        this.arrayListUsuarios = arrayListUsuarios;
    }

    /**
     *
     * @param arrayListPlanes
     */
    public void setArrayListPlanes(ArrayList<Plan> arrayListPlanes) {
        this.arrayListPlanes = arrayListPlanes;
    }

    /**
     *
     * @param pelicula
     */
    public void setPeliculaToArrayList(Pelicula pelicula) {
        arrayListPeliculas.add(pelicula);
    }

    /**
     *
     * @param categoria
     */
    public void setCategoriaToArrayList(Categoria categoria) {
        arrayListCategorias.add(categoria);
    }

    /**
     *
     * @param usuario
     */
    public void setUsuarioToArrayList(Usuario usuario) {
        arrayListUsuarios.add(usuario);
    }

    /**
     *
     * @param plan
     */
    public void setPlanToArrayList(Plan plan) {
        arrayListPlanes.add(plan);
    }

    /**
     *
     * @param subscripcion
     */
    public void setSubscripcionToArrayList(Subscripcion subscripcion) {
        arrayListSubscripciones.add(subscripcion);
    }

    /**
     *
     * @return
     */
    public HashMap<Categoria, ArrayList<Pelicula>> getMapPeliculaAsociadaCategoria() {
        AlmacenDatosTemporal instance = getInstance();
        return instance.mapPeliculaAsociadaCategoria;
    }

    /**
     *
     * @param mapPeliculaAsociadaCategoria
     */
    public void setMapPeliculaAsociadaCategoria(HashMap<Categoria, ArrayList<Pelicula>> mapPeliculaAsociadaCategoria) {
        this.mapPeliculaAsociadaCategoria = mapPeliculaAsociadaCategoria;
    }

    /**
     *
     * @param categoria
     * @param arrayListPeliculasE
     */
    public void setPeliculaAsociadaCategoria(Categoria categoria, ArrayList<Pelicula> arrayListPeliculasE) {
        this.mapPeliculaAsociadaCategoria.put(categoria, arrayListPeliculasE);
    }

    /**
     *
     * @param index
     * @param pelicula
     */
    public void actualizarPelicula(int index, Pelicula pelicula) {
        this.arrayListPeliculas.set(index, pelicula);
    }

}
