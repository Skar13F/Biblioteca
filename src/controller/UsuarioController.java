/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 28 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para responder a las interacciones entre el usuario y 
 * 				la interfaz, y realiza las peticiones al modelo
                                para pasarlos a la vista
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.UsuarioModel;
import pojo.Usuario;

public class UsuarioController {

    private static UsuarioModel userModel = new UsuarioModel();

    public List<Usuario> crearUsuario(List<Usuario> lista, Usuario usuario) {// Agreagar
        return userModel.crearUsuario(lista, usuario);
    }

    public List<Usuario> eliminarUsuario(List<Usuario> lista, String matricula) {// Eliminar
        return userModel.eliminarUsuario(lista, matricula);
    }

    public void mostrarUsuario(List<Usuario> lista, DefaultTableModel modelo) {// Mostrar
        userModel.mostrarUsuario(lista, modelo);
    }

    public Usuario getUsuario(List<Usuario> lista, String matricula) {// Buscar
        return userModel.getUsuario(lista, matricula);
    }

    public List<Usuario> actualizarUsuario(List<Usuario> lista, Usuario usuario) {// Actualizar
        return userModel.actualizarUsuario(lista, usuario);
    }
}
