package ejercicio1;

public class TrianguloEquilatero extends PoligonoRegular {

	
	public TrianguloEquilatero(double longitudLado) {
		super("Triangulo equilatero", 3, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAreaPoligono() {
		// TODO Auto-generated method stub
		return Math.sqrt(3)*Math.pow(longitudLado, 2)/4;
	}

}
