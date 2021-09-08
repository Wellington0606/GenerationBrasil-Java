package OrientacaoPOO;

public class TestePaciente {

	public static void main(String[] args) {
		Paciente[] lista = new Paciente[2];
		
		lista[0] = new Paciente("João da Silva Pereira","masculino","numero 12","Hepatite");
		lista[1] = new Paciente("Rafaela dos Santos","feminino","numero 35","Pressão alta");
		
		
		for(Paciente roda:lista)
		{
			roda.imprimir();
		}
	}

}
