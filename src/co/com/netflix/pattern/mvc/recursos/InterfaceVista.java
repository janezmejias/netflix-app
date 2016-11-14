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
package co.com.netflix.pattern.mvc.recursos;

/**
 *
 * @author janez
 */
public interface InterfaceVista {

    /**
     * Define el controlador para los componentes de la vista
     *
     * @param controlador El controlador a definir
     */
    public void setControlador(InterfaceControlador controlador);

    /**
     * Define en los componentes que eventos va a manejar el controlador
     *
     * @param controlador El controlador que va a manejar los eventos
     */
    public void adjuntarManejadorEventos(InterfaceControlador controlador);

    /**
     * Se definen las instrucciones necesarias para desplegar la vista
     */
    public void abrir();
    
    public void limpiar();
}
