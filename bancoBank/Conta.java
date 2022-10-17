package bancoBack_composto;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}

	public void deposita(double valor) {
		saldo += valor;
		System.out.println("Deposito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + this.saldo);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Novo saldo da conta: R$" + this.saldo);
			return true;
		} else {
			System.out.println(
					"Você não possui saldo suficiente para realizar essa operação. Saldo disponivel R$" + this.saldo);
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Transferencia realizada com sucesso. Novo saldo da conta Origem: R$" + this.saldo
					+ " Novo saldo da conta Destino: R$" + destino.saldo);
			return true;
		} else {
			System.out.println(
					"Você não possui saldo suficiente para realizar essa operação. Saldo disponivel R$" + this.saldo);
			return false;
		}

	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		System.out.println("Saldo disponivel: R$" + this.saldo);
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero não pode ser negativo ou 0.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia não pode ser negativo ou 0.");
			return;
		}
		this.agencia = agencia;
	}

	public static int getTotal() {
		return total;
	}
}
