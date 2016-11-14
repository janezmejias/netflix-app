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
package co.com.netflix.pattern.mvc.Entidades;

import java.util.ArrayList;

/**
 *
 * @author janez
 */
public class Categoria {

    private String nombre;
    private String descripcion;
    private ArrayList<Pelicula> peliculasAsociadas;

    public Categoria() {
    }

    /**
     *
     * @param nombre
     */
    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @param nombre
     * @param descripcion 
     */
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    

    /**
     *
     * @param nombre
     * @param descripcion
     * @param peliculasAsociadas
     */
    public Categoria(String nombre, String descripcion, ArrayList<Pelicula> peliculasAsociadas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peliculasAsociadas = peliculasAsociadas;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @return
     */
    public ArrayList<Pelicula> getPeliculasAsociadas() {
        return peliculasAsociadas;
    }

}
