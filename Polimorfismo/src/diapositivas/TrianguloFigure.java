package diapositivas;

public abstract class TrianguloFigure implements Figure {
	
	protected double lado1, lado2, lado3;
		
	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public TrianguloFigure(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double getPerimetro() {
		return lado1+lado2+lado3;
	}
}
