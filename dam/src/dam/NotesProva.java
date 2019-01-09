package dam;


import java.util.Scanner;

public class NotesProva {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int quantNotes , alumne;
		double nota [];
		double sumaNotes =0, notaMitja=0 ,max ;
		
		System.out.println("Quants alumnes sou: ");
		alumne=sc.nextInt();
		
		System.out.println("Quantes notes vols entrar? ");
		quantNotes=sc.nextInt();
	
		nota = new double[quantNotes+1];
	
		for(int i=1;i<=alumne;i++) {	
			
			System.out.println("Alumne "+i);
			
			for(int j=1;j<=quantNotes;j++) {
				
				
				System.out.print("Entra la nota: ");
				nota [0] = sc.nextDouble();
				
				if(nota [0]>10) {
					System.out.println("Has d'entrar un número inferior a 10, torna a provar: ");
					nota [0] = sc.nextDouble();
				}
				sumaNotes= nota[0] + sumaNotes;
			}
			
			
		}
		
		max=nota[0];
		
		for(int i=0;i<nota.length;i++) {
			
			if(nota[i]>max) {
				
				max=nota[i];
			}
			
		}
	
		System.out.println("La nota més alta és "+max);
		notaMitja=sumaNotes/(quantNotes*alumne);
		System.out.println("La nota mitja de la classe es: "+notaMitja );
		sc.close();
		
	}
	
}
