package factoryMethod;

public class App {

	public static void main(String[] args) {
		FactoryPessoa fabrica = new FactoryPessoa();
		String nome = "Luciana";
		String sexo = "F";
		
		fabrica.getPessoa(nome, sexo);
	}

}
