package ejercicio3;

public class Moto implements Vehiculo {

private int velocidad = 0;
	
	public int numeroPlazas(){
		return 2; 
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		this.velocidad+=velocidad;
		String mensaje = "Moto con velocidad actual de "+this.velocidad;
		if (this.velocidad>VELOCIDAD_MAXIMA) {
			mensaje += " y has superado la velocidad maxima";
		}
		return mensaje;
	}

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		this.velocidad-=velocidad;
		if (this.velocidad<0) {
			this.velocidad=0;
		}
		
		String mensaje = "Moto con velocidad actual de "+this.velocidad;
		if (this.velocidad > VELOCIDAD_MAXIMA) {
			mensaje += " y sigues superando la velocidad maxima";
		}
		return mensaje;
	}
}
