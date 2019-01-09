package metodesJava;
/*
 * @author paufont
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Des d'una classe principal mostraMaxim() que demana dos enters crida a un m�tode trobarMaximDe2(a,b) que donats dos enters a i b, indiqui quin dels dos �s el m�xim.
En aquest mateix programa crida a un nou m�tode trobarMaximDe4(a,b,c,d) que cridi al m�tode anterior trobarMaximDe2(a,b) per tal de que donats quatre enters ens 
indiqui quin dels quatre �s el m�xim.
 */
public class Ex2 {
	
	protected static int num1,num2,num3,num4;
	
	public static  void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Entra el primer n�mero: ");
		num1=Integer.parseInt(br.readLine());
		
		System.out.println("Entra el segon n�mero: ");
		num2=Integer.parseInt(br.readLine());
		
		System.out.println("Entra el tercer n�mero: ");
		num3=Integer.parseInt(br.readLine());
		
		System.out.println("Entra el quart n�mero: ");
		num4=Integer.parseInt(br.readLine());
		
		System.out.println("El n�mero m�s gran dels dos primers �s "+trobarMaximDe2());
		System.out.println("El n�mero m�s gran dels quatre �s "+trobarMaximDe4());
	}
	
	public static int trobarMaximDe2() {
		
		if(num1>num2) {
			
			return num1;			
		}
		
		else {
			
			return num2;
		}
		
	}
	
	public static int trobarMaximDe4() {
		
		if(trobarMaximDe2()<num3 && num3>num4) {
			
			return num3;
			
		}
		else if(trobarMaximDe2()<num4 && num3<num4) {
			
			return num4;
			
		}
		
		else {
			return trobarMaximDe2();
		}
		
	}

}

