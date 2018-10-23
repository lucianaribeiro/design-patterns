package decorator;

public class Morango extends ComplementoDecorator{
	
	public Morango(Acai acai) {
		this.acai = acai;
	}
	

	@Override
	public String getDescricao() {
		return acai.getDescricao() + " com morango";
	}

	@Override
	public double calculaPreco() {
		return acai.calculaPreco() + 0.50;
	}

}
