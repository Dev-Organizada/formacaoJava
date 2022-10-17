package bancoBack_composto;

public class CriaClienteEConta {

	public static void main(String[] args) {
		Cliente primeiroCliente = new Cliente();

		primeiroCliente.setNome("Nathaly Rodrigues");
		primeiroCliente.setCpf("012.345.678-90");
		primeiroCliente.setProfissao("Analista de Desenvolvimento Oracle");

		Cliente segundoCliente = new Cliente();

		segundoCliente.setNome("Igor Souza");
		segundoCliente.setCpf("210.543.876-09");
		segundoCliente.setProfissao("Analista de Teste");

		Conta conta1 = new Conta(01, 1234);
		Conta conta2 = new Conta(01, 5678);

		conta1.setTitular(primeiroCliente);
		conta2.setTitular(segundoCliente);

		System.out.println("Titular da conta 1: " + conta1.getTitular().getNome() + " - Agencia: " + conta1.getAgencia()
				+ " - Conta: " + conta1.getNumero());

		System.out.println("Titular da conta 2: " + conta2.getTitular().getNome() + " - Agencia: " + conta2.getAgencia()
				+ " - Conta: " + conta2.getNumero());

		conta1.deposita(1000);
		// conta1.saca(10);
		// conta1.getSaldo();

		conta2.deposita(50);

		conta1.transfere(350, conta2);

		System.out.println("Total de contas criadas: " + Conta.getTotal());

	}

}
