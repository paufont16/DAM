package metodesJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {
	public static int fact , factTotal=1;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Entra un número: ");
		fact=Integer.parseInt(br.readLine());
		
		System.out.println("El factorial es: "+mostraFactorial());

	}
	
	public static int mostraFactorial () throws IOException {

		for(int i=fact ; i>0;i--) {
			
			factTotal=factTotal*i;
			
		}
		return factTotal;
		
	}

}