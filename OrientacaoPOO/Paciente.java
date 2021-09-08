package OrientacaoPOO;

public class Paciente {
		private String nome;
		private String genero;
		private String quarto;
		private String doenca;
		
		public Paciente(String nome, String genero, String quarto,String doenca)
		{
			this.setNome(nome);
			this.setGenero(genero);
			this.setQuarto(quarto);
			this.setDoenca(doenca);
		}
		public void imprimir() {
			System.out.println("\nNome: " +this.nome+ "\nGenero: " +this.genero+ "\nQuarto: " +this.quarto+ "\nDoença: " +this.doenca);
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
		public String getQuarto() {
			return quarto;
		}
		public void setQuarto(String quarto) {
			this.quarto = quarto;
		}
		public String getDoenca() {
			return doenca;
		}
		public void setDoenca(String doenca) {
			this.doenca = doenca;
		}

}
