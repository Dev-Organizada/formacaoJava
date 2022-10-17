package sintaxe_variavel_fluxo;

public class ValorIR {
	public static void main(String[] args) {
		double salario = 1212.00;
		double descontoIR;
		double salarioLiquido;

		if (salario <= 2800.00) {
			descontoIR = salario * 0.075;
		} else if (salario <= 3751.00) {
			descontoIR = salario * 0.15;
		} else {
			descontoIR = salario * 0.225;
		}
		
		salarioLiquido = salario - descontoIR;
		
		System.out.println("Valor do salario informado: " + salario);
		System.out.println("Valor de desconto do IR em folha de pagamento: " + descontoIR);
		System.out.println("Valor do salario liquido: " + salarioLiquido);
	}

}
