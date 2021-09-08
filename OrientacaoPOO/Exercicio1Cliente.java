package OrientacaoPOO;

public class Exercicio1Cliente {
	
	//Declaração de atributos de classe
	private String nomeCliente;
	private String generoCliente;
	
	//criação do método construtor
	public Exercicio1Cliente(String nomeCliente, String generoCliente)
	{
		this.nomeCliente = nomeCliente;
		this.generoCliente = generoCliente;
	}
	//declaração dos demais métodos
	public void imprimirInfo()
	{
		System.out.println("\n"+nomeCliente+"e seu genero é: "+generoCliente);
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
