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
import model.UsuarioModel;
import pojo.Usuario;

public class UsuarioController {

    private static UsuarioModel userModel = new UsuarioModel();

    /**
     * Método para añadir datos a la lista
     */
    public List<Usuario> crearUsuario(List<Usuario> lista, Usuario usuario) {
        return userModel.crearUsuario(lista, usuario);
    }

    /**
     * Método para eliminar datos de la lista
     */
    public List<Usuario> eliminarUsuario(List<Usuario> lista,
            String matricula) {
        return userModel.eliminarUsuario(lista, matricula);
    }

    /**
     * Método para buscar un objeto en la lista
     */
    public Usuario getUsuario(List<Usuario> lista, String matricula) {
        return userModel.getUsuario(lista, matricula);
    }

    /**
     * Método para actualizar datos de un objeto
     */
    public List<Usuario> actualizarUsuario(List<Usuario> lista,
            Usuario usuario) {
        return userModel.actualizarUsuario(lista, usuario);
    }

    /**
     * Método para mostrar (imprimir) los datos de la lista en una tabla
     */
    public void mostrarUsuario(List<Usuario> lista,
            DefaultTableModel modelo) {
        userModel.mostrarUsuario(lista, modelo);
    }
}
