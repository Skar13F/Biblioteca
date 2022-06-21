/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 25 de abril de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase para modelar los prestamos de libro
 */
package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {

    private int id;
    private Date fechaSol;
    private Date fechaEnt;
    private List<String> nombres = new ArrayList<>();
    private String matricula;
    private String codTrab;

    public Prestamo() {//constructor vacío
    }

    public Prestamo(int id, Date fechaSol, Date fechaEnt,
            List<String> nombres, String matricula, String codTrab,
            String isbn) {//constructor para inicializar atributos de la clase
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

    public Date getFechaSol() {
        return fechaSol;
    }

    public void setFechaSol(Date fechaSol) {
        this.fechaSol = fechaSol;
    }

    public Date getFechaEnt() {
        return fechaEnt;
    }

    public void setFechaEnt(Date fechaEnt) {
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
