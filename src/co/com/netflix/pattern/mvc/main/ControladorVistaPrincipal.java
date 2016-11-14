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
package co.com.netflix.pattern.mvc.main;

import co.com.netflix.pattern.mvc.Peliculas.ManejadorPeliculas;
import co.com.netflix.pattern.mvc.categorias.ManejadorCategorias;
import co.com.netflix.pattern.mvc.recursos.InterfaceControlador;
import co.com.netflix.pattern.mvc.recursos.InterfaceVista;
import co.com.netflix.pattern.mvc.servicios.StartupLoaderData;
import co.com.netflix.pattern.mvc.planes.ManejadorPlanes;
import co.com.netflix.pattern.mvc.subcripcion.ManejadorSubcripciones;
import co.com.netflix.pattern.mvc.usuarios.ManejadorUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

/**
 *
 * @author janez
 */
public class ControladorVistaPrincipal implements InterfaceControlador {

    private VistaPantallaPrincipal vistaPantallaPrincipal;

    public ControladorVistaPrincipal() {
        this.cargarDatosIniciales();
    }

    /**
     *
     * @return
     */
    private StartupLoaderData cargarDatosIniciales() {
        return new StartupLoaderData();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == vistaPantallaPrincipal.getBottonPelicula()) {
            manejadorPeliculas();
        } else if (event.getSource() == vistaPantallaPrincipal.getBotonCategorias()) {
            manejadorCategorias();
        } else if (event.getSource() == vistaPantallaPrincipal.getBotonUsuario()) {
            manejadorUsuarios();
        } else if (event.getSource() == vistaPantallaPrincipal.getBotonPlanes()) {
            manejadorPlanSubscripcion();
        } else if (event.getSource() == vistaPantallaPrincipal.getjButtonSubscripciones()) {
            manejadorSubcripciones();
        }
    }

    /**
     *
     * @return
     */
    private ManejadorPeliculas manejadorPeliculas() {
        return new ManejadorPeliculas();
    }

    /**
     *
     * @return
     */
    private ManejadorCategorias manejadorCategorias() {
        return new ManejadorCategorias();
    }

    /**
     *
     * @return
     */
    private ManejadorUsuarios manejadorUsuarios() {
        return new ManejadorUsuarios();
    }

    /**
     *
     * @return
     */
    private ManejadorPlanes manejadorPlanSubscripcion() {
        return new ManejadorPlanes();
    }
    
    /**
     * 
     * @return 
     */
    private ManejadorSubcripciones manejadorSubcripciones() {
        return new ManejadorSubcripciones();
    }

    @Override
    public void setControlado(InterfaceVista controlado) {
        this.vistaPantallaPrincipal = (VistaPantallaPrincipal) controlado;
    }

    @Override
    public void itemStateChanged(ItemEvent event) {

    }

}
