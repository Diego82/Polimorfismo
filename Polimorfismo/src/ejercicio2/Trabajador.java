package ejercicio2;

public abstract class Trabajador {
	private String nombre, apellido;

	/**
	 * @param nombre
	 * @param apellido
	 */
	public Trabajador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	protected String nombreApellidos(){
		return "Trabajador: "+this.apellido+", "+this.nombre;
	}
	public abstract double sueldoMensual(int diasTrabajados);
}
