package oo.heranca.desafio.resposta;

public class Ferrari extends Carro{

		Ferrari(){
			super(315);
		}
		
		Ferrari(int velocidadeMaxima){
			super(velocidadeMaxima);
			delta = 350;
		}
		
//		@Override //efeito de valida��o o eclipse vai verificar se vc est� mesmo sobrescrevendo o m�todo
//		void acelerar() {
//			super.acelerar();
//		}
	}
