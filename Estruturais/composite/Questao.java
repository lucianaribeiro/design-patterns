package composite;

public class Questao extends Bloco{
	
	public String questao;
	
	public Questao(String questao) {
		this.questao = questao;
	}

	
	public void exibir() {
		System.out.println("--- " + questao);
		
	}

}
