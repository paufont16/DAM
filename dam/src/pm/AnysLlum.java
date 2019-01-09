package pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnysLlum {
	
	protected static double  anysLlum, velocitat, anys, mesos,dies,hores,minuts,segons,residu,residum,residudi,residuh,residumin,residuseg;
	protected static int nau;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// un any llum = 9.460.730.472.580,8 km
		
		System.out.println("Escull en quina nau vols fer el viatge : \n"
				+ "1.-Discovery \n"
				+ "2.- Atlantis \n"
				+ "3.-Endeavour \n");
		nau=Integer.parseInt(br.readLine());
		
		System.out.println("A quants anys llum està el planeta al que vols viatgar? ");
		anysLlum=Integer.parseInt(br.readLine());
		
		calcularTemps();
		
		
	}
	
	public static void calcularTemps() {
		
		switch (nau) {
		
		case 1: 
				
			
			
				anysLlum=anysLlum*9460730472580L;//km
				
			
				hores=anysLlum/28000;//h
				segons=hores*3600;//s
				
				anys=segons/3.154e+7;
				
				mesos=(segons-(3.154e+7*anys))/2.628e+6;
				
				dies=(segons-((3.154e+7*anys)+(mesos*2.628e+6)))/86400;
				
				hores=(segons-((3.154e+7*anys)+(mesos*2.628e+6)+(dies*86400)))/3600;
				
				minuts=(segons-((3.154e+7*anys)+(mesos*2.628e+6)+(dies*86400)+(hores*3600)))/60;
				
				segons=segons-((3.154e+7*anys)+(mesos*2.628e+6)+(dies*86400)+(hores*3600));
				
				
				
				
				System.out.println("Anys: "+anys+"\n"
									+ "Mesos : "+mesos+"\n"
									+ "Dies: "+dies+"\n"
									+ "Hores: "+hores+"\n"
									+ "Minuts: "+minuts+"\n"
									+ "Segons: "+segons+" \n");
				
				break;
		
		
		
		case 2: hores=28080/anysLlum;
				minuts=hores/60;
				segons=minuts/60;
				dies=hores*24;
				mesos=dies*30;
				anys=mesos*12;
				
				System.out.println("Anys: "+anys+"\n"
						+ "Mesos : "+mesos+"\n"
						+ "Dies: "+dies+"\n"
						+ "Hores: "+hores+"\n"
						+ "Minuts: "+minuts+"\n"
						+ "Segons: "+segons+" \n");
		
				break;
				
		case 3: hores=28000/anysLlum;
				minuts=hores/60;
				segons=minuts/60;
				dies=hores*24;
				mesos=dies*30;
				anys=mesos*12;
				
				System.out.println("Anys: "+anys+"\n"
						+ "Mesos : "+mesos+"\n"
						+ "Dies: "+dies+"\n"
						+ "Hores: "+hores+"\n"
						+ "Minuts: "+minuts+"\n"
						+ "Segons: "+segons+" \n");

				break;

		}
		
	}

}
