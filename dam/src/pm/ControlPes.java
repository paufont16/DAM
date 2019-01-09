package pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


import pm.Persona;



public class ControlPes {
	
	protected static double imc , personesTotal;
	public static void main(String[]args) throws IOException {
		
		boolean acabar = true;
		
		ArrayList <Persona> persones = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
				
		do {
		Persona huma = new Persona();
		
		System.out.println("DNI: ");
		huma.dni=br.readLine();
		
			if(huma.dni.equals("0")) {
				break;
			}
		
		
		System.out.println("Nom: ");
		huma.nom=br.readLine();
		
		System.out.println("Edat: ");
		huma.edat=Integer.parseInt(br.readLine());
		
		System.out.println("Pes: ");
		huma.pes=Double.parseDouble(br.readLine());
				
		System.out.println("Alçada: ");
		huma.alcada=Double.parseDouble(br.readLine());
		
		persones.add(huma);
		
		}while(acabar);
		
		personesTotal=persones.size();
		
		
		for(int i=0;i<persones.size();i++) {
			
			System.out.println("Persona numero "+(i+1));
			
			System.out.println("DNI: "+persones.get(i).dni);
			System.out.println("Nom: "+persones.get(i).nom);
			System.out.println("Edat: "+persones.get(i).edat);
			System.out.println("Pes: "+persones.get(i).pes);
			System.out.println("Alçada: "+persones.get(i).alcada);
			calcularIMC(persones);
		}
		
		
	}
	
	public static void calcularIMC(ArrayList <Persona> persones) {
		
		
		for(int i=0;i<personesTotal;i++) {
		
		imc=persones.get(i).pes/Math.pow(persones.get(i).alcada, 2);
		
		if(imc<18) {
			System.out.println("Pes baix. Necessari valorar signes de desnutrició");
		}
		else if (imc>=18 && imc<=24.9) {
			
			System.out.println("Normal");
			
		}
		else if (imc>=25 && imc<=26.9) {
			
			System.out.println("Sobrepès");
			
		}
		else if (imc>=27 && imc<=29.9) {
			
			System.out.println("Obesitat grau I. Risc relatiu alt per desenvolupar malalties cardiovasculars");
			
		}
		else if (imc>=30 && imc<=39.9) {
			
			System.out.println("Obesitat grau II. Risc relatiu molt alt per desenvolupar malalties cardiovasculars");
			
		}
		else  if (imc>40){
			
			System.out.println("Obesitat grau III Extrema o Mòrbida. Risc relatiu extremadament alt per desenvolupar malalties cardiovasculars");
			
		}
		
		
	}
		
  }
	
}
