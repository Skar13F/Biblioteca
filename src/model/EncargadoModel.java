/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 17 de junio de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase encargado
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import pojo.Encargado;

public class EncargadoModel {

    // Método para agregar objetos a la lista de encargados
    public List<Encargado> crearEncargado(List<Encargado> lista2,
            Encargado encargado) {
        lista2.add(encargado);
        return lista2;
    }

    // Método para eliminar un objeto encargado de la lista
    public List<Encargado> eliminarEncargado(List<Encargado> lista,
            String codTrab) {
        for (Encargado encargado : lista) {
            if (codTrab.compareTo(encargado.getCodTrab()) == 0) {
                lista.remove(encargado);
                return lista;
            }
        }
        return lista;
    }

    //Método para buscar un objeto en la lista, retorna nulo si no lo encuentra
    public Encargado getEncargado(List<Encargado> lista, String CodTrab) {
        Encargado vacio = null;
        for (Encargado encargado : lista) {
            if (CodTrab.compareTo(encargado.getCodTrab()) == 0) {
                return encargado;
            }
        }
        return vacio;
    }

    // Método para actualizar datos de un  objeto en la lista
    public List<Encargado> actualizarEncargado(List<Encargado> lista,
            Encargado encargado) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodTrab().compareTo(encargado.getCodTrab())
                    == 0) {
                lista.set(i, encargado);
                break;
            }
        }
        return lista;
    }

    // Método para mostrar el contenido de la lista en una tabla
    public void mostrarEncargado(List<Encargado> lista,
            DefaultTableModel modelo) {
        modelo.setRowCount(0);//resetea la tabla
        for (int i = 0; i < lista.size(); i++) {
            //Objeto fila para obtener los datos se mostrará
            Object[] fila = new Object[3];
            fila[0] = lista.get(i).getCodTrab();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getTelefono();
            modelo.addRow(fila);//Añadimos la fila a la tabla
        }
    }
}
