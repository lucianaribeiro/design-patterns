package composite;

import java.util.List;

public class Client {
	
	public Questao addQuestao(String titulo) {
		Questao questao = new Questao(titulo);		
		questao.titulo = titulo;
		return questao;
	}
	
	public Lista addLista(String titulo) {
		Lista lista = new Lista();
		lista.titulo = titulo;
		return lista;		
	}
	
	public Bloco addBloco(String titulo) {
		Bloco bloco = new Bloco();
		bloco.titulo = titulo;
		return bloco;
	}
	
	public void exibirLista(List<Questionario> elemento) {
		for(Questionario q : elemento) {
			q.exibir();
		}
	}

}
