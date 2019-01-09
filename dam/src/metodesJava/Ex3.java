package metodesJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
	
	public static int repeticions=10;
	public static int taula [][] = new int [2][10];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		
		for (int i=0;i<repeticions;i++) {//Preguntem 10 cops els números
			System.out.println("Entra un número per la taula 1");
			taula[0][i] = Integer.parseInt(br.readLine());
			System.out.println("Entra un número per la taula 2");
			taula[1][i] = Integer.parseInt(br.readLine());
			
		}
		
		mostrarTaula();//Ensenya el metode de mostrarTaula
		System.out.println("");
		intercanviarValors();//Ensenya el metode d' intercanviarValors

	}
	
	public static void mostrarTaula() {
		
		for (int i=0;i<repeticions;i++) {//Ensenyem 10 cops els valors entrats
				
				System.out.println("| "+taula[0][i]+" "+taula[1][i]+"| ");
						
			}
		
		
	}
	
	public static void intercanviarValors() {//Ensenyem 10 cops els valors entrats al reves
		
		for (int i=0;i<repeticions;i++) {
			
			System.out.println("| "+taula[1][i]+" "+taula[0][i]+"| ");
			
		}
		
	}
}
