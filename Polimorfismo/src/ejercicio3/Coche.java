package ejercicio3;

public class Coche implements Vehiculo {

	private int velocidad = 0;
	
	public int numeroPlazas(){
		return 4; 
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		this.velocidad+=velocidad;
		String mensaje = "coche con velocidad actual de "+this.velocidad;
		if ((this.velocidad+velocidad)>VELOCIDAD_MAXIMA) {
			mensaje += " y has superado la velocidad maxima";
		}
		
		return mensaje;
	}

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		
		if (this.velocidad-velocidad<0) {
			this.velocidad=0;
		}
		else
			this.velocidad-=velocidad;
		
		String mensaje = "coche con velocidad actual de "+this.velocidad;
		if (this.velocidad > VELOCIDAD_MAXIMA) {
			mensaje += " sigues superando la velocidad maxima";
		}
		return mensaje;
	}

}
