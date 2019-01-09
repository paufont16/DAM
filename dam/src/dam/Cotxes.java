package dam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
 * Fes un programa que pregunti dades de cotxes fins que l'usuari entri com a nom de cotxe "fi". 
 * De cada cotxe haur�s de guardar Marca (String), Model (String), Velocitat m�xima km/h (double).
 *  El programa detectar� si un cotxe ja s'ha entrat (Marca i model iguals) i avisar� que ja existeix en el moment d'entrar 
 *  per tal de no repetir dades. Tamb� controlar� errors d'entrada, com un text enlloc de velocitat. 
 *  La sortida del programa mostrar� tots els cotxes, model i velocitats i indicar� el/s cotxe/s m�s r�pids. 
 *  A la sortida la velocitat s'expressar� en km/h i milles/hora.
 * =>En la majoria d'aplicacions on no sabeu quants elements necessiteu podeu utilitzar l'ArrayList
 * => +Opcional: Ordenar els cotxes segons velocitat (teniu enlla�os d'ajuda en un altre document) <---bubble
 */

class Vehicle{
	String marca,model;
	double velMax;
}

public class Cotxes {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList <Vehicle> cotxes = new ArrayList<>();//cotxes= nom conjunt objectes
		
		boolean problema;
		
		do {
			
			problema=true;
			
			Vehicle cotxe = new Vehicle();//cotxe = valors de cotxes
			
			System.out.println("Marca :");
			cotxe.marca=br.readLine();
			if(cotxe.marca.equalsIgnoreCase("fi")) {
				problema=false;
			}
			else {
			System.out.println("Model :");
			cotxe.model=br.readLine();
			System.out.println("Velocitat m�xima :");
			cotxe.velMax=Double.parseDouble(br.readLine());
			}
			
			cotxes.add(cotxe);//Afegeix els valors entrats abans a la llista cotxes
			
		}while(problema);
		
		for(int i=0;i<cotxes.size();i++) {
			System.out.println("Marca :"+cotxes.get(i).marca);
			System.out.println("Model :"+cotxes.get(i).model);
			System.out.println("Velocitat m�xima :"+cotxes.get(i).velMax+" km/h");
		}
		
	}
	
}
