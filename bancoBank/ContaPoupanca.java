package bancoBack_composto;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Novo saldo da conta: R$" + super.saldo);
			return true;
		} else {
			System.out.println(
					"Você não possui saldo suficiente para realizar essa operação. Saldo disponivel R$" + super.saldo);
			return false;
		}
	}

}
