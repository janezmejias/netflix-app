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
public class Usuario {

    private String correo;
    private String nombre;
    private String pais;
    private TarjetaCredito tarjetaCredito;
    private Date fechaRegistro;

    public Usuario() {
    }

    /**
     *
     * @param correo
     * @param nombre
     * @param pais
     * @param tarjetaCredito
     * @param fechaRegistro
     */
    public Usuario(String nombre, String correo, String pais, TarjetaCredito tarjetaCredito, Date fechaRegistro) {        
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
        this.tarjetaCredito = tarjetaCredito;
        this.fechaRegistro = fechaRegistro;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
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
    public String getPais() {
        return pais;
    }

    /**
     *
     * @return
     */
    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

}
