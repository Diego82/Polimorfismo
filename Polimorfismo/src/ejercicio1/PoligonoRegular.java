package ejercicio1;

public abstract class PoligonoRegular implements Comparable<PoligonoRegular>  {
	protected String nombre;
	protected int numeroLados;
	protected double longitudLado;
	int numeroObjeto = 0;
	
	/**
	 * @param nombre
	 * @param numeroLados
	 * @param longitudLado
	 */
	public PoligonoRegular(String nombre, int numeroLados, double longitudLado) {
		this.nombre = nombre;
		this.numeroLados = numeroLados;
		this.longitudLado = longitudLado;
	}
		
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the numeroLados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * @return the longitudLado
	 */
	public double getLongitudLado() {
		return longitudLado;
	}

	public double getPerimetro(){
		return this.longitudLado*this.numeroLados;
	}
	
	public abstract double getAreaPoligono();
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PoligonoRegular [nombre: " + nombre + ", numeroLados: "
				+ numeroLados + ", longitudLado: " + longitudLado + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(longitudLado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numeroLados;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Double.doubleToLongBits(longitudLado) != Double
				.doubleToLongBits(other.longitudLado))
			return false;
		if (numeroLados != other.numeroLados)
			return false;
		return true;
	}

	public int compareTo(PoligonoRegular p){
		return this.numeroLados-p.numeroLados;
	}
	
}
