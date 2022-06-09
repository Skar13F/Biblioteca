/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 22 de abril de 2022
 * Fecha de actualización: 25 de abril de 2022
 * Descripción: clase para almacenar los datos del usuario (alumno) 
 */
package pojo;

//clase: Entidad abstracta que expresa cualidades
public class Usuario {
	// atributos: conjunto de características que
	// comparten entre objetos creados a partir de la misma clase

	// modificador de acceeso: private, public, static, final
	private String matricula;
	private String nombre;
	private String carrera;
	private String semestre;

	// constructores: Siempre tiene el mismo nombre que la clase,
	// generalmente se usa para inicializar los atributos del objeto
	public Usuario() {

	}

	public Usuario(String matricula, String nombre, String carrera, String semestre) {
		/*
		 * this: hace referencia al objeto actual de la clase. indica que se está
		 * referenciando al atributo global de dicha clase
		 */
		this.matricula = matricula;
		this.nombre = nombre;
		this.carrera = carrera;
		this.semestre = semestre;
	}
	// @PostConstruct: permite inicializar ibjetos al iniciar la aplicación

	/*
	 * métodos: conjunto de instrucciones definidas dentro de una clase y realizan
	 * una determinada tarea
	 */

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}
