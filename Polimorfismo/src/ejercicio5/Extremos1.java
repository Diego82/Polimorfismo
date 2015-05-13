package ejercicio5;

import java.util.Arrays;

public interface Extremos1 {
	
	static int min(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[0];
	}

	
	static int max(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[a.length-1];
	}

	
	static double min(double[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[0];
	}

	
	static double max(double[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[a.length-1];
	}
}
