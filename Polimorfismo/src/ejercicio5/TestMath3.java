package ejercicio5;

public class TestMath3 {
	public static void main(String[] args) {
		int[] numerosEnteros = {1,2,3,3,4,34,2,234,34,1,2,35,5123};
		double[] numerosReales = {1,2,3,3,4,34,2,234,34,1,2,35,5123};
		Math3 m = new Math3();
		System.out.println(m.min(numerosReales));
		System.out.println(m.max(numerosReales));
		System.out.println(m.min(numerosEnteros));
		System.out.println(m.max(numerosEnteros));
		System.out.println("--------------------");
		System.out.println(Extremos1.min(numerosReales));
		System.out.println(Extremos1.max(numerosReales));
		System.out.println(Extremos1.min(numerosEnteros));
		System.out.println(Extremos1.max(numerosEnteros));
	}
}
