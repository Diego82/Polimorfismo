package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un triangulo regular
		PoligonoRegular t = new TrianguloEquilatero(5);
		PoligonoRegular c = new Cuadrado(2);
		PoligonoRegular h = new Hexagono(8);
		List<PoligonoRegular> lista = new ArrayList<PoligonoRegular>();
		lista.add(t);
		lista.add(c);
		lista.add(h);
		for (PoligonoRegular poligonoRegular : lista) {
			System.out.println(poligonoRegular+"\nArea: "+poligonoRegular.getAreaPoligono()+" - Perimetro: "+poligonoRegular.getPerimetro());
		}
		
		PoligonoRegular t1 = new TrianguloEquilatero(7);
		PoligonoRegular t2 = new TrianguloEquilatero(7);
		PoligonoRegular t3 = new TrianguloEquilatero(8);
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);
		for (PoligonoRegular poligonoRegular : lista) {
			if (poligonoRegular.equals(lista.get(0))) {
				System.out.println("Poligono Regular es igual a "+lista.get(0));
			}
		}
		
		
	}

}
