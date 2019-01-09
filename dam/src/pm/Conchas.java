package pm;
/*
 * @author paufont
 */

import java.util.Scanner;

public class Conchas {
	
	public static void main(String[] args) {

	
	Scanner sc=new Scanner(System.in);
	
	int plats;
	double mejillones, contMejillones,sumaMej,calcular;
	boolean sortir=true;
	
	plats=sc.nextInt();
	
	for (int i=1;i<=plats;i++) {
		
		contMejillones=0;
		sumaMej=0;
		calcular=0;
		
		do {
				mejillones=sc.nextInt();
				
				if(mejillones!=-1) {
					sumaMej=sumaMej+mejillones;
					contMejillones++;
					
				}
				else {
					break;
				}

		}while(sortir);
		
		calcular=sumaMej/contMejillones;
		
		if(calcular==1) {
			
			System.out.println("Justo");
		}
		else if(calcular>1) {
			System.out.println("Suerte");
		}
		else if(calcular<1) {
			System.out.println("Timo");
		}
		
	}
	sc.close();
	}
}

