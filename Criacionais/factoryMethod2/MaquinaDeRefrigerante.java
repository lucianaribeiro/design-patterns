package factoryMethod2;

public class MaquinaDeRefrigerante extends MaquinaDeBebidas{

	@Override
	public Bebida entregaBebida() {
		return new Refrigerante();
	}

}
