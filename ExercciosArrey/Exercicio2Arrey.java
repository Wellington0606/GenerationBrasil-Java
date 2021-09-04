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
					System.out.println("\nNúmero par: "+num[x]);
					somapar += num[x];
				}
				else
				{
					System.out.println("\nNúmero ímpar: "+num[x]);
				    qimpar++;
			   }
			}
		     System.out.println("\nÀ soma de números pares é: "+somapar);
		     System.out.println("\nA quantidade  de número ímpar é: "+qimpar);
		
	}

}
