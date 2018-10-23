package factoryMethod2;

public abstract class MaquinaDeBebidas {
	
	public abstract Bebida entregaBebida();
	
	public String exibeMensagem() {
		return "Bem-vindo à máquina de bebidas";
	}
}
