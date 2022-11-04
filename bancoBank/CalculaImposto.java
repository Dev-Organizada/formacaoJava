package bancoBack_composto;

public class CalculaImposto {
	
	private double totalImposto;
	
	public void calcularValores(Tributavel valor) {
		totalImposto += valor.getValorImposto();
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
