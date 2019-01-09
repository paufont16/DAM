package dam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ratolinet {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x=0 ,y=0;
		char lletra='A';
		int nums=0,dificultat;
		int tauler [][]= new int[5][5];
		char solucio [][]= new char [5][5];
		int gats=0, formatges=0;
		String coord , coordNum,coordLletres;
		String lletres ="abcde";
		String numeros ="12345";
		
		System.out.println("Dificultat [1-baixa (1 gat), 2-mitja (2 gats), 3-alta (3 gats)]? ");
		dificultat=Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				tauler [i][j]=0;
				}
		}//Posem tot el tauler a 0
		
		
		
		switch(dificultat) {
		
		case 1: 
			do  {
				
     			x=(int)(Math.random()*5);
        		y=(int)(Math.random()*5);
        		if(tauler[x][y]==0) {//Si la posició té valor 0 o diferent de 1 i 2 escriurà el nou valor
        			tauler[x][y]=1;
                  	gats++;
        		}	
       		}while (gats<1);//Farà el bucle fins que entri 1 gat
			
			do  {  
	 			x=(int)(Math.random()*5);
	    		y=(int)(Math.random()*5);
	    		if(tauler[x][y]==0) {
	         	tauler[x][y]=2;
	          	formatges++;
	    		}
	       			
	   		}while (formatges<3);
			
			break;
			
		case 2: 
			do  {
				
     			x=(int)(Math.random()*5);
        		y=(int)(Math.random()*5);
        		if(tauler[x][y]==0) {
        			tauler[x][y]=1;
                  	gats++;
        		}	
       		}while (gats<2);
			
			do  {  
     			x=(int)(Math.random()*5);
        		y=(int)(Math.random()*5);
        		if(tauler[x][y]==0) {
             	tauler[x][y]=2;
              	formatges++;
        		}
           			
       		}while (formatges<3);
			
			break;
			
		case 3: 
			do  {
				
     			x=(int)(Math.random()*5);
        		y=(int)(Math.random()*5);
        		if(tauler[x][y]==0) {
        			tauler[x][y]=1;
                  	gats++;
        		}	
       		}while (gats<3);
			
			do  {  
     			x=(int)(Math.random()*5);
        		y=(int)(Math.random()*5);
        		if(tauler[x][y]==0) {
             	tauler[x][y]=2;
              	formatges++;
        		}
           			
       		}while (formatges<3);
			
			break;
		}

		
		System.out.println("JOC DEL RATOLINET de pfont \n"
				+ "=================================");
		
		for(int i=0;i<6;i++) {
			if(nums==0){
				System.out.print("  ");
			}
			else {
			System.out.print(nums +" ");
			}
			nums++;
			
			for(int j=1;j<6;j++) {
				if (i==0) {
					System.out.print(lletra++ +" ");
				}
				else {
				System.out.print("- ");
				}
			}
			System.out.println();
		}
		
		
		
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				solucio [i][j]='-';
				}
		}
		
		do{
			nums=0;
			lletra='A';
			
		System.out.println("Entra coordenades o S per sortir");
		coord=br.readLine();
		
		
		
		coordNum=coord.substring(0,1); //agafa el primer caràcter de les coordenades entrades anteriorment i el guarda a coord1
		coordLletres=coord.substring(1,2);
		
		
		for(int i=0;i<=5;i++) {
			if(nums==0){
				System.out.print("  ");
			}
			else {
			System.out.print(nums +" ");
			}
			nums++;
			
			for(int j=0;j<5;j++) {
				
				if (i==0) {
					System.out.print(lletra++ +" ");
				}
				
				else if(i-1==numeros.indexOf(coordNum) && j==lletres.indexOf(coordLletres)) {

					if(tauler [numeros.indexOf(coordNum)][lletres.indexOf(coordLletres)]==0){
						System.out.print(solucio [numeros.indexOf(coordNum)][lletres.indexOf(coordLletres)]=' ');
					}
					else if(tauler [numeros.indexOf(coordNum)][lletres.indexOf(coordLletres)]==1){
						System.out.print(solucio [numeros.indexOf(coordNum)][lletres.indexOf(coordLletres)]='*');
					}
					else if(tauler [numeros.indexOf(coordNum)][lletres.indexOf(coordLletres)]==2){
						System.out.print(solucio [numeros.indexOf(coordNum)][lletres.indexOf(coordLletres)]='^');
					}
					
				}
			
				
				else {
					System.out.print(solucio [i-1][j]='-');
				}
			}
			System.out.println();
		}
			
		
		
		if(coord.equalsIgnoreCase("!buscamines")) {
			
			nums=0;
			lletra='A';
			
			for(int i=0;i<=5;i++) {
				if(nums==0){
					System.out.print("  ");
				}
				else {
				System.out.print(nums +" ");
				}
				nums++;
				
				for(int j=0;j<5;j++) {
					if (i==0) {
						System.out.print(lletra++ +" ");
					}
					else if(tauler [i-1][j]==0){
						System.out.print("- ");
					}
					else if(tauler [i-1][j]==1) {
						System.out.print("* ");
					}
					else if(tauler [i-1][j]==2) {
						System.out.print("^ ");
					}	
				}
				System.out.println();
			}break;
		}

		}while(solucio [numeros.indexOf(coordNum)][lletres.indexOf(coordLletres)]!='*');


	}


}