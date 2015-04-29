package diapositivas;

public abstract class FiguraGeometricas {
	private String nombre;

	/**
	 * @param nombre
	 */
	public FiguraGeometricas(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FiguraGeometricas [nombre=" + nombre + "]";
	}
	public abstract double getArea();
}
class FiguraCirculo extends FiguraGeometricas{
	private double radio;

	/**
	 * @param nombre
	 * @param radio
	 */
	public FiguraCirculo(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(radio, 2)*Math.PI;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", nombre: " + getNombre() + "]";
	}
	
}
abstract class FiguraCuadrilatero extends FiguraGeometricas{
	private double lado1;
	private double lado2;
	/**
	 * @param nombre
	 * @param lado1
	 * @param lado2
	 */
	public FiguraCuadrilatero(String nombre, double lado1, double lado2) {
		super(nombre);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}
	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}
	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
}
class FiguraCuadrado extends FiguraCuadrilatero{
	
	/**
	 * @param nombre
	 * @param lado
	 */
	public FiguraCuadrado(double lado) {
		super("Cuadrado", lado, lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(getLado1(), 2);
	}
}
class FiguraRectangulo extends FiguraCuadrilatero{

	public FiguraRectangulo(double base, double altura) {
		super("Rectangulo",base,altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getLado1()*getLado2();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangulo [getArea()=" + getArea() + ", getLado1()="
				+ getLado1() + ", getLado2()=" + getLado2() + ", getNombre()="
				+ getNombre() + "]";
	}	
}