package pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paraules {
	
	private static String frase , fraseReves="";
	private static int paraules , caracters, vocals;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Escriu la frase: ");
		frase=br.readLine();
		
		System.out.println("La frase escrita té : \n"+contarCaracters(frase)+" caràcters\n"
						   +contarParaules(frase)+" paraules\n"
						   +contarVocals(frase)+" vocals\n"
						   +fraseAlReves(frase));
	} 
	
	public static int contarCaracters (String frase) {
		
		caracters=frase.length();
		
		return caracters;
		
	}
	
	public static int contarParaules (String frase){
		
		paraules=frase.split(" ").length;
		
		return paraules;
		
	}
	
	public static int contarVocals (String frase){
		
		vocals = frase.replaceAll("[^AEIOUaeiouÀÈÌÒÙÁÉÍÓÚàèìòùáéíóú]","").length();
		
		return vocals;
		
	}
	
	
	public static String fraseAlReves (String frase){
		

		for (int x=frase.length()-1;x>=0;x--) {//la x serà el número total de caràcters i s'anirà decrementant en 1
			fraseReves = fraseReves + frase.charAt(x);//Anem guardant el caràcters a la variable reves
		}
		
		return fraseReves;
		
	}

}
