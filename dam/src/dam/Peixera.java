package dam;
/*
 * @author paufont
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Peixera {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Declarem variables
		int amplada, altura , profunditat , volum , escalat, random;
		char peixos , pregunta,loteria;
		String peix="><)º> ";
		
		
		
		do {
			try {//Provarà el programa per si troba algun error
			
		//Demanem valors al usuari
		System.out.println("Entra l'amplada: ");
		amplada=sc.nextInt();
		
		System.out.println("Entra l'altura :");
		altura=sc.nextInt();
		
		System.out.println("Entra la profunditat :");
		profunditat=sc.nextInt();
		
		System.out.println("Escalat: ");
		escalat=sc.nextInt();
		
		if(escalat>0) {//Si escalat es més gran que 0 continuarà sino tornarà a preguntar el valor
			amplada=amplada*escalat;//Multipliquem els valors per l'escalat
			altura=altura*escalat;
			profunditat=profunditat*escalat;
			}
			else {
				System.out.println("No pots entrar el valor 0, torna-ho a provar: ");
				escalat=sc.nextInt();
			}
		
		System.out.println("Desitja peixos? ");
		peixos=sc.next().charAt(0);
		
		
		
		
		
		//Si a la pregunta dels peixos la primera lletra es s farà el programa amb peixos adins, sino el farà sense
		if(peixos=='s'||peixos=='S') {
		
		for(int i=1;i<=altura;i++) {
			for(int j=1;j<=amplada;j++) {
				
				if(j==1 || j==amplada) {//Dibuixarà el símbol als extrems de la peixera
					
					System.out.printf("\u007c");
				}
				else {
					
					System.out.print(peix);//Dibuixarà un peix adins la peixera
				}
				
			}
			System.out.println();//Salt de línia
		}
		
		
		for(int i=1;i<=amplada;i++) { //Dibuixarà tants = com amplada tingui la peixera
			System.out.print("\u003d");
			}
		}
		
		else {
			for(int i=1;i<=altura;i++) {
				for(int j=1;j<=amplada;j++) {
					
					if(j==1 || j==amplada) {
						
						System.out.printf("\u007c");
					}
					else {
						
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			
			
			for(int i=1;i<=amplada;i++) {
				System.out.print("\u003d");
				}
		}
		
		if(amplada==altura&&amplada==profunditat&&profunditat==altura) {
			System.out.println("\nLa peixera té forma de cub");
		}
		else {
			System.out.println("\nLa peixera té forma de prisme rectangular");
		}
		
		volum=(amplada*profunditat)*altura;//Calculem el volum
		
		System.out.println("El volum d'aigua màxima es de "+volum);
		
		
		}
		catch (InputMismatchException error) {
			
			System.out.println("Error, entra un número");//Si entra una lletra saltarà aquest error
			sc.nextLine();
		}
			System.out.println("Vols continuar? ");
			pregunta=sc.next().charAt(0);
			
		}
		while(pregunta=='s'||pregunta=='S');//En cas de que la primera lletra sigui s repetirà el programa, en cas contrari preguntarà per la loteria
		
		System.out.println("Vols comprar un número de loteria? ");
		loteria=sc.next().charAt(0);
		
		Random y = new Random();
		random = y.nextInt(999)+1;//Donem el rang de valors
		
		if(loteria=='s'||loteria=='S') {//Si la primera lletra es una s mostrarà un número aleatori, sempre de 3 xifres
			
			System.out.printf("**********************************************************\n"
					+ "HE SOMIAT QUE EL NÚMERO DEL TRIO SERÀ EL: %03d \n"
					+ "**********************************************************\n"
					+ "GRÀCIES PER UTILITZAR Peixera0.1\r\n" + 
					"Un programa de © Pau Font",random);
		}
		sc.close();
	}
}

