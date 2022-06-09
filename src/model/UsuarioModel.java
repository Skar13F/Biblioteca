/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 06 de junio de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase Usuario
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import pojo.Usuario;

public class UsuarioModel {

    public List<Usuario> crearUsuario(List<Usuario> lista, Usuario usuario) {
        // Agregamos objetos a la lista
        lista.add(usuario);
        return lista;
    }

    public List<Usuario> eliminarUsuario(List<Usuario> lista,
            String matricula) {// Buscamos y eliminamos un objeto
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getMatricula().compareTo(matricula) == 0) {
                lista.remove(i);
                break;
            }
        }
        return lista;
    }

    public void mostrarUsuario(List<Usuario> lista, DefaultTableModel modelo) {
        // Imprimimos el contenido de la lista
        modelo.setRowCount(0);//resetea la tabla
        for (int i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[4];
            fila[0] = lista.get(i).getMatricula();
            fila[1] = lista.get(i).getNombre();
            fila[2] = lista.get(i).getCarrera();
            fila[3] = lista.get(i).getSemestre();
            modelo.addRow(fila);
        }
    }

    public Usuario getUsuario(List<Usuario> lista, String matricula) {
        // Buscamos un objeto a través de la matrícula
        Usuario vacio = null;
        for (Usuario usuario : lista) {
            if (matricula.compareTo(usuario.getMatricula()) == 0) {
                return usuario;
            }
        }
        return vacio;
    }

    // Actualizamos los datos de un objeto
    public List<Usuario> actualizarUsuario(List<Usuario> lista,
            Usuario usuario) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getMatricula().compareTo(
                    usuario.getMatricula()) == 0) {
                lista.set(i, usuario);
                break;
            }
        }
        return lista;
    }
}
