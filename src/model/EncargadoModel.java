/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase encargado
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import pojo.Encargado;

public class EncargadoModel {

    public List<Encargado> crearEncargado(List<Encargado> lista2, Encargado encargado) {// agregamos objetos a la lista
        lista2.add(encargado);
        return lista2;
    }

    public List<Encargado> eliminarEncargado(List<Encargado> lista, String codTrab) {// eliminamos un objeto de la lista
        for (Encargado encargado : lista) {
            if (codTrab.compareTo(encargado.getCodTrab()) == 0) {
                lista.remove(encargado);
                return lista;
            }
        }
        return lista;
    }

    public void mostrarEncargado(List<Encargado> lista, DefaultTableModel modelo) {// Imprimimos el contenido de la lista
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[3];
            fila[0] = lista.get(i).getCodTrab();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getTelefono();
            modelo.addRow(fila);
        }
    }

    public Encargado getEncargado(List<Encargado> lista, String CodTrab) {// Buscamos un objeto a tavés de su código
        Encargado vacio = null;
        for (Encargado encargado : lista) {
            if (CodTrab.compareTo(encargado.getCodTrab()) == 0) {
                return encargado;
            }
        }
        return vacio;
    }

    // Actualizamos datos de un objeto de la lista
    public List<Encargado> actualizarEncargado(List<Encargado> lista, Encargado encargado) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodTrab().compareTo(encargado.getCodTrab()) == 0) {
                lista.set(i, encargado);
                break;
            }
        }
        return lista;
    }

}
