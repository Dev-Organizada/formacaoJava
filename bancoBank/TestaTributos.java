package bancoBack_composto;

public class TestaTributos {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(12, 2525);
		c1.deposita(130);
		
		SeguroDeVida seg = new SeguroDeVida();
		
		CalculaImposto cal = new CalculaImposto();
		cal.calcularValores(c1);
		cal.calcularValores(seg);
		
		System.out.println("Total de impostos a pagar: R$" + cal.getTotalImposto());
	}

}
