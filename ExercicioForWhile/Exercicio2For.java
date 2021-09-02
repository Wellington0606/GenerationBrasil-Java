
package ExercicioForWhile;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
				 	 
		Scanner leia = new Scanner(System.in);
         int num, contPar = 0, contImpar = 0;
        
        for (int i = 1; i <= 10; i++){
        	
        	System.out.println("Digite o "  + i +  "º número: " );
        	num = leia.nextInt();
            
            if(num % 2 == 0){
            contPar++;
            }
            if(num % 2 == 1){
            contImpar++;
            }
        }
        
        System.out.println("\n Foram digitados: "  + contPar +  " números pares." );
        System.out.println("\n Foram digitados: " + contImpar + " números ímpares. ");
	}

}
