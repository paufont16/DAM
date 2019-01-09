package dam;
/*
 * @author paufont
 */
import java.util.Scanner;

public class Temperatures {
public static void main(String[] args) {
		/*
		 * Creeu un programa que demani les temperatures mitjanes de dues poblacions (per exemple Banyoles i Porqueres) dels 12 mesos de l�any. 
		 * Cal mostrar les temperatures per a cada mes i poblaci�
		 * Cal mostrar el/s lloc/s i mes/os on s�ha assolit la temperatura m�xima i m�nima.
		 * Tamb� ens interessa la temperatura mitjana de tot l�any per a cada poblaci�.
		 */
		Scanner sc=new Scanner(System.in);
		
		double temperatures [] [] = new double [2] [12];
		int mes=1 , mesos=12;
		double tempMitjaB ,tempMitjaP, tempTotalB=0 ,tempTotalP=0, tempMax=0 , tempMin=99999999;
		
		System.out.println("Entra les temperatures");
		
		for(int i=0;i<mesos;i++) {
			
			System.out.println("Banyoles, mes "+mes);
			temperatures[0] [i] = sc.nextDouble();
			
			System.out.println("Porqueres, mes "+mes);
			temperatures[1] [i] = sc.nextDouble();
			
			tempTotalB=temperatures[0][i] + tempTotalB;
			tempTotalP=temperatures[1][i] + tempTotalP;
			
			if(temperatures[0][i]>tempMax) {
				
				tempMax = temperatures[0][i];
				
			}
			else if(temperatures[1][i]>tempMax) {
				
				tempMax = temperatures[1][i];
				
			}
			if (temperatures[0][i]<tempMin) {
				
				tempMin = temperatures[0][i];
				
			}
			else if (temperatures[1][i]<tempMin) {
				
				tempMin = temperatures[1][i];
				
			}
			
			mes++;
		}
		
			tempMitjaB=tempTotalB/mesos;
			tempMitjaP=tempTotalP/mesos;
						
			mes=0;
			for(int i=0;i<mesos;i++) {
				mes++;
				System.out.println("Banyoles, mes "+mes+" : "+temperatures[0][i]+" �C");
				System.out.println("Porqueres, mes "+mes+" : "+temperatures[1][i]+" �C");
			}
			
			System.out.printf("Temperatura mitja a Banyoles : %.2f �C \n",tempMitjaB);
			System.out.printf("Temperatura mitja a Porqueres : %.2f �C \n",tempMitjaP);
			System.out.printf("Temperatura m�s alta de banyoles: %.2f �C \n",tempMax);
			System.out.printf("Temperatura m�s baixa de banyoles: %.2f �C",tempMin);

		sc.close();
	}
}
