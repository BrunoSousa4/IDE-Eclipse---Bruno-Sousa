package primeiroprojeto;

import java.util.Scanner;

public class areadotrapezio {
	
	public static Scanner dados;

	public static void main(String[] args) {
		double bmaior, bmenor, area, altura;
		dados = new Scanner (System.in);
		//Variaveis
		System.out.println("Quanto mede a Base Maior?");
			bmaior = dados.nextDouble();
		System.out.println("Quanto mede a Base Menor?");
			bmenor = dados.nextDouble();
		System.out.println("Quanto mede a Altura?");
			altura = dados.nextDouble();
		area = (bmaior+bmenor)*altura/2;
		System.out.print("A �rea do Trap�zio � " + area + ".");
						
	}


}


	


