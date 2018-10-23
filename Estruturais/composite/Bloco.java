package composite;

import java.util.ArrayList;
import java.util.List;

public class Bloco extends Questionario {
	
	public List<Lista> bloco = new ArrayList<Lista>();

	public void add(Lista lista) {
		bloco.add(lista);
	}

	@Override
	public void remove(Questionario elemento) {
		bloco.remove(elemento);
	}
 
	public void exibir() {		
		System.out.println("- Bloco " + titulo);
		for(Lista bloco: this.bloco) {
			bloco.exibir();
		}
	}

	@Override
	public void getChild() {
		// TODO Auto-generated method stub
		
	}

}
