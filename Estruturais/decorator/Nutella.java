package decorator;

public class Nutella extends ComplementoDecorator{
	
	public Nutella(Acai acai) {
		this.acai = acai;
	}

	@Override
	public String getDescricao() {
		return acai.getDescricao() + " com nutella";
	}

	@Override
	public double calculaPreco() {
		return acai.calculaPreco() + 1.00;
	}

}
