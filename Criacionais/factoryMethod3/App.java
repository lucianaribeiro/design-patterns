package factoryMethod3;

public class App {

	public static void main(String[] args) {
		MaquinaDeDoce maquina = new MaquinaDeDoce();
		maquina.getDoce("L","P");
		maquina.getDoce("L","B");
		
		System.out.println();
		
		maquina.getDoce("N","P");
		maquina.getDoce("N","B");
		
		System.out.println();
		
		maquina.getDoce("G","P");
		maquina.getDoce("G","B");
	}

}
