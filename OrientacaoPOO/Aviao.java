package OrientacaoPOO;

public class Aviao {
	//Declara��o dos atributosda classe
	private String aviaoModelo;
	private int capacidade;
	private int ano;
	
	//cria��o do m�todo construtor
	public Aviao(String aviaoModelo, int capacidade, int ano)
	{
		this.aviaoModelo = aviaoModelo;
		this.capacidade = capacidade;
		this.ano = ano;
	}
	public void imprimir()
	{
		System.out.println("\n\tAvi�o modelo: " +aviaoModelo+ ", sua capacidade de passageiros �: " +capacidade+ " pessoas e o seu ano de fabrica��o �: " +ano);
	}
	public String getAviaoModelo() {
		return aviaoModelo;
	}
	public void setAviaoModelo(String aviaoModelo) {
		this.aviaoModelo = aviaoModelo;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	

}
