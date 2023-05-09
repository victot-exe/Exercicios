package oo.heranca.desafio;

public class Carro {
	
	double velocidadeAtual;
	
	boolean acelerar() {
		this.velocidadeAtual += 5;
		return true;
	}
	
	boolean frear() {
		if(0 < this.velocidadeAtual) {
			this.velocidadeAtual = this.velocidadeAtual - 5;
			return true;
		}else {
			this.velocidadeAtual = 0;
			System.out.println("Velocidade atual é 0.0 km/h");
			return false;
		}
	}

}
