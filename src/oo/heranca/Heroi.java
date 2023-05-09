package oo.heranca;

public class Heroi extends Jogador {//extends é para estender a classe
	
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);//super é a palavra reservada para herdar os atributos e métodos do "pai"
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
