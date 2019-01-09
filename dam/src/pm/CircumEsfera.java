package pm;
/*
 * @author paufont
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Fes un programa en Java que utilitzant 3 mètodes i a partir del radi d'una circumferència calculi la seva longitud, l'àrea i el volum de l'esfera resultant de rotar-la.

Requisits:
la classe s'anomenarà CircumEsfera
El radi serà del tipus double
Hi haurà 3 mètodes que rebran un double (r) i retornaran un double (calcularLongitud, calcularArea, calcularVolumEsfera)

Ampliació:
Feu que vagi acceptant radis i mostrant resultats fins que l'usuari entri un 0*/

public class CircumEsfera {

	public static double radi , pi=3.14;//Declarem les variables publiques per poder cridarles desde varis metodes
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
		System.out.println("Entra el radi: ");//Demanem el radi 
		radi=Double.parseDouble(br.readLine());
		
		//Cridem els metodes perque mostrin el resultat que han calculat
		System.out.println("Longitud : "+calcularLongitud());
		System.out.println("Area : "+calcularArea());
		System.out.println("Volum esfera : "+calcularVolumEsfera());
		
		}while(radi==0);
		

	}
		public static double calcularLongitud() throws IOException {

			double longitud ;

			
			
			longitud =2*pi*radi;
			
			return longitud;//Quan cridem el metode calcularLongitud tornara el valor de longitud
			
			
		}
		public static double calcularArea()  {
			
			double area;
			
			area=pi*Math.pow(radi, 2);
			
			return area;
	
			
		}
		public static double calcularVolumEsfera()  {
			
			double volum;
			
			volum=4*pi/3*Math.pow(radi, 3);
			
			return volum;
			
		}
		
	

}
