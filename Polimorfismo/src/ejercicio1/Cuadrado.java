package ejercicio1;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(double longitudLado) {
		super("Cuadrado", 4, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAreaPoligono() {
		// TODO Auto-generated method stub
		return Math.pow(longitudLado, 2);
	}

}
