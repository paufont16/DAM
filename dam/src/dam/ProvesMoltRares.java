package dam;

import java.util.Scanner;

public class ProvesMoltRares {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		String x;
		String coord1,coord2;
		String lletres =" abcde";
		String numeros ="012345";
		
		System.out.println("Escriu les coordenades");
		x=sc.nextLine();
		
		

		coord1=x.substring(0,1); //agafa el primer caràcter de les coordenades entrades anteriorment i el guarda a coord1
		coord2=x.substring(1,2); //agafa el segon i el guarda a coord2
		
		
		
		/*char tauler[][]=new char [5][5];
		
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				tauler [i][j]='-';
				}
		}
		
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(tauler [i][j]+" ");
				}
			System.out.println("");
		}*/
		
		

		System.out.print(numeros.indexOf(coord1));//mira a quina posició està en la variable numeros
		System.out.println(lletres.indexOf(coord2));
		
		
	}

}
