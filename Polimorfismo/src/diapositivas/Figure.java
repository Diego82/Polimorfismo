package diapositivas;

public interface Figure {
	//definimos una constante
	double numeroPI= 3.1416;
	//comportamiento de los objetos
	double getPerimetro();
	String getNombre();
	//Creamos metodo default posible en JDK 1.8
	default String getTodo(){
		return getPerimetro()+" - "+getNombre();
	}
}
