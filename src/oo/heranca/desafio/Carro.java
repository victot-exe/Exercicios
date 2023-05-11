package oo.heranca.desafio;

public class Carro {
	
	final double VELOCIDADE_MAXIMA;
	double velocidadeAtual;
	int delta = 5;
	
	
	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	Carro(){
		this(250);
	}
	
	boolean acelerar() {
		
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = VELOCIDADE_MAXIMA;
			return false;
		}else {
			this.velocidadeAtual += delta;
			return true;
		}
	}
	
	boolean frear() {
		if(0 < this.velocidadeAtual) {
			this.velocidadeAtual = this.velocidadeAtual - 5;
			return true;
		}else {
			this.velocidadeAtual = 0;
			System.out.println("Velocidade atual � 0.0 km/h");
			return false;
		}
	}

}
