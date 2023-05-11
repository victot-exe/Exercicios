package oo.heranca.desafio.resposta;

public class Carro {
	
	final int VELOCIDADE_FINAL;
	int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_FINAL = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_FINAL) {
			velocidadeAtual = VELOCIDADE_FINAL;
		}else {
			velocidadeAtual += delta;
		}
	}
	
	void frear () {
		if(velocidadeAtual >= 5){
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {//toString precisa obrigatoriamente ser public
		return "Velocidade atual é => " + velocidadeAtual + " km/h";
	}
}
