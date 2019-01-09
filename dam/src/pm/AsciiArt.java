package pm;
/*
 * @author paufont
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Fes un programa principals que cridi tantes vegades com vulgui un usuari (0-100) un mètode anomenat mostrarCredits() que mostrarà en pantalla un AsciiArt 
 * (trieu el que us agradi).
 * Comproveu que l'usuari entri un número enter o l'avisi quan hi hagi errors. Si posa un 0 sortirà del programa.
 */
public class AsciiArt {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numDibuixos;
		boolean sortir=true;
		
		do {
			
			try {
				System.out.println("Quantes vegades vols que surti el dibuix? ");
				numDibuixos=Integer.parseInt(br.readLine());

					if(numDibuixos==0) {//Si l'usuari entra un 0 sortirà del programa
						sortir=false;
					}
					
					else if (numDibuixos>=0 && numDibuixos<=100) {//Si el número està entre 0 i 100 inclosos mostrarà els dibuixos
					for(int i=1;i<=numDibuixos;i++) {
						mostrarCredits();//Cridem el metode
					}
	
					}
					else {
						System.out.println("Entra un número entre 0 i 100 inclosos");//Sino mostrarà aquest missatge i tornarà a preguntar
					}
			}
			catch (NumberFormatException e) {//Si no entra un número enter, mostrarà aquest missatge i tornarà a preguntar
				
				System.out.println("Entra un número enter");
			}
		
			}while(sortir);
		
	}
	
	public static void mostrarCredits() {
		
		System.out.print("                 __   ____\r\n" + 
				"                /   '~'   ) \\\r\n" + 
				"               / _(__  (__   \\_\r\n" + 
				"              / /(/  )) ) (\\ \\ \\\r\n" + 
				"             ( / (   (     )\\ ) )\r\n" + 
				"             )//\"-_  )_.-\"\\ (    \\\r\n" + 
				"             )|-._     _.-- )( \\ (\r\n" + 
				"            (/){c)\\| /\"c)\"7 )|\\  )\r\n" + 
				"             )|\"\"\"'| `\"\"\"\" ( |  /_)\r\n" + 
				"            ( |    --       ,/ / -_)\r\n" + 
				"              \\    __      / .\" \\ -_)\r\n" + 
				"               \\  /--\\    //(   ( -_)\r\n" + 
				"                \\ `--'   //     ( -_)\r\n" + 
				"                 \\____.-\" |     ( -_)\r\n" + 
				"                   |      |    ( -_)\r\n" + 
				"                   |      |   ( -_)\r\n" + 
				"                   |      |  ( -_)\r\n" + 
				"        _________-\"\\     / \"-(_-_)___\r\n" + 
				"       /                              \\\r\n" + 
				"      /                                \\\r\n" + 
				"      \\                              __ \\\r\n" + 
				"       \\     /             /        /   |\r\n" + 
				"       /    /      /      /        /   /\r\n" + 
				"      /     \\____ /_____.'         \\__/\r\n" + 
				"     |                             /\r\n" + 
				"     |                        |   /\r\n" + 
				"     |          __            |  /\r\n" + 
				"     \\           __           /_\"\r\n" + 
				"      \\          _           /\r\n" + 
				"       '._______/ \\________.'\r\n" + 
				"                   ,      ,\r\n" + 
				"                ___(      )_______\r\n" + 
				"              ,\"   (      )      ,|\r\n" + 
				"            ,\"     '-.__.-'    ,\" | jjs\r\n" + 
				"          ,\"________________ ,\"  ,\"\r\n" + 
				"         /   /  /| /) /|    /  ,\"\r\n" + 
				"        /   /_ /\"|/\\ /\"|   / ,\"\r\n" + 
				"       /_________________ /.\""+"\n");
		
		
	}

}


