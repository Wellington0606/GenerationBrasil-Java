package ExercciosArrey;

import java.util.Scanner;

public class Exercicio1Arrey {

	public static void main(String[] args) {
		int A[] = new int[6];
		int soma;
		A[0]=1; A[1]=0; A[2]=5; A[3]=-2; A[4]=-5; A[5]=7;
		
		Scanner leia = new Scanner(System.in);
		
		soma = (A[0] + A[1] + A[5]);
		System.out.println("\nResultado da soma: "+soma);
		
		A[3]= 100;
		System.out.println("\nPosição 4 do vetor: "+A[4]);
		
		for (int i=0; i<6; i++) {
		
		System.out.println("\nValores do vetor A em ordem de posição: "+A[i]);
		}
	}
}	
	
