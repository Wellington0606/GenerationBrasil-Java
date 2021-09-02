package ExercicioForWhile;

import java.util.Scanner;

public class Exercicio6Dowhile {

	public static void main(String[] args) {
		  int numero , cont = 0;
		  float media=0;
		  
		  Scanner leia= new Scanner(System.in);
		  
		  do
		   { 
			  System.out.println("\nInsira um número: ");
			  numero= leia.nextInt();

		      if(numero % 3 == 0 && numero !=0){
		    	  media+=numero;
		          cont++;
		      }
		     }
		    while(numero !=0);
		    System.out.println("\n A media dos numeros é:  "+(media/cont));
		      }

		   
    	}
		   

	


