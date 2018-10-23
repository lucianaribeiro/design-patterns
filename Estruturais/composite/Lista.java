package composite;

import java.util.ArrayList;
import java.util.List;

public class Lista extends Bloco{
		
	public List<Questao> lista = new ArrayList<Questao>();

	public void add(Questao questao) {
		this.lista.add(questao);
	}

	public void remove(Questao questao) {
		this.lista.remove(questao);
		
	}

	@Override
	public void exibir() {
		System.out.println("-- Lista " + titulo);
		for(Questao lista : this.lista) {
			lista.exibir();
			System.out.println(lista.titulo + "aqui");
		}
	}

	@Override
	public void getChild() {
		
	}
	
	

}
