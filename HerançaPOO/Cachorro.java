package Heran�aPOO;

public class Cachorro extends Animal{
	private String correr;
	
	public Cachorro(String nome, int idade, String som, String correr)
	{
		super(nome,idade,som);
		this.correr = correr;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	public void imprimir()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nIdade do cachorro: "+getIdade()+" anos\nO som que o cachorro emite �: "
	+getSom()+"\nO cachorro pode correr at�: "+correr);
		
	}

}
