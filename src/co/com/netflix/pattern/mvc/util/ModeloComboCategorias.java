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

import co.com.netflix.pattern.mvc.Entidades.Categoria;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author janez
 */
public class ModeloComboCategorias extends AbstractListModel implements ComboBoxModel {

    private static final long serialVersionUID = 1L;
    private ArrayList<Categoria> items = new ArrayList<>();
    private String selectedObject;

    /**
     *
     * @param arreglo
     */
    public ModeloComboCategorias(Categoria[] arreglo) {        
        if (arreglo != null) {
            for (int i = 0, j = arreglo.length; i < j; i++) {
                items.add(arreglo[i]);
            }
        }
    }

    /**
     *
     * @param lista
     */
    public ModeloComboCategorias(ArrayList<Categoria> lista) {
        if (lista != null) {
            for (int i = 0, j = lista.size(); i < j; i++) {
                items.add(lista.get(i));
            }
        }
    }

    /**
     *
     * @param list
     */
    public void llenar(ArrayList<Categoria> list) {
        for (int i = 0, j = list.size(); i < j; i++) {
            items.add(list.get(i));
        }

        fireContentsChanged(this, 0, list.size());

        try {
            setSelectedItem((list.size() > 0) ? list.get(0) : null);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("vacio");
        }
    }

    public void vaciar() {
        int n = items.size();
        items.clear();
        fireContentsChanged(this, 0, n);
    }

    public ModeloComboCategorias() {        
        items = new ArrayList<>();
    }

    @Override
    public String getSelectedItem() {
        return selectedObject;
    }

    /**
     *
     * @param selectedObject
     */
    @SuppressWarnings("unchecked")
    @Override
    public void setSelectedItem(Object selectedObject) {
        this.selectedObject = (String) selectedObject;
    }

    /**
     *
     * @param index
     * @return
     */
    @Override
    public String getElementAt(int index) {
        if (index > -1 && index < items.size()) {
            return items.get(index).getNombre();
        } else {
            return null;
        }
    }

    @Override
    public int getSize() {
        return items.size();
    }

    /**
     *
     * @return
     */
    public ArrayList<Categoria> getData() {
        return items;
    }
    
}
