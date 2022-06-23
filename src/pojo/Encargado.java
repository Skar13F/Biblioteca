/**
 * Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 22 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para modelar al encargado de la biblioteca
 */
package pojo;

public class Encargado {

    private String codTrab;
    private String nombre;
    private String telefono;

    /**
     * Constructor vacío
     */
    public Encargado() {

    }

    /**
     * Constructor para inicializar atributos de la clase
     */
    public Encargado(String codTrab, String nombre, String telefono) {
        this.codTrab = codTrab;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Métodos set y get de los atributos
     */
    public String getCodTrab() {
        return codTrab;
    }

    public void setCodTrab(String codTrab) {
        this.codTrab = codTrab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
