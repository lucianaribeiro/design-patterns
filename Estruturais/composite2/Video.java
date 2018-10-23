package composite2;

public class Video extends Arquivo{

	@Override
	public void add(Arquivo arquivo) {}

	@Override
	public void remove(Arquivo arquivo) {}

	@Override
	public void exibir() {
		System.out.println("Video " + titulo);		
	}

	@Override
	public Arquivo getArquivo(String nomeArquivo) {
		return null;
	}


}
