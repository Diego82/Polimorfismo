package ejercicio3;

public interface Vehiculo {
	//Todo atributo de una interfaz es static y final
	//No necesita indicarlo
	int VELOCIDAD_MAXIMA = 120;
	
	//Cualquier metodo es publico y no necesita indicarse
	String acelerar(int velocidad);
	String frenar(int velocidad);
	
	
	
}
