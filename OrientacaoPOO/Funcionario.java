package OrientacaoPOO;

public class Funcionario {
	private String nome;
	private String genero;
	private String setor;
	private String cargo;
	
	public Funcionario(String nome, String genero, String setor,String cargo)
	{
		this.setNome(nome);
		this.setGenero(genero);
		this.setSetor(setor);
		this.setCargo(cargo);
	}
	public void imprimir() {
		System.out.println("\nNome: " +this.nome+ "\nGenero: " +this.genero+ "\nSetor: " +this.setor+ "\nCargo: " +this.cargo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	{
		
	}

}
