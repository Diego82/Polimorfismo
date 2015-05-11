package ejercicio4;

import java.util.Arrays;

public class ArrayReales implements Estadistica {
	
	private double[] valores;
	
	public ArrayReales(int tamano) {
		// TODO Auto-generated constructor stub
		this.valores = new double [tamano];
		for (int i = 0; i < tamano; i++) {
			double valor = Math.random()*100;
			valores[i] = valor;
		}
		//lo ordenamos de forma ascendente 
		//para facilitar la implementacion de los metodos
		//maximo y minimo
		Arrays.sort(valores);
	}
	
	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		if (this.valores.length>0) {
			return this.valores[0];
		}
		else{
			System.out.println("Array vacio");
			return 0;
		}
			
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		if (this.valores.length>0) {
			return this.valores[this.valores.length-1];
		}
		else{
			System.out.println("Array vacio");
			return 0;
		}
	}

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		if (this.valores.length>0) {
			double suma = 0;
			for (int i = 0; i < valores.length; i++) {
				return suma+= valores[i];
			}
		}
		else{
			System.out.println("Array vacio");
			return 0;
		}
	}

}
