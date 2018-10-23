package decorator;

public class Acai350 implements Acai{
	
	String descricao;
	int preco;

	@Override
	public String getDescricao() {
		return "Acai de 350ml";
	}

	@Override
	public double calculaPreco() {
		return 2.00;
	}

}
