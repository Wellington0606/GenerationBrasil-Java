package ExercicioForWhile;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
      int idade, menor21=0,maior50=0;
		
      Scanner leia= new Scanner(System.in);
		
      System.out.println("\n Digite  a idade: "+"Para encerrar digite -99"  );
        idade= leia.nextInt();
		
		while (idade != -99) {
			System.out.println("\n Digite a idade: " );
			idade= leia.nextInt();
			
			if(idade <21) {
				menor21++;
			}
			else if (idade > 50) {
				maior50++;
			}
		}
		
		System.out.println("\n Quantidade de pessoas com menos de 21: "+menor21);
		System.out.println("\n Quantidade de pessoas com mais de 50 anos: "+maior50);
	}

}
