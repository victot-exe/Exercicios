package oo.heranca.desafio.resposta;

public class Carro {
	
	int velocidadeAtual;
	
	void acelerar() {
		this.velocidadeAtual += 5;
	}
	
	void frear () {
		if(this.velocidadeAtual >= 5){
			this.velocidadeAtual -= 5;
		}else {
			this.velocidadeAtual = 0;
		}
	}
	
	public String toString() {//toString precisa obrigatoriamente ser public
		return "Velocidade atual é => " + this.velocidadeAtual + " km/h";
	}
}
