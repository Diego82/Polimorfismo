package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class EjemploInstanceOf {
	private static List<Persona> lista = new ArrayList<Persona>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Profesor("diego", 23, "matematicas");
		Persona p2 = new Profesor("david", 33, "lengua");
		Persona p3 = new Alumno("Pedro", 34, "mate");
		Persona p4 = new Alumno("Oscar", 54, "ingles");
		Persona p5 = new Persona("Gabriel", 54);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4+"\n"+p5);
		System.out.println(p1.getEdad()+"\n"+p2.getEdad()+"\n"+p3.getEdad()+"\n"+p4.getEdad()+"\n");
		System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4+"\n");
		System.out.println("Imprimo los profesores si son mayores o no");
		for (Persona persona : lista) {
			if (persona instanceof Profesor) {
				System.out.println(((Profesor)persona).getMayorEdad());
			}
			System.out.println(persona.getEdad());
		}
	}

}
class Persona{
	private String nombre;
	private int edad;
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
}

class Profesor extends Persona{
	private String asignatura;

	/**
	 * @param nombre
	 * @param edad
	 * @param asignatura
	 */
	public Profesor(String nombre, int edad, String asignatura) {
		super(nombre, edad);
		this.asignatura = asignatura;
	}
	
	public boolean getMayorEdad(){
		return getEdad()>17;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", nombre: "
				+ getNombre() + ", Edad: " + getEdad() + "]";
	}	
}

class Alumno extends Persona{
	private String curso;

	/**
	 * @param nombre
	 * @param edad
	 * @param curso
	 */
	public Alumno(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}
	
	public boolean getMayorEdad(){
		return getEdad()>17;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + "]";
	}
	
}