package ExercciosArrey;

import java.util.Scanner;

public class Exercicio4Arrays {

	public static void main(String[] args) {
		float[][] matriz1 = new float [2][2]; 
		float[][] matriz2 = new float [2][2]; 
		float[][] matriz3 = new float [2][2];
		float constante;
		int op, l, c;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0; l<2; l++) 
		{
			for(c=0; c<2; c++) 
			{
				System.out.printf("\nDigite os valores da primeira matriz[%d][%d]: ", l+1, c+1);
				matriz1[l][c] = leia.nextFloat();
			}
		}
		for(l=0; l<2; l++) 
		{
			for(c=0; c<2; c++) 
			{	
				System.out.printf("\nIndique os valores da segunda matriz[%d][%d]: ", l+1, c+1);
				matriz2[l][c] = leia.nextFloat();
			}
		}
		
		System.out.println("\t\tMenu de opções" );
		System.out.println("\n1- Somar as duas matrizes." );
		System.out.println("\n2- Subtrair a primeira matriz da segunda. " );
		System.out.println("\n3- Adicionar uma constante como duas matrizes." );
		System.out.println("\n4- Imprimir as duas matrizes." );
		System.out.println("\nIndique a opção desejada:" );
        op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			for(l=0; l<2; l++) 
			{
				for(c=0; c<2; c++) 
				{
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.println("\nSoma: "+ matriz3[l][c]);
				}
			}break;
		case 2:
			for(l=0; l<2; l++) 
			{
				for(c=0; c<2; c++) 
				{
					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
					System.out.println("\nSubtração: "+ matriz3[l][c]);
					
				}
			}break;
		case 3:
			for(l=0; l<2; l++)
			{
				for(c=0; c<2; c++) 
				{
					System.out.println("\nInforme o valor da constante: " );
					constante = leia.nextFloat();
					
					matriz1[l][c] = matriz1[l][c] + constante;
					matriz2[l][c] = matriz2[l][c] + constante;
					System.out.println("\nA primeira matriz somada a constande é: " +matriz1[l][c]);
					System.out.println("\nA segunda matriz somada a constante é: " +matriz2[l][c]);
					
				}
			}break;
		case 4: 
			for(l=0; l<2; l++) 
			{
				for(c=0; c<2; c++) 
				{
					System.out.println("\nOs valores da primeira matriz são: "+ matriz1[l][c]);
					System.out.println("\nOs valores da segunda matriz são: " +matriz2[l][c]);
				
				}		
			}break;
		}
			 
					
			}
		
		}
		
	
	

