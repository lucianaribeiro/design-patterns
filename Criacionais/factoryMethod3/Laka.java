package factoryMethod3;

public class Laka extends Doce{
	
	public Laka(String tipo) {
		this.tipo = tipo;
		
		if(tipo.equals("B"))
			System.out.println("Marca: Laka \nTipo: Branco");
		
		else if (tipo.equals("P"))
			System.out.println("Marca: Laka \nTipo: Preto");
	}
}
