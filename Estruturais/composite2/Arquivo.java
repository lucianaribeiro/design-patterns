package composite2;

public abstract class Arquivo {
	
	public String titulo;
	
	public abstract void add(Arquivo arquivo);
	public abstract void remove(Arquivo arquivo);
	public abstract void exibir();
	public abstract Arquivo getArquivo(String nomeArquivo);
	public String getNomeArquivo(String nome) {
		return nome;
	}
}
