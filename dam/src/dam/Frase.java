package dam;

import java.util.Scanner;

public class Frase {
/*
 * Feu un programa que un cop l'usuari entri una frase mostri quants car�cters i quantes vocals hi ha.
 * Despr�s ha d'escriure la frase canviant totes les vocals per un asterisc (*) 
 * I per �ltim l'ha d'escriure a l'inrev�s.
 * 
 * Exemple:
 * Hola, avui he dinat llenties.
 * Car�cters: 29
 * Vocals: 11
 * H*l*, *v** h* d*n*t ll*nt**s.
 * .seitnell tanid eh iuva ,aloH
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase,fraseReves,reves="";
		int vocals=0;
		
		System.out.println("Escriu una frase: ");
		frase=sc.nextLine();
		fraseReves=frase;
		
		for(int x=0;x<frase.length();x++) {//Recorra la frase buscant vocals, i cada cop que en trobi una el valor de vocal s'inrementar� en 1
			  if ((frase.charAt(x)=='a') || (frase.charAt(x)=='e') || (frase.charAt(x)=='i') || (frase.charAt(x)=='o') || (frase.charAt(x)=='u')){
			    vocals++;
			  }
			}
		
		System.out.println("Car�cters: "+frase.length());
		System.out.println("Vocals: "+vocals);
		
		
		
		frase=frase.replace('a', '*').replace('e', '*').replace('i', '*').replace('o', '*').replace('u', '*');//Cada cop que trobi una vocal a la frase la cambiar� per un *
		System.out.println(frase);
		
		
		for (int x=fraseReves.length()-1;x>=0;x--) {//la x ser� el n�mero total de car�cters i s'anir� decrementant en 1
			reves = reves + fraseReves.charAt(x);//Anem guardant el car�cters a la variable reves
		}
		
		System.out.println(reves);
		
		sc.close();
	}

}
