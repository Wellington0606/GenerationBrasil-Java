package OrientacaoPOO;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario[] lista = new Funcionario[4];
		
		lista[0] = new Funcionario("Jos� Pereira","masculino","numero 5","auxiliar de produ��o");
		lista[1] = new Funcionario("Raimundo Nonato","masculino","numero 3","assistente de almoxarifado");
		lista[2] = new Funcionario("Vanderl�ia Maria","feminino","numero 2","supervisora de manuten��o");
		lista[3] = new Funcionario("Caroline concei��o","outros","numero 1","Ger�ncia");
		
		for(Funcionario roda:lista)
		{
			roda.imprimir();
		}
	}
}
