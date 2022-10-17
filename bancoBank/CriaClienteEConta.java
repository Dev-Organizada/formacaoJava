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

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.setTitular(primeiroCliente);
		conta1.deposita(1000);
		//conta1.saca(10);
		//conta1.getSaldo();
		
		
		conta2.setTitular(segundoCliente);
		conta2.deposita(50);

		conta1.transfere(350, conta2);
		
		System.out.println(conta1.getTitular().getNome());
		System.out.println(conta2.getTitular().getNome());

	}

}
