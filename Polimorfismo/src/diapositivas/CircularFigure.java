package diapositivas;

public abstract class CircularFigure implements Figure {
	
	protected double semiEjeMenor;
	protected double semiEjeMayor;
		
	/**
	 * @param semiEjeMenor
	 * @param semiEjeMayor
	 */
	public CircularFigure(double semiEjeMenor, double semiEjeMayor) {
		this.semiEjeMenor = semiEjeMenor;
		this.semiEjeMayor = semiEjeMayor;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*numeroPI*Math.sqrt(this.semiEjeMayor*this.semiEjeMayor+this.semiEjeMenor*this.semiEjeMenor);
	}

}
