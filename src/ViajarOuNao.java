import java.util.Scanner;

public class ViajarOuNao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Foi efetivado? (true ou false): ");
		
		boolean efetivado = entrada.nextBoolean();
		
		if(efetivado) {
			System.out.println("Vou ai te ver meu amor!!!");
		}else {
			System.out.println("Não vou ai te ver maaaaas, essa tela nao vai aparecer"); 
		}

		entrada.close();
		
		
	}

}
