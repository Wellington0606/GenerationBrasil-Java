package OrientacaoPOO;

public class TesteBanco {

	public static void main(String[] args) {
		ContaBancaria[] lista = new ContaBancaria[4];
		
		lista[0] = new ContaBancaria("Pereira silva",1010, 12345, 33333311);
		lista[1] = new ContaBancaria("Raimundo Nonato", 2002, 54321, 222222211);
		lista[2] = new ContaBancaria("Maria Vanderléia ", 3030, 44211, 55554312);
		lista[3] = new ContaBancaria("Caroline conceição",4004,55431,776787512);
		
		for(ContaBancaria roda:lista)
		{
			roda.imprimir();
		}
	}

}
