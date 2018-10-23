package decorator;

public abstract class ComplementoDecorator implements Acai{
	
	public Acai acai;
	
	public abstract String getDescricao();
	
	public abstract double calculaPreco();
	

}
