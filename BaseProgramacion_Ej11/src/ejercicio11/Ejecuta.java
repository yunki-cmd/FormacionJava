package ejercicio11;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		/*
		 * Programa que lee nombre y a�o de nacimiento de una serie de alumnos hasta introducir
como nombre de alumno �fin�. En ese momento mostrar� la edad media de los alumnos y
el nombre del alumno menor. NOTA: Al introducir como nombre �fin�, no nos ha de pedir el
a�o de nacimiento.
		 * 
		 * */
	int a�o_actual = 2021;
	double mediaAcu = 0;
	String nombre;
	String nombre_menor="";
	int menor = Integer.MAX_VALUE;
	int a�oNacimiento;
	boolean salir = false;
	int contador = 0;
	Scanner input = new Scanner(System.in);
	while(!salir) {
		System.out.println("introduzca su nombre");
		nombre = input.nextLine();
		if(nombre.equalsIgnoreCase("fin"))salir=true;
		if(!salir) {			
			System.out.println("intorduzca su a�o de nacimiento "
					+ "ejemplo : 2000");
			a�oNacimiento = Integer.parseInt(input.nextLine());
			mediaAcu = (double) mediaAcu + (a�o_actual-a�oNacimiento);
			contador++;
			if( (a�o_actual- a�oNacimiento) < menor) {
				menor = a�o_actual- a�oNacimiento;
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
	//otro fin
	}

}
