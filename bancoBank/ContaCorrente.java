package bancoBack_composto;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorComJuros = valor + 0.2;
		if (super.saldo >= valorComJuros) {
			super.saldo -= valorComJuros;
			System.out.println("Saque realizado com sucesso. Novo saldo da conta: R$" + super.saldo);
			return true;
		} else {
			System.out.println(
					"Você não possui saldo suficiente para realizar essa operação. Saldo disponivel R$" + super.saldo);
			return false;
		}
	}
	
	@Override
	public double getValorImposto() {
		if(super.saldo >= 140) {
			return super.saldo * 0.05;
		}else {
			System.out.println("Valor informado não é debitado impostos da Conta Corrente.");
			return 0;
		}
			
	}

}
