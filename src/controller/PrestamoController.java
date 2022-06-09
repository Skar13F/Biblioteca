/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 08 de junio de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y 
 * 				la interfaz, y realiza las peticiones al modelo para pasarlos a la vista
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PrestamoModel;
import pojo.*;

public class PrestamoController {

    private static PrestamoModel prestam = new PrestamoModel();

    public List<Prestamo> crearPrestamo(List<Prestamo> lista, Prestamo prest) {// Agregar
        return prestam.crearPrestamo(lista, prest);
    }

    public Prestamo getPrestamo(List<Prestamo> lista, Prestamo prestamo) {// Buscar
        return prestam.getPrestamo(lista, prestamo);
    }

    public List<Prestamo> eliminarPrestamo(List<Prestamo> lista, Prestamo prestamo) {// Eliminar
        return prestam.eliminarPrestamo(lista, prestamo);
    }

    public void mostrarPrestamo(List<Prestamo> lista, List<Libro> listaLibro, List<Encargado> listaEncargado,
            List<Usuario> listaUsuario, DefaultTableModel modelo) {// Mostrar
        prestam.mostrarPrestamo(lista, listaLibro, listaEncargado, listaUsuario, modelo);
    }

    public List<Prestamo> actualizarPrestamo(List<Prestamo> lista, int id, Prestamo prestamo) {
        return prestam.actualizarPrestamo(lista, id, prestamo);

    }
}
