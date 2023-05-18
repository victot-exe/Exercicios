package oo.heranca.desafio.resposta;

public class Ferrari extends Carro{

		Ferrari(){
			super(315);
		}
		
		Ferrari(int velocidadeMaxima){
			super(velocidadeMaxima);
			delta = 350;
		}
		
//		@Override //efeito de validação o eclipse vai verificar se vc está mesmo sobrescrevendo o método
//		void acelerar() {
//			super.acelerar();
//		}
	}
