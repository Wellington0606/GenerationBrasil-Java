package Familia32;

import java.util.Scanner;

public class Exercicio3decisão {

	public static void main(String[] args) {

	     int idade;
			
	        Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite a sua idade: " );
	        idade= leia.nextInt();

			if (idade >=10 && idade <=14) {
				System.out.println("\n Categoria Infantil" );
			}
			else if (idade >14 && idade <= 17) {
				System.out.println("\n Categoria Juvenil" );
			}
			else if (idade >17 && idade <=24) {
				System.out.println("\n Categoria Adulto" );
			}
			else {
				System.out.println("\nCategoria inválida");
			}


	}

}
