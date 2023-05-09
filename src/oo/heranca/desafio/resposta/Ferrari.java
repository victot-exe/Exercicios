package oo.heranca.desafio.resposta;

public class Ferrari extends Carro{
	
	@Override //efeito de validação o eclipse vai verificar se vc está mesmo sobrescrevendo o método
	void acelerar() {
		this.velocidadeAtual += 15;
	}
}
