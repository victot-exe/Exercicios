package oo.heranca.desafio.resposta;

public class Ferrari extends Carro{
	
	@Override //efeito de valida��o o eclipse vai verificar se vc est� mesmo sobrescrevendo o m�todo
	void acelerar() {
		this.velocidadeAtual += 15;
	}
}
