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

import java.util.Date;

/**
 *
 * @author janez
 */
public class Subscripcion {

    private Usuario usuario;
    private Plan plan;
    private Date fechaInicio;
    private Date fechaFin;
    private String tiempoSubscripcion;

    public Subscripcion() {
    }

    /**
     *
     * @param usuario
     * @param plan
     * @param fechaInicio
     * @param fechaFin
     * @param tiempoSubscripcion
     */
    public Subscripcion(Usuario usuario, Plan plan, Date fechaInicio, Date fechaFin, String tiempoSubscripcion) {
        this.usuario = usuario;
        this.plan = plan;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tiempoSubscripcion = tiempoSubscripcion;
    }

    /**
     *
     * @return
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     *
     * @return
     */
    public Plan getPlan() {
        return plan;
    }

    /**
     *
     * @return
     */
    public String getTiempoSubscripcion() {
        return tiempoSubscripcion;
    }

    /**
     *
     * @return
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     *
     * @return
     */
    public Date getFechaFin() {
        return fechaFin;
    }

}
