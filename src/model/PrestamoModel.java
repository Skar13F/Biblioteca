/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase préstamo 
 */
package model;

import java.util.List;

import javax.swing.table.DefaultTableModel;
import pojo.*;

public class PrestamoModel {

    public List<Prestamo> crearPrestamo(List<Prestamo> lista, Prestamo prest) {// añadimos objetos a la lista
        prest.setId(lista.size() + 1);
        lista.add(prest);
        return lista;

    }

    public Prestamo getPrestamo(List<Prestamo> lista, Prestamo prestamo) {// obtenemos un objeto a través de su id
        Prestamo prestamo1 = null;
        for (Prestamo prestam : lista) {
            if (prestam.getFechaSol().equals(prestamo.getFechaSol()) && prestam.getFechaEnt().equals(prestamo.getFechaEnt()) && prestam.getCodTrab().equals(prestamo.getCodTrab()) && prestam.getMatricula().equals(prestamo.getMatricula())) {
                return prestam;
            }
        }
        return prestamo1;
    }

    public List<Prestamo> eliminarPrestamo(List<Prestamo> lista, Prestamo prestamo) {// eliminamos un objeto de la lista
        for (Prestamo prestam : lista) {
            if (prestam.getFechaSol().equals(prestamo.getFechaSol()) && prestam.getFechaEnt().equals(prestamo.getFechaEnt()) && prestam.getCodTrab().equals(prestamo.getCodTrab()) && prestam.getMatricula().equals(prestamo.getMatricula())) {
                lista.remove(prestam);
                return lista;
            }
        }
        return lista;
    }

    public void mostrarPrestamo(List<Prestamo> lista, List<Libro> listaLibro, List<Encargado> listaEncargado,
            List<Usuario> listaUsuario, DefaultTableModel modelo) {// imprimimos el contenido de la lista
        modelo.setRowCount(0);
        String isbn = "";
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setId(i + 1);
            isbn = "";
            Object[] fila = new Object[6];
            fila[0] = lista.get(i).getId();
            fila[1] = lista.get(i).getFechaSol();
            fila[2] = lista.get(i).getFechaEnt();
            fila[3] = lista.get(i).getMatricula();
            fila[4] = lista.get(i).getCodTrab();
            fila[5] = lista.get(i).getNombres();
            modelo.addRow(fila);
        }

    }

    public List<Prestamo> actualizarPrestamo(List<Prestamo> lista, int id, Prestamo prestamo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.set(i, prestamo);
            }
        }
        return lista;
    }

}
