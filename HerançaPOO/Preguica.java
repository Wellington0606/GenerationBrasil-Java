package HerançaPOO;

public class Preguica extends Animal {
	private String subirArvores;
	
	public Preguica(String nome, int idade, String som, String subirArvores)
	{
		super(nome,idade,som);
		this.subirArvores = subirArvores;
		}
		public String getSubirArvores() {
		return subirArvores;
	}
	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}
		public void imprimir()
		{
			System.out.println("\nNome do bicho Preguiça é: "+getNome()+"\nIdade da Preguiça: "+getIdade()+" anos\nO som que a Preguiça emite é: "
		+getSom()+"\nO Bicho Preguiça gosta de ficar em "+subirArvores);
		}

	}
	

