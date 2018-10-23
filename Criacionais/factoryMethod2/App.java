package factoryMethod2;

public class App {

	public static void main(String[] args) {
		MaquinaDeBebidas maquina = new MaquinaDeCafe();
		maquina.entregaBebida();
		maquina = new MaquinaDeRefrigerante();
		maquina.entregaBebida();
		
	}
}
