package HerançaPOO;

public class Cavalo extends Animal{
	private String correr;
	
	public Cavalo(String nome, int idade, String som, String correr)
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
		System.out.println("\nNome do Cavalo: "+getNome()+"\nIdade do cavalo: "+getIdade()+" anos\nO som que o cavalo emite é: "
	+getSom()+"\nO cavalo pode correr até: "+correr);
	}

}
