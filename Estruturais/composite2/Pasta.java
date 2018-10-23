package composite2;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Arquivo{
	
	List<Arquivo> arquivos = new ArrayList<Arquivo>();

	@Override
	public void add(Arquivo arquivo) {
		arquivos.add(arquivo);		
	}

	@Override
	public void remove(Arquivo arquivo) {
		for(Arquivo a: this.arquivos) {
			if(arquivo.titulo.equalsIgnoreCase(a.titulo)) {
				arquivos.remove(arquivo);						
			}
		}
	}

	@Override
	public void exibir() {
		for(Arquivo a : this.arquivos) {
			a.exibir();
		}
	}

	@Override
	public Arquivo getArquivo(String nomeArquivo) {
		for(Arquivo a: this.arquivos) {
			if(nomeArquivo.equalsIgnoreCase(a.titulo)) {
				return a;
			}
		}
		return null;
	}
	

}
