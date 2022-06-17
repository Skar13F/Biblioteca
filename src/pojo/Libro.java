/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 22 de abril de 2022
 * Fecha de actualización: 06 de junio de 2022
 * Descripción: clase para almacenar los datos de un libro
 */
package pojo;

public class Libro {

    private String isbn;
    private String autor;
    private String titulo;
    private short cantidad;
    private String clasificacion;

    public Libro() {//constructor vacío
    }

    public Libro(String isbn, String autor, String titulo, short cantidad,
            String clasificacion) {//constructor para inicializar atributos
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

}
