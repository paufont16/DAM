package aceptaelreto;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int nCasos, s, a ,b;
		int max;
		int resultat;
		int abc;
		nCasos= sc.nextInt();
		
		for(int i=0; i<nCasos; i++) {
			s=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			if(s>=0 && s<=10000 && a>=0 && s<=10000 && a>=0 && s<=10000) {
				if(a>b) max=a;
				else max=b;
				
				resultat=s-a;
				abc=resultat-b;
				
				
				
				System.out.printf("%d", abc);
			}
		}
		sc.close();

	}

}