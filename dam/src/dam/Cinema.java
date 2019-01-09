package dam;
/*
 * @author paufont
 */
import java.util.Scanner;

public class Cinema {
	public static void main(String[] args) {
		/*Feu un programa per controlar la recaptaci� setmanal d�un cinema que t� 3 sales
		 * � volem distingir la recaptaci� diaria i setmanal per sala
		 * � volem saber el total recaptat del cinema per dia i setmana
		 */
		Scanner sc=new Scanner(System.in);
		
		//Declarem variables
		double cinema [] [] = new double [3] [7];
		double recSala1=0 , recSala2=0 , recSala3=0 , recTotal , recTotalDia;
		int pregunta , dies=7 , dia=1 , sala;
		char continuar;
		
		do {
				System.out.println("A quina sala vols entrar la recaptaci�?");//Preguntem quina sala vol entrar la recaptaci�
				sala=sc.nextInt();
			
				if(sala<=0 || sala>3) {//Si sala es mes petit o igual a 0 i m�s gran que 3 tornara a preguntar
					do {
						System.out.println("El n�mero de sala que has entrat no existeix, torna a provar-ho: ");//Preguntem quina sala vol entrar la recaptaci�
						sala=sc.nextInt();
					}while(sala<=0 || sala>3);//Si al tornar a preguntar torna a entrar un valor no v�lid, tornar� a preguntar-ho fins que sigui v�lid
				}
			
			
			
			
			switch(sala) {
			
						case 1: 
							
							dia=1;
							for(int i=0;i<dies;i++) {
							System.out.print("Recaptaci� del dia "+dia+" i sala 1");//Depenent de la sala es guardaran els valor a un lloc o altre
							cinema[0][i]=sc.nextDouble();
							recSala1=cinema[0][i]+recSala1;//Sumem el total de tots els dies
							dia++;
						}break;
						
						case 2: 
							dia=1;
							for(int i=0;i<dies;i++) {
							System.out.print("Recaptaci� del dia "+dia+" i sala 2");
							cinema[1][i]=sc.nextDouble();
							recSala2=cinema[1][i]+recSala2;
							dia++;
						}break;
				
						case 3: 
							dia=1;
							for(int i=0;i<dies;i++) {
							System.out.print("Recaptaci� del dia "+dia+" i sala 3");
							cinema[2][i]=sc.nextDouble();
							recSala3=cinema[2][i]+recSala3;
							dia++;
						}break;
						
						}
						System.out.println("Vols entrar la recaptaci� d'alguna sala m�s?");
						continuar=sc.next().charAt(0);
		
				}while(continuar=='s' || continuar=='S');//Preguntarem a l'usuari si vol entrar m�s valors, si la resposta no comen�a per s o S saltar� al seg�ent pas
				
		
		do {
		
		System.out.println("Que vols saber?\n"
				+ "1.-Recaptaci� diaria i setmanal de la sala1\n"
				+ "2.-Recaptaci� diaria i setmanal de la sala2\n"
				+ "3.-Recaptaci� diaria i setmanal de la sala3\n"
				+ "4.-Recaptaci� diaria i setmanal del cinema");
		pregunta=sc.nextInt();//Preguntem a l'usuari que vol consultar
		
		
		if(pregunta<=0 || pregunta>4) {
			
			do {
				System.out.println("El n�mero que has entrat no es correcta, torna a provar: ");//Preguntem quina sala vol entrar la recaptaci�
				pregunta=sc.nextInt();
			}while(pregunta<=0 || pregunta>4);
			
		}
		
		
		
		switch(pregunta) {
		
					case 1: 
						dia=1;
						for(int i=0;i<dies;i++) {//Fem un bucle perque mostri tots els valors
							
							System.out.println("Recaptaci� del dia "+dia+" = "+cinema[0][i]+"�");
							dia++;
						}
						System.out.println("Recaptaci� total de la setmana = "+recSala1+"�");//Mostrem el valor total d'aquella setmana
						break;
						
					case 2: 
						dia=1;
						for(int i=0;i<dies;i++) {
							
							System.out.println("Recaptaci� del dia "+dia+" = "+cinema[1][i]+"�");
							dia++;
						}
						System.out.println("Recaptaci� total de la setmana = "+recSala2+"�");
						break;
						
					case 3: 
						dia=1;
						for(int i=0;i<dies;i++) {
							
							System.out.println("Recaptaci� del dia "+dia+" = "+cinema[2][i]+"�");
							dia++;
						}
						System.out.println("Recaptaci� total de la setmana = "+recSala3+"�");
						break;
					case 4: 
						dia=1;
						for(int i=0;i<dies;i++) {
							
							recTotalDia=cinema[0][i]+cinema[1][i]+cinema[2][i];//Sumem els valors de les 3 sales cada dia
							
							System.out.println("Recaptaci� total del dia "+dia+" = "+recTotalDia+"�");//Mostrem el total d'aquell dia
							dia++;
						}
			
						recTotal=recSala1+recSala2+recSala3;
						System.out.println("Recaptaci� total de la setmana del cinema = "+recTotal+"�");//Mostrem la suma de les recaudaci�ns de cada sala
						break;
						
					
				}
				System.out.println("Vols consultar algo m�s?");
				continuar=sc.next().charAt(0);
				
		}while(continuar=='s' || continuar=='S');

		sc.close();
	}

}
