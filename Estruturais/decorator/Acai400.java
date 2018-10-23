package decorator;

public class Acai400 implements Acai{
	
	String descricao;
	int preco;

	@Override
	public String getDescricao() {
		return "Acai de 400ml";
	}

	@Override
	public double calculaPreco() {
		return 4.00;
	}

}
