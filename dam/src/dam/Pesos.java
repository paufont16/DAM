package dam;
/*
 * @author paufont
 */

import java.util.Arrays;
import java.util.Scanner;

/*
 * Fer un programa que realitzi un histograma amb els pesos dels alumnes d'un determinat curs.
 * El programa ha de comen�ar per demanar el nombre d'alumnes.
 * El n�mero d'asteriscs es correspon amb el n�mero d'alumnes del pes especificat. 
 * El programa que llegir� els pesos i escriur� l'histograma corresponent. 
 * Suposar que els pesos estan compresos entre els valors de 1 i 100 kg. A l'histograma nom�s apareixeran els pesos que corresponen a 1 o m�s alumnes.
 */

public class Pesos {
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
		  int alumnes,freq=0;
		  
		  int pesos[];
         
		  System.out.println("Quants alumnes sou? ");
		  alumnes=sc.nextInt();
		  
		  pesos=new int [alumnes];
		  
		  for(int i=0;i<pesos.length;i++) {//Preguntem els pesos dels alumnes
			  System.out.println("Entra el pes de l'alumne");
			  pesos[i]=sc.nextInt();
		  }
		  
		  for(int i=0;i<pesos.length;i++) {
			 Arrays.sort(pesos);//Ordenem de menor a major
			  for(int j=0;j<pesos.length;j++) {
				  if(pesos[i]==pesos[j]) {//Si els dos n�meros s�n iguals freq s'incrementa en 1
					  freq++;
				  	}
			  }
				
					System.out.print(pesos[i]);//Mostrem el pes i tot seguit tants esteriscos com frequencies hi han
					for(int k=0;k<freq;k++) {
						  System.out.print("*");
				}
				System.out.println();//Fem un salt de l�nia i resetejem el valor de freq per el proxim n�mero
			  i=i+freq;
			  freq=0;
		  }
			  		  
		
		  sc.close();
	}
}
