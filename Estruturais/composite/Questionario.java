package composite;

public abstract class Questionario {
	
	public Questionario(){}
	
	public int numero;
	public String titulo;
	
	public abstract void add(Lista elemento);
	public abstract void remove(Questionario elemento);
	public abstract void getChild();
	
	public abstract void exibir();
	
}
