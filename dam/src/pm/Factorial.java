package pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("El factorial es: "+mostraFactorial());
		
		

	}
	
	public static int mostraFactorial () throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int fact,factTotal=0;
		
		System.out.println("Entra un número: ");
		fact=Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=fact;i++) {
			
			factTotal=i*i;
			
		}
		return factTotal;
		
	}

}
