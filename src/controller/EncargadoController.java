/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y
 * 				la interfaz, y realiza las peticiones al modelo
 * para pasarlos a la vista
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.EncargadoModel;
import pojo.Encargado;

public class EncargadoController {

    private static EncargadoModel encMod = new EncargadoModel();

    /**
     * Método para añadir datos a la lista
     */
    public List<Encargado> crearEncargado(List<Encargado> lista2,
            Encargado encargado) {
        return encMod.crearEncargado(lista2, encargado);
    }

    /**
     * Método para eliminar datos de la lista
     */
    public List<Encargado> eliminarEncargado(List<Encargado> lista2,
            String codTrab) {
        return encMod.eliminarEncargado(lista2, codTrab);
    }

    /**
     * Método para buscar un objeto en la lista
     */
    public Encargado getEncargado(List<Encargado> lista, String CodTrab) {
        return encMod.getEncargado(lista, CodTrab);
    }

    /**
     * Método para actualizar datos de un objeto
     */
    public List<Encargado> actualizarEncargado(List<Encargado> lista,
            Encargado encargado) {
        return encMod.actualizarEncargado(lista, encargado);
    }

    /**
     * Método para mostrar (imprimir) los datos de la lista en una tabla
     */
    public void mostrarEncargado(List<Encargado> lista, DefaultTableModel modelo) {
        encMod.mostrarEncargado(lista, modelo);
    }
}
