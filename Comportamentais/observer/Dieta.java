package observer;

public class Dieta extends Subject{
	
	private double peso;	
	
	public void setPeso(double peso) {
		this.peso = peso;
		this.notifyObserver();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer ob: observers) {
			System.out.println("Notificando observadores");
			System.out.println("Peso " + peso );
			ob.update(this.peso);
		}
		
	}

}
