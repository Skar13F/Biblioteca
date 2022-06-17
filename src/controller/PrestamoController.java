/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 08 de junio de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y 
 * 				la interfaz, y realiza las peticiones al modelo
                                para pasarlos a la vista
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PrestamoModel;
import pojo.*;

public class PrestamoController {

    private static PrestamoModel prestam = new PrestamoModel();

    // Método para añadir datos a la lista
    public List<Prestamo> crearPrestamo(List<Prestamo> lista, Prestamo prest) {
        return prestam.crearPrestamo(lista, prest);
    }

    // Método para eliminar datos de la lista
    public List<Prestamo> eliminarPrestamo(List<Prestamo> lista,
            Prestamo prestamo) {
        return prestam.eliminarPrestamo(lista, prestamo);
    }

    //Método para buscar un objeto en la lista
    public Prestamo getPrestamo(List<Prestamo> lista, Prestamo prestamo) {
        return prestam.getPrestamo(lista, prestamo);
    }

    //Método para actualizar datos de un objeto
    public List<Prestamo> actualizarPrestamo(List<Prestamo> lista, int id,
            Prestamo prestamo) {
        return prestam.actualizarPrestamo(lista, id, prestamo);
    }

    //Método para mostrar (imprimir) los datos de la lista en una tabla
    public void mostrarPrestamo(List<Prestamo> lista, List<Libro> listaLibro,
            List<Encargado> listaEncargado, List<Usuario> listaUsuario,
            DefaultTableModel modelo) {
        prestam.mostrarPrestamo(lista, listaLibro, listaEncargado, listaUsuario,
                modelo);
    }
}
