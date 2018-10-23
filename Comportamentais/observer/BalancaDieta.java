package observer;

public class BalancaDieta implements Observer{

	@Override
	public void update(double novoPeso) {
		if(novoPeso >=100) {
			System.out.println("Foda-se o seu peso, seja feliz!");
		}
	}

	
}
