package ExercciosArrey;

import java.util.Scanner;

public class Exercicio2Arrey {

	public static void main(String[] args) {
		
			int num[] = new int[6];
			int par,impar,somapar=0,qimpar=0;
			
			Scanner leia = new Scanner(System.in);
			
			for (int x=0;x<6;x++)
			{
				System.out.println("\nDigite um numero: ");
				num[x]  = leia.nextInt();
			}
			for (int x=0;x<6;x++)
			{
				if (num[x] % 2 == 0)
				{
					System.out.println("\nN�mero par: "+num[x]);
					somapar += num[x];
				}
				else
				{
					System.out.println("\nN�mero �mpar: "+num[x]);
				    qimpar++;
			   }
			}
		     System.out.println("\n� soma de n�meros pares �: "+somapar);
		     System.out.println("\nA quantidade  de n�mero �mpar �: "+qimpar);
		
	}

}
