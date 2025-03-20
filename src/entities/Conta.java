package entities;

public class Conta {
	private int contaNumero;
	private String agencia;
	private String nomeCliente;
	private double saldo;
	
	public Conta(int contaNumero, String agencia, String nomeCliente, double saldo) {
		this.contaNumero = contaNumero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Olá " + this.nomeCliente 
				+ " obrigado por criar uma conta em nosso banco, sua agência é "
				+ this.agencia + ", conta " + this.contaNumero + " e seu saldo "
				+ String.format("%.2f", this.saldo) + " já está disponível para saque.";
	}

}
