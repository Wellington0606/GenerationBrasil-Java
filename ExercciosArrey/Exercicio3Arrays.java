package ExercciosArrey;

import java.util.Scanner;

public class Exercicio3Arrays {

	public static void main(String[] args) {
		int contador=0,numero;
		int matriz [][]= new int [3][3];
		
		Scanner leia = new Scanner(System.in);
		
		for (int l=0;l< 3; l++)
		{
			for(int c=0; c <3; c++)
			{
				System.out.println("\nDigite qualquer número: ");
				numero= leia.nextInt();
				matriz[l][c]=numero;
				
				if(numero>10)
				{
					contador++;
				}
			}
		}
		
       
		System.out.println("\nOs valores maiores que 10 são: "+contador);

	}

}
