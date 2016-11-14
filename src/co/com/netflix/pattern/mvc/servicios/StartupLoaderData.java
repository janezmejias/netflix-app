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
import co.com.netflix.pattern.mvc.Entidades.TarjetaCredito;
import co.com.netflix.pattern.mvc.Entidades.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author janez
 */
public class StartupLoaderData {

    public StartupLoaderData() {
        AlmacenDatosTemporal.getInstance().setArrayListCategorias(getCategorias());
        AlmacenDatosTemporal.getInstance().setArrayListPeliculas(getPeliculas());
        AlmacenDatosTemporal.getInstance().setArrayListPlanes(getPlanSubscripcion());
        AlmacenDatosTemporal.getInstance().setArrayListUsuarios(getUsuarios());
    }        

    /**
     *
     * @return
     */
    private ArrayList<Pelicula> getPeliculas() {
        ArrayList<Pelicula> arrayListUtil = new ArrayList<>();
        for (int index = 1; index < 5; index++) {
            arrayListUtil.add(new Pelicula("TITULO_PEL_" + index, "GENERO_" + index, "PAIS_ORIGEN_" + index,
                    "ACTOR_" + index, "DIRECTOR_" + index, "ESTRENO_" + index, "RESUMEN_" + index, (int) Math.floor(Math.random() * 5)));
        }
        return arrayListUtil;
    }

    /**
     *
     * @return
     */
    private ArrayList<Categoria> getCategorias() {
        ArrayList<Categoria> arrayListUtil = new ArrayList<>();
        ArrayList<Pelicula> arrayListPeliculasUtil = AlmacenDatosTemporal.getInstance().getArrayListPeliculas();
        for (int index = 1; index < 5; index++) {
            arrayListUtil.add(new Categoria("NOMBRE_CAT_" + index, "DESCRIPCION_" + index, arrayListPeliculasUtil));
        }
        return arrayListUtil;
    }

    /**
     *
     * @return
     */
    private ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> arrayListUtil = new ArrayList<>();
        for (int index = 1; index < 5; index++) {
            arrayListUtil.add(new Usuario("Usuario_" + index, "Usuario_" + index + "@Sky.com.co", "Colombia",
                    new TarjetaCredito((int) Math.floor(Math.random() * 10000) + "-"
                            + (int) Math.floor(Math.random() * 10000) + "-"
                            + (int) Math.floor(Math.random() * 10000) + "-"
                            + (int) Math.floor(Math.random() * 10000), "21/0" + (int) Math.floor(Math.random() * 10), (int) Math.floor(Math.random() * 1000)),
                    new Date()));
        }
        return arrayListUtil;
    }

    /**
     *
     * @return
     */
    private ArrayList<Plan> getPlanSubscripcion() {
        ArrayList<Plan> arrayListUtil = new ArrayList<>();
        for (int index = 1; index < 5; index++) {
            arrayListUtil.add(new Plan("PLAN_" + index, index * 2500, getCategorias().get(index-1)));
        }
        return arrayListUtil;
    }

    /**
     *
     * @return
     */
    public HashMap<Categoria, ArrayList<Pelicula>> getMapPeliculaAsociadaCategoria() {
        HashMap<Categoria, ArrayList<Pelicula>> mapPeliculaAsociadaCategoria = new HashMap<>();
        ArrayList<Pelicula> arrayListPeliculasUtil = AlmacenDatosTemporal.getInstance().getArrayListPeliculas();
        for (int index = 1; index < 5; index++) {
            mapPeliculaAsociadaCategoria.put(new Categoria("NOMBRE_" + index, "DESCRIPCION_" + index), arrayListPeliculasUtil);
        }
        return mapPeliculaAsociadaCategoria;
    }

}
