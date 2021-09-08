package OrientacaoPOO;

public class Eletronico {
	private String celular;
	private String computador;
	private String som;
	private String televisao;

	public Eletronico(String celular,String computador,String som, String televisao) {
		this.celular= celular;
		this.computador= computador;
		this.som= som;
		this.televisao = televisao;
	}
	public void imprimir()
	{
		System.out.println("\nMeu celular é um: "+celular+"\nMeu computador é um "+computador+"\nEu tenho um "+som+"\nMinha Tv é "+televisao);
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getComputador() {
		return computador;
	}

	public void setComputador(String computador) {
		this.computador = computador;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getTelevisao() {
		return televisao;
	}

	public void setTelevisao(String televisao) {
		this.televisao = televisao;
	}
	
	{
		
	}
}
