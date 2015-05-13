package ejercicio3;

public class TestVehiculo {
	public static void main(String[] args) {
		Vehiculo coche = new Coche();
		Vehiculo moto = new Moto();
		
		for (int i = 0; i < 20; i++) {
			int aceleracionMoto = (int) (Math.random()*100);
			int aceleracionCoche = (int) (Math.random()*100);
			int desaceleracionMoto = (int) (Math.random()*100);
			int desaceleracionCoche = (int) (Math.random()*100);
			System.out.println("Acelerando coche a "+aceleracionCoche+"\n"+coche.acelerar(aceleracionCoche));
			System.out.println("Acelerando moto a "+aceleracionMoto+"\n"+moto.acelerar(aceleracionMoto));
			System.out.println("Desacelerando coche a "+desaceleracionCoche+"\n"+coche.frenar(desaceleracionCoche));
			System.out.println("Desacelerando moto a "+desaceleracionMoto+"\n"+moto.frenar(desaceleracionMoto));
			
		}
		
		
	}
}
