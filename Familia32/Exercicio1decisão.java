package Familia32;

import java.util.Scanner;

public class Exercicio1decis�o {

	public static void main(String[] args) {
int n1,n2,n3;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro n�mero: ");
		n1=leia.nextInt();
		System.out.println("\nDigite o segundoo n�mero: ");
		n2=leia.nextInt();
		System.out.println("\nDigite o terceiro n�mero: ");
		n3=leia.nextInt();
		
		if (n1>n2 && n1>n3){
		System.out.println("\nO n�mero : " +n1+" � o maior");
		}	
		else if (n2>n1 && n2>n3){
		System.out.println("\nO n�mero : " +n2+" � o maior");
		}
		else if (n3>n1 && n3>n2){
		System.out.println("\nO n�mero : " +n3+" � o maior");
		}
	}

}
