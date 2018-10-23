package observer;

public class App {

	public static void main(String[] args) {
		BalancaDieta balanca = new BalancaDieta();
		Dieta dieta = new Dieta();
		
		dieta.addObserver(balanca);
		dieta.setPeso(150);
		
	}

}
