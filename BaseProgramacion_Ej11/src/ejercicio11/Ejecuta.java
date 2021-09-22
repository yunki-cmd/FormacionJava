package ejercicio11;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		/*
		 * Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
como nombre de alumno “fin”. En ese momento mostrará la edad media de los alumnos y
el nombre del alumno menor. NOTA: Al introducir como nombre “fin”, no nos ha de pedir el
año de nacimiento.
		 * 
		 * */
	int año_actual = 2021;
	double mediaAcu = 0;
	String nombre;
	String nombre_menor="";
	int menor = Integer.MAX_VALUE;
	int añoNacimiento;
	boolean salir = false;
	int contador = 0;
	Scanner input = new Scanner(System.in);
	while(!salir) {
		System.out.println("introduzca su nombre");
		nombre = input.nextLine();
		if(nombre.equalsIgnoreCase("fin"))salir=true;
		if(!salir) {			
			System.out.println("intorduzca su año de nacimiento "
					+ "ejemplo : 2000");
			añoNacimiento = Integer.parseInt(input.nextLine());
			mediaAcu = (double) mediaAcu + (año_actual-añoNacimiento);
			contador++;
			if( (año_actual- añoNacimiento) < menor) {
				menor = año_actual- añoNacimiento;
				nombre_menor = nombre;
			}
		}
		
		
	}
	if(contador > 0) {		
		System.out.println("la media de edad es: "+
				mediaAcu/contador+" y el menor de todos es: "+
				nombre_menor.toUpperCase()+" con "+ menor
				);
	}
	input.close();
	//otro fin desde github
	}

}
