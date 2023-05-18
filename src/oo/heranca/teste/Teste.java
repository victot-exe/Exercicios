package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Teste {
	
	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Carro ferrari = new Ferrari();
		
		civic.acelerar();
		System.out.println("Velocidade atual do Civic é => " + civic.velocidadeAtual);
		civic.acelerar();
		System.out.println("Velocidade atual do Civic é => " + civic.velocidadeAtual);
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.frear();
		System.out.println("Velocidade atual do Civic é => " + civic.velocidadeAtual);
		civic.frear();
		System.out.println("Velocidade atual do Civic é => " + civic.velocidadeAtual);
		
		System.out.println(civic.velocidadeAtual);
		
		civic.frear();
		civic.frear();
		
		System.out.println("Velocidade atual da Ferrari => " + ferrari.velocidadeAtual + " km/h");
		System.out.println("Velocidade atual do Civic => " + civic.velocidadeAtual + " km/h");
	}
}
