package diapositivas;

public class TestFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura circulo = new Circulo("amarillo", 10);
		System.out.println(datosFigura(circulo));
		Figura cuadrado = new Cuadrado("verde", 4);
		System.out.println(datosFigura(cuadrado));
	}
	public static String datosFigura(Figura f){
		return f+" y su area es "+f.getArea();
	}
}
class Figura{
	private String color;

	/**
	 * @param color
	 */
	public Figura(String color) {
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	public double getArea(){
		return 0;
	}
}

class Circulo extends Figura {
	private double radio;

	/**
	 * @param color
	 * @param radio
	 */
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "color: "+getColor()+ "]";
	}

	/* (non-Javadoc)
	 * @see diapositivas.Figura#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

}
class Cuadrilatero extends Figura {
	private double lado1;
	private double lado2;
	
	/**
	 * @param color
	 * @param lado1
	 * @param lado2
	
	 */
	public Cuadrilatero(String color, double lado1, double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuadrilatero [lado1=" + lado1 + ", lado2=" + lado2 + ", getColor()=" + getColor()+ "]";
	}
	public double getArea(){
		return this.lado1*this.lado2;
	}
}

class Cuadrado extends Cuadrilatero{

	/**
	 * @param color
	 * @param lado
	 */
	public Cuadrado(String color, double lado) {
		super(color, lado, lado);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuadrado: " + super.toString() + "]";
	}
}


