package OrientacaoPOO;

public class ContaBancaria {
	private String nomedoCliente;
	private int agencia;
	private int conta;
	private double cpf;
	
	public ContaBancaria(String nomedoCliente, int agencia, int conta,double cpf)
	{
		this.setNomedoCliente(nomedoCliente);
		this.setAgencia(agencia);
		this.setConta(conta);
		this.setCpf(cpf);
	}
	public void imprimir() {
		System.out.println("\nCliente: " +this.nomedoCliente+ "\nAgência: " +this.agencia+ "\nConta: " +this.conta+ "\nCPF: " +this.cpf);
	}
	public String getNomedoCliente() {
		return nomedoCliente;
	}
	public void setNomedoCliente(String nomedoCliente) {
		this.nomedoCliente = nomedoCliente;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

}
