package Familia32;

import java.util.Scanner;

public class Exercicio4decis�o {

	public static void main(String[] args) {
int num;
		
		Scanner leia = new Scanner(System.in);
			
		System.out.println("\nDigite um n�mero: " );
		num= leia. nextInt();
		
		if (num % 2 == 0) {
			System.out.println("\n O n�mero : " +num+" � par e a raiz dele � : "+Math.sqrt(num));
		}
		else {
			System.out.println("\n O n�mero : "+num+" � impar e ele elevado ao quadrado � : "+Math. pow (num, 2));
		}


	}

}
