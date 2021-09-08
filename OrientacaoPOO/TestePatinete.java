package OrientacaoPOO;

public class TestePatinete {

	public static void main(String[] args) {
		Patinete[] lista = new Patinete[2];
		
		lista[0] = new Patinete("Elétrico "," Rosa");
		lista[1] = new Patinete("De empurrar ","preto brilhante");
		
		for(Patinete roda:lista)
		{
			roda.imprimir();
		}	
	}

}
