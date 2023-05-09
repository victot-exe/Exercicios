package oo.heranca.desafio;

public class Teste {
	
	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Carro ferrari = new Ferrari();
		
		civic.acelerar();
		System.out.println("Velocidade atual do Civic � => " + civic.velocidadeAtual);
		civic.acelerar();
		System.out.println("Velocidade atual do Civic � => " + civic.velocidadeAtual);
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.frear();
		System.out.println("Velocidade atual do Civic � => " + civic.velocidadeAtual);
		civic.frear();
		System.out.println("Velocidade atual do Civic � => " + civic.velocidadeAtual);
		
		System.out.println(civic.velocidadeAtual);
		
		civic.frear();
		civic.frear();
		
		System.out.println("Velocidade atual da Ferrari => " + ferrari.velocidadeAtual + " km/h");
		System.out.println("Velocidade atual do Civic => " + civic.velocidadeAtual + " km/h");
	}
}
