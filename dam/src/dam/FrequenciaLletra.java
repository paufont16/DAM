package dam;

import java.util.Arrays;
import java.util.Scanner;

public class FrequenciaLletra {

    public static void main(String[] args) {
        String frase ;
        char caracters[];
        double frequencia;
        int contador=1;//Contador es igual a 1 perque com a m�nim sempre es repetir� un cop
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu una cadena de caracters: ");
        frase = sc.nextLine();
        
        caracters = new char[frase.length()];//L'array ser� tant llarg com car�cters tingui la frase
        caracters=frase.toCharArray();//Separem la frase en car�cters
        
        Arrays.sort(caracters);//Ordenem les lletres per ordre alfab�tic

        for(int i=0;i<caracters.length;i++) {
        	
            for (int j = i+1; j<caracters.length; j++) {
               if(caracters[i]==caracters[j] ) {
                   
                    contador++;
                }

            }
            i=i+(contador-1);
            frequencia=((double)contador/frase.length());
            frequencia=frequencia*100;
            System.out.printf("%c : %.2f%% \n", caracters[i], frequencia);
            contador=1;
        }
        sc.close();
    }
}