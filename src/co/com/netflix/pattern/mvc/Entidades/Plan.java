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

/**
 *
 * @author janez
 */
public class Plan {

    private String nombre;
    private double precio;
    private Categoria categoria;

    public Plan() {
    }

    /**
     *
     * @param nombre
     * @param precio
     */
    public Plan(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     *
     * @param nombre
     * @param precio
     * @param categoria
     */
    public Plan(String nombre, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * *
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
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @return
     */
    public Categoria getCategoria() {
        return categoria;
    }

}
