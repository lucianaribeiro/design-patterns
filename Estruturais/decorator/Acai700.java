package decorator;

public class Acai700 implements Acai{
	
	String descricao;
	int preco;

	@Override
	public String getDescricao() {
		return "Acai de 700ml";
	}

	@Override
	public double calculaPreco() {
		return 6.00;
	}

}
