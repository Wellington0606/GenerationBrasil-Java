package OrientacaoPOO;

public class Exercicio1Cliente {
	
	//Declara��o de atributos de classe
	private String nomeCliente;
	private String generoCliente;
	
	//cria��o do m�todo construtor
	public Exercicio1Cliente(String nomeCliente, String generoCliente)
	{
		this.nomeCliente = nomeCliente;
		this.generoCliente = generoCliente;
	}
	//declara��o dos demais m�todos
	public void imprimirInfo()
	{
		System.out.println("\n"+nomeCliente+"e seu genero �: "+generoCliente);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getGeneroCliente() {
		return generoCliente;
	}
	public void setGeneroCliente(String generoCliente) {
		this.generoCliente = generoCliente;
	}
	

}
