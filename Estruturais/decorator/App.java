package decorator;

public class App {

	public static void main(String[] args) {
		Acai acai = new Acai350();
		
		acai = new Morango(acai);
		System.out.println(acai.getDescricao() + " R$ " + acai.calculaPreco());
		
		acai = new Acai400();
		acai = new Nutella(acai);		
		System.out.println(acai.getDescricao() + " R$ " + acai.calculaPreco());
		
		acai = new Acai700();
		acai = new Nutella(acai);
		acai = new Morango(acai);		
		System.out.println(acai.getDescricao() + " R$ " + acai.calculaPreco());
	}

}
