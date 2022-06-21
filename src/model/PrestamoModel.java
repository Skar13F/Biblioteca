/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 17 de junio de 2022
 * Descripción: clase para modelar las operaciones CRUD de la clase préstamo 
 */
package model;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import pojo.*;

public class PrestamoModel {
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    // Método para agregar objetos a la lista Préstamo
    public List<Prestamo> crearPrestamo(List<Prestamo> lista, Prestamo prest) {
        prest.setId(lista.size() + 1);//agregamos un id dinámico al objeto
        lista.add(prest);
        return lista;

    }

    // Método para eliminar un objeto préstamo de la lista
    public List<Prestamo> eliminarPrestamo(List<Prestamo> lista,
            Prestamo prestamo) {
        for (Prestamo prestam : lista) {
            //validamos la existencia del objeto a eliminar
            if (prestam.getFechaSol().equals(prestamo.getFechaSol())
                    && prestam.getFechaEnt().equals(prestamo.getFechaEnt())
                    && prestam.getCodTrab().equals(prestamo.getCodTrab())
                    && prestam.getMatricula().equals(prestamo.getMatricula())) {
                lista.remove(prestam);
                return lista;
            }
        }
        return lista;
    }

    //Método para buscar un objeto en la lista, retorna nulo si no lo encuentra
    public Prestamo getPrestamo(List<Prestamo> lista, Prestamo prestamo) {
        Prestamo prestamo1 = null;
        for (Prestamo prestam : lista) {
            if (prestam.getFechaSol().equals(prestamo.getFechaSol())
                    && prestam.getFechaEnt().equals(prestamo.getFechaEnt())
                    && prestam.getCodTrab().equals(prestamo.getCodTrab())
                    && prestam.getMatricula().equals(prestamo.getMatricula())) {
                return prestam;
            }
        }
        return prestamo1;
    }

    // Método para actualizar datos de un  objeto en la lista
    public List<Prestamo> actualizarPrestamo(List<Prestamo> lista, int id,
            Prestamo prestamo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.set(i, prestamo);
            }
        }
        return lista;
    }

    // Método para mostrar el contenido de la lista en una tabla
    public void mostrarPrestamo(List<Prestamo> lista, List<Libro> listaLibro,
            List<Encargado> listaEncargado, List<Usuario> listaUsuario,
            DefaultTableModel modelo) {
        modelo.setRowCount(0);//resetea la tabla
        String isbn = "";
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setId(i + 1);
            isbn = "";
            //Objeto fila para obtener los datos se mostrará
            Object[] fila = new Object[6];
            fila[0] = lista.get(i).getId();
            fila[1] = formatter.format(lista.get(i).getFechaSol());
            fila[2] = formatter.format(lista.get(i).getFechaEnt());
            fila[3] = lista.get(i).getMatricula();
            fila[4] = lista.get(i).getCodTrab();
            fila[5] = lista.get(i).getNombres();
            modelo.addRow(fila);//Añadimos la fila a la tabla
        }

    }
}
