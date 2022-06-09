/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para modelar los prestamos de libro
 */
package pojo;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {

    private int id;
    private String fechaSol;
    private String fechaEnt;
    private List<String> nombres = new ArrayList<>();
    private String matricula;
    private String codTrab;

    public Prestamo() {
    }

    public Prestamo(int id, String fechaSol, String fechaEnt,
            List<String> nombres, String matricula, String codTrab,
            String isbn) {
        super();
        this.id = id;
        this.fechaSol = fechaSol;
        this.fechaEnt = fechaEnt;
        this.nombres = nombres;
        this.matricula = matricula;
        this.codTrab = codTrab;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaSol() {
        return fechaSol;
    }

    public void setFechaSol(String fechaSol) {
        this.fechaSol = fechaSol;
    }

    public String getFechaEnt() {
        return fechaEnt;
    }

    public void setFechaEnt(String fechaEnt) {
        this.fechaEnt = fechaEnt;
    }

    public List<String> getNombres() {
        return nombres;
    }

    public void setNombres(List<String> nombres) {
        this.nombres = nombres;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCodTrab() {
        return codTrab;
    }

    public void setCodTrab(String codTrab) {
        this.codTrab = codTrab;
    }

}
