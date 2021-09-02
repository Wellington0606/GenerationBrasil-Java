package ExercicioForWhile;

import java.util.Scanner;

public class Exercicio5Dowhile {

	public static void main(String[] args) {
      int somaNumeros=0,num;
		
        Scanner leia= new Scanner(System.in);
        
        System.out.println("\n Digite um número: " );
        num= leia.nextInt();
		
		do  {
		System.out.println("\n Digite um número: " );
        num= leia.nextInt();
			somaNumeros+=num;
		}
		while(num !=0);

		System.out.println("\n A soma dos números é : "+somaNumeros);
		
	}

}
