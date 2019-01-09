package dam;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


class Cotxe {
	String marca, model;
	double velMax;
}
public class CotxesRapids {
	/**
	 * Fes un programa que pregunti cotxes fins que l'usuari entri com a nom de cotxe "fi". 
	 * De cada cotxe hauràs de guardar Marca (String), Model (String), Velocitat màxima km/h (double). 
	 * El programa detectarà si un cotxe ja s'ha entrat i avisarà que ja existeix en el moment d'entrar per tal de no repetir dades. 
	 * També controlarà errors d'entrada, com un text enlloc de velocitat. 
	 * La sortida del programa seran els cotxes, model i velocitats ordenats per velocitat. 
	 * A la sortida la velocitat s'expressarà en km/h i milles/hora.
	 * 
	 */
	public static void main(String[] args) throws IOException{
		//Declaració variables
		ArrayList<Cotxe> llistaCotxes;
		int i=0;
		String fi;
		boolean sortir=false;
		boolean repetit=false;
		double velMilles;
		//Declaració Scanner
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		//Referenciem a Llibre i marquem la longitud
		llistaCotxes = new ArrayList<Cotxe>();
		
			while(!sortir) {  //Mira si s'ha donat l'ordre de surtir
				System.out.println("\nEscriu \"fi\" per acabar d'introduir cotxes o \"s\" per introduir cotxe ");
				fi = br.readLine();
				if(fi.equalsIgnoreCase("fi")) { //si a la marca del cotxe posa fi surt del programa
					sortir=true;
				} else {		
					Cotxe cotxe=new Cotxe();
					do {
						repetit=false;
						//Escriu les dades del cotxe
						System.out.println("\n\"Marca del Cotxe nº"+(i+1)+":");
						cotxe.marca = br.readLine();
						System.out.println("Model del Cotxe nº"+(i+1)+":");
						cotxe.model = br.readLine();
						
						//Mira si esta repetit
						for(i=0; i<llistaCotxes.size(); i++)
							for(int j=0; j<llistaCotxes.size();j++ ) {
								if(llistaCotxes.get(i).marca.equals(cotxe.marca) && llistaCotxes.get(i).model.equals(cotxe.model)) {
									System.out.println("El cotxe ja existeix! Introdueix un altre.");
									repetit=true;
								} 
							}		
					} while(repetit);	
					do { 
						sortir=false;
						try { //Mira si entra un número a la velocitat
							System.out.println("Velocitat màxima km/h del Cotxe nº"+(i+1)+":");
							cotxe.velMax = Double.parseDouble(br.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Entri un número!");
							sortir=true;
						}
					} while(sortir);
						
					llistaCotxes.add(cotxe);
					i++;
				}
			}
		
		BubbleSort(llistaCotxes); //Cridar els cotxes ordenats
		
		//Mostra la llista de cotxes
		for (int j=0; j<llistaCotxes.size(); j++) {
			velMilles = llistaCotxes.get(j).velMax *0.621371192;
			System.out.println("Cotxe nº"+(j+1)+": "+
								"\nMarca: "+llistaCotxes.get(j).marca+
								"\nModel: "+llistaCotxes.get(j).model+
								"\nVelocitat màxima en Km/h "+llistaCotxes.get(j).velMax);
			System.out.printf("Velocitat màxima en Milles/h %.2f\n\n", velMilles);	
		}	
	}
	
	static void BubbleSort(ArrayList<Cotxe> llistaCotxes) { //Ordenar els cotxes
		for(int i=0; i<llistaCotxes.size() -1; i++) {
			for(int j=0; j<llistaCotxes.size()-1; j++) {
				if(llistaCotxes.get(j).velMax > llistaCotxes.get(j+1).velMax) {
					double temp = llistaCotxes.get(j+1).velMax;
					llistaCotxes.get(j+1).velMax=llistaCotxes.get(j).velMax;
					llistaCotxes.get(j).velMax=temp;
				}
			}
		}
	}
}
