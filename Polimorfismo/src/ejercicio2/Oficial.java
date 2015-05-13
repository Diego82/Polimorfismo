package ejercicio2;

public class Oficial extends Trabajador {
	//Atributos	
	private final double PAGA_DIARIA = 100;
	private String clase;
	
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param clase
	 */
	public Oficial(String nombre, String apellido, String clase) {
		super(nombre, apellido);
		this.clase=clase;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}

	@Override
	public double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}

	

	
	
}
