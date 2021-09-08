package OrientacaoPOO;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario[] lista = new Funcionario[4];
		
		lista[0] = new Funcionario("José Pereira","masculino","numero 5","auxiliar de produção");
		lista[1] = new Funcionario("Raimundo Nonato","masculino","numero 3","assistente de almoxarifado");
		lista[2] = new Funcionario("Vanderléia Maria","feminino","numero 2","supervisora de manutenção");
		lista[3] = new Funcionario("Caroline conceição","outros","numero 1","Gerência");
		
		for(Funcionario roda:lista)
		{
			roda.imprimir();
		}
	}
}
