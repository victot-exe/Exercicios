package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingredienteUm = new Arroz(0.2);
		Feijao ingredienteDois = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingredienteUm);		
		convidado.comer(ingredienteDois);		
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		convidado.comer(sobremesa);		
		
		System.out.println(convidado.getPeso());
	}
}