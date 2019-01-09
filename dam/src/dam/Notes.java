package dam;

import java.util.Scanner;

public class Notes {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int quant;
		double nota [];
		double sumaNotes =0, notaMitja=0;
		
		
		System.out.println("Quantes notes vols entrar? ");
		quant=sc.nextInt();
		
		nota = new double[quant+1];
		
		for(int i=1;i<=quant;i++) {
			
			System.out.print("Entra la nota: ");
			nota [0] = sc.nextDouble();
			
			sumaNotes= nota[0] + sumaNotes;
			
		}
		notaMitja=sumaNotes/quant;
		System.out.println("La nota mitja de la classe es: "+notaMitja );
		sc.close();
	}
	
	
	
}
