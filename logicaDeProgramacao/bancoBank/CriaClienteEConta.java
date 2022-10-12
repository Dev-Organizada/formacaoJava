public class CriaClienteEConta {

	public static void main(String[] args) {
		Cliente primeiroCliente = new Cliente();

		primeiroCliente.nome = "Nathaly Rodrigues";
		primeiroCliente.cpf = "012.345.678-90";
		primeiroCliente.profissao = "Analista de Desenvolvimento Oracle";

		Cliente segundoCliente = new Cliente();

		segundoCliente.nome = "Igor Souza";
		segundoCliente.cpf = "210.543.876-09";
		segundoCliente.profissao = "Analista de Teste";

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.saldo = 5;
		conta1.deposita(1000);
		conta1.saca(10);
		conta1.titular = primeiroCliente;

		conta2.titular = segundoCliente;

		conta1.transfere(350, conta2);

		System.out.println(conta1.titular.nome);
		System.out.println(conta2.titular.nome);

	}

}
