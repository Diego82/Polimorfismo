package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class TestFigure {
	public static void main(String[] args) {
		Figure f1 = new TrianguloEquilateroFigure(5);
		Figure f2 = new TrianguloIsosceles(3,5);
		Figure f3 = new ElipseFigure(4, 6);
		Figure f4 = new CircunferenciaFigure(5);
		
		List<Figure> listado = new ArrayList<Figure>();
		listado.add(f1);
		listado.add(f2);
		listado.add(f3);
		listado.add(f4);
		for (Figure figure : listado) {
			System.out.println(figure.getNombre()+" - "+figure.getPerimetro());
			System.out.println("--------------");
			System.out.println(figure.getTodo());
		}
		
		//¿Se pueden crear objetos de tipo figure? No
		//Figure f5 = new Figure();
		
		//Y de CircularFigure?
		//CircularFigure f5 = new CircularFigure(); mismo caso anterior
	}
}
