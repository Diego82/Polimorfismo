package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TestTrabajador {
	public static void main(String[] args) {
		Trabajador t1 = new Oficial("Pedro", "Garcia", "Oficial de primera");
		Trabajador t2 = new Oficial("Diego", "Martin", "Oficial de segunda");
		Trabajador t3 = new Tecnico("Elisa", "Torres", true);
		Trabajador t4 = new Tecnico("Maria", "Perez", false);
		
		List<Trabajador> lista = new ArrayList<Trabajador>();
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);
		lista.add(t4);
		
		double sueldoTotal=0;
		for (Trabajador trabajador : lista) {
			System.out.println(trabajador.nombreApellidos());
			sueldoTotal += trabajador.sueldoMensual(10);
			if (trabajador instanceof Oficial) {
				System.out.println("Oficial: "+((Oficial) trabajador).getClase());
			}
			System.out.println("Sueldo del trabajador: "+trabajador.sueldoMensual(10));
		}
		System.out.println("Sueldo a pagar a todos los trabajadores"+sueldoTotal);
	}
}
