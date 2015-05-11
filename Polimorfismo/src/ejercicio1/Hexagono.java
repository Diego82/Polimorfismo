package ejercicio1;

public class Hexagono extends PoligonoRegular {

	public Hexagono(double longitudLado) {
		super("Hexagono", 6, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAreaPoligono() {
		// TODO Auto-generated method stub
		return (this.getPerimetro()*Math.sqrt(Math.pow(longitudLado, 2))-Math.pow((longitudLado/2), 2))/2;
	}

}
