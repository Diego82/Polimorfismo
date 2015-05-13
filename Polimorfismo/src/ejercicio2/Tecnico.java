package ejercicio2;

public class Tecnico extends Trabajador {

	private final double PAGA_DIARIA = 200;
	private boolean titulacionSuperior;
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param titulacion
	 */
	public Tecnico(String nombre, String apellido, Boolean titulacionSuperior) {
		super(nombre, apellido);
		this.titulacionSuperior = titulacionSuperior;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}

}
