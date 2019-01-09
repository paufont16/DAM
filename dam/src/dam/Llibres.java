package dam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Llibre{
	
	String titol,autor;
	double isbn;
	int pagines;
	
}

public class Llibres {
	public static void main(String[] args) throws IOException{
		
		
		Llibre[] numLlibres;
		int quantLlibres,opcio;
		String paraula;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Quants llibres vols entrar? ");
		quantLlibres=Integer.parseInt(br.readLine());

		numLlibres= new Llibre[quantLlibres];
		
		for (int i=0;i<quantLlibres;i++){
			numLlibres[i]=new Llibre();
			
			System.out.println("T�tol");
			numLlibres[i].titol=br.readLine();
			
			System.out.println("Autor");
			numLlibres[i].autor=br.readLine();
			
			System.out.println("ISBN");
			numLlibres[i].isbn=Double.parseDouble(br.readLine());
			
			System.out.println("N�mero de p�gines");
			numLlibres[i].pagines=Integer.parseInt(br.readLine());
			
		}
		
		System.out.println("Tria una de les seg�ents opcions:\n"
				+ "1.- Mostra tots els llibres entrats\n"
				+ "2.- Buscar un llibre per el seu t�tol\n"
				+ "3.- Fi del programa");
		opcio=Integer.parseInt(br.readLine());
		
		switch(opcio) {
		
		case 1 : 
			
			for(int i=0;i<quantLlibres;i++) {
				
				System.out.println("Llibre n�mero "+(i+1)
						+"\n----------------"
						+"\nT�tol :"+numLlibres[i].titol+"\n"
						+ "Autor : "+numLlibres[i].autor+"\n"
						+"ISBN : "+numLlibres[i].isbn+"\n"
						+"N�mero de pagines : "+numLlibres[i].pagines);
				
				
			}
			break;
		case 2:
			
			System.out.println("Quina paraula busques?");
			paraula=br.readLine();
			
			boolean resultat;
			
			for(int i=0;i<quantLlibres;i++) {
				
			resultat = numLlibres[i].titol.contains(paraula);

			if(resultat) {
				
				System.out.println("Llibre n�mero "+(i+1)
						+"\n----------------"
						+"\nT�tol :"+numLlibres[i].titol+"\n"
						+ "Autor : "+numLlibres[i].autor+"\n"
						+"ISBN : "+numLlibres[i].isbn+"\n"
						+"N�mero de pagines : "+numLlibres[i].pagines);

				}

			}
			break;
			

		}
		
	}

}
