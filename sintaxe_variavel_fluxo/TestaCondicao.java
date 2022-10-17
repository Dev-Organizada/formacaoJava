package sintaxe_variavel_fluxo;

public class TestaCondicao {
	public static void main(String[] args) {
		int idade = 18;
		boolean acompanhado = true;

		if (idade >= 18 && acompanhado) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("Entrada negada.");
		}
	}

}
