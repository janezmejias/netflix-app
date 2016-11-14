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
public class Pelicula {

    private String titulo;
    private String genero;
    private String paisOrigen;
    private String actoresPrincipales;
    private String director;
    private String anoEstreno;
    private String resumenTrama;
    private int calificacion;

    public Pelicula() {
    }

    /**
     *
     * @param titulo
     */
    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    /**
     * 
     * @param titulo
     * @param genero
     * @param paisOrigen
     * @param actoresPrincipales
     * @param director
     * @param anoEstreno
     * @param resumenTrama
     * @param calificacion 
     */
    public Pelicula(String titulo, String genero, String paisOrigen, String actoresPrincipales, String director, String anoEstreno, String resumenTrama, int calificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.paisOrigen = paisOrigen;
        this.actoresPrincipales = actoresPrincipales;
        this.director = director;
        this.anoEstreno = anoEstreno;
        this.resumenTrama = resumenTrama;
        this.calificacion = calificacion;
    }

    /**
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @return
     */
    public String getGenero() {
        return genero;
    }

    /**
     *
     * @return
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     *
     * @return
     */
    public String getActoresPrincipales() {
        return actoresPrincipales;
    }

    /**
     *
     * @return
     */
    public String getDirector() {
        return director;
    }

    /**
     *
     * @return
     */
    public String getAnoEstreno() {
        return anoEstreno;
    }

    /**
     *
     * @return
     */
    public String getResumenTrama() {
        return resumenTrama;
    }

    /**
     *
     * @return
     */
    public int getCalificacion() {
        return calificacion;
    }

}
