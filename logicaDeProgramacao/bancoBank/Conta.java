public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

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
}
