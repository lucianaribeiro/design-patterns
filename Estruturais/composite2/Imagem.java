package composite2;

public class Imagem extends Arquivo{

	@Override
	public void add(Arquivo arquivo) {}

	@Override
	public void remove(Arquivo arquivo) {}

	@Override
	public void exibir() {
		System.out.println("Imagem " + titulo);		
	}

	@Override
	public Arquivo getArquivo(String nomeArquivo) {
		return null;
	}

}
