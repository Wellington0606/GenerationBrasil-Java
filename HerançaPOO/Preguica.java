package Heran�aPOO;

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
			System.out.println("\nNome do bicho Pregui�a �: "+getNome()+"\nIdade da Pregui�a: "+getIdade()+" anos\nO som que a Pregui�a emite �: "
		+getSom()+"\nO Bicho Pregui�a gosta de ficar em "+subirArvores);
		}

	}
	

