package sintaxe_variavel_fluxo;

public class EnumTest {
	DaysOfWeek day;
	
	//Criação do construtor da classe
	public EnumTest(DaysOfWeek day) {
		this.day = day;
	}
	
	//Criação do método para usar a lista do enum
	public void listOfDays() {
		switch(day) {
		case DOMINGO:
			System.out.println("Dia de planejamento e descanso");
			break;
		
		case SEGUNDA:
			System.out.println("Dia de colocar os planos em ação.");
			break;
			
		case TERCA:
			System.out.println("Um pouco mais de ação.");
			break;
			
		case QUARTA:
			System.out.println("Aguenta firme que ainda é metade da semana.");
			break;
			
		case QUINTA:
			System.out.println("Persista, nem que seja na força do ódio.");
			break;
			
		case SEXTA:
			System.out.println("Melhor dia da semana. ");
			break;
			
		case SABADO:
			System.out.println("Dia de faxina.");
			break;	
			
		default:
			System.out.println("Um dia qualquer.");
			break;
		}
	}

	public static void main(String[] args) {
		
		//Instanciando a classe de teste 
		EnumTest firstDay = new EnumTest(DaysOfWeek.DOMINGO);
		firstDay.listOfDays();
		
		EnumTest fifthDay = new EnumTest(DaysOfWeek.QUINTA);
		fifthDay.listOfDays();

	}

}
