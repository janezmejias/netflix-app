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

/**
 *
 * @author janez
 */
public class Constantes {

    /**
     * TAG PALICULA
     */
    public static String TXT_PELICULA_TITULO = "Titulo";
    public static String TXT_PELICULA_GENERO = "Genero";
    public static String TXT_PELICULA_PAIS_ORIGEN = "Pais Origen";
    public static String TXT_PELICULA_ACTOR = "Actor";
    public static String TXT_PELICULA_DIRECTOR = "Director";
    public static String TXT_PELICULA_ANO_ESTRENO = "Ano";
    public static String TXT_PELICULA_RESUMEN = "Resumen";
    public static String TXT_PELICULA_CALIFICACION = "Calificacion";

    /**
     * TAGS CATEGORIA
     */
    public static String TXT_CATEGORY_NAME = "Categoria";
    public static String TXT_CATEGORY_DESCRIPTION = "Descripcion";
    public static String TXT_CATEGORY_ASOCIATE_MOVIES = "Peliculas Asociadas";

    /**
     * TAG USUARIO
     */
    public static String TXT_USUARIO_NOMBRE = "Nombre";
    public static String TXT_USUARIO_CORREO = "Correo";
    public static String TXT_USUARIO_PAIS = "Pais";
    public static String TXT_USUARIO_FECHA_REGISTRO = "Fecha Registro";

    /**
     * TAG SUBSCRIPCIONES
     */
    public static String TXT_PLAN_NOMBRE = "Nombre";
    public static String TXT_PLAN_PRECIO = "Precio";
    public static String TXT_PLAN_CATEGORIA = "Categoria";

    /**
     * TAG SUBSCRIPCION
     */
    public static String TXT_SUBCRIPCION_NOMBRE_USUARIO = "Nombre";
    public static String TXT_SUBCRIPCION_PLAN = "Plan";
    public static String TXT_SUBCRIPCION_FECHA_CONTRATO = "Fecha Contrato";
    public static String TXT_SUBCRIPCION_FECHA_VENCIMIENTO = "Fcha Vencimiento";

    /**
     * CANTIDAD DE COLUMNAS POR MODELO
     */
    public static final int CANT_COLUMNAS_PELICULA = 5;
    public static final int CANT_COLUMNAS_CATEGORIA = 2;
    public static final int CANT_COLUMNAS_USUARIO = 4;
    public static final int CANT_COLUMNAS_PLANES = 3;
    public static final int CANT_COLUMNAS_SUBSCRIPCION = 4;

    /**
     * MODELO DE COLUMNAS POR OBJETO
     */
    public static final String[] columNamePelicula = {Constantes.TXT_PELICULA_TITULO, Constantes.TXT_PELICULA_GENERO,
        Constantes.TXT_PELICULA_ACTOR, Constantes.TXT_PELICULA_ANO_ESTRENO, Constantes.TXT_PELICULA_CALIFICACION};
    public static final String[] columNameCategoria = {Constantes.TXT_CATEGORY_NAME, Constantes.TXT_CATEGORY_DESCRIPTION,};
    public static final String[] columNameUsuario = {Constantes.TXT_USUARIO_NOMBRE, Constantes.TXT_USUARIO_CORREO,
        Constantes.TXT_USUARIO_PAIS, Constantes.TXT_USUARIO_FECHA_REGISTRO};
    public static final String[] columNamePlanes = {Constantes.TXT_PLAN_NOMBRE, Constantes.TXT_PLAN_PRECIO, Constantes.TXT_PLAN_CATEGORIA};
    public static final String[] columNameSubscripcion = {Constantes.TXT_SUBCRIPCION_NOMBRE_USUARIO,
        Constantes.TXT_SUBCRIPCION_PLAN, Constantes.TXT_SUBCRIPCION_FECHA_CONTRATO, Constantes.TXT_SUBCRIPCION_FECHA_VENCIMIENTO};

}
