package OrientacaoPOO;

public class Patinete {
	private String modeloPatinete;
	private String cor;

	public Patinete(String modeloPatinete, String cor) 
	{
		this.setModeloPatinete(modeloPatinete);
		this.setCor(cor);
	}
	public void imprimir() {
		System.out.println("\nModelo do patinete: " +this.modeloPatinete+ ", Cor do patinete: " +this.cor);
	}
	public String getModeloPatinete() {
		return modeloPatinete;
	}
	public void setModeloPatinete(String modeloPatinete) {
		this.modeloPatinete = modeloPatinete;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	

}
