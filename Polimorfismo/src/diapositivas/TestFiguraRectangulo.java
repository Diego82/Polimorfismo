package diapositivas;

public class TestFiguraRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraGeometricas f1 = new FiguraCirculo(5);
		FiguraGeometricas f2 = new FiguraCuadrado(8);
		FiguraGeometricas f3 = new FiguraRectangulo(3, 7);
		System.out.println(f1.getArea());
		System.out.println(f2.getArea());
		System.out.println(f3.getArea());
	}	

}
