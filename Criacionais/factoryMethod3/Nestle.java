package factoryMethod3;

public class Nestle extends Doce{
	
	public Nestle(String tipo) {
		this.tipo = tipo;
		
		if(tipo.equals("B"))
			System.out.println("Marca: Nestle \nTipo: Branco");
		
		else if (tipo.equals("P"))
			System.out.println("Marca: Nestle \nTipo: Preto");
	}
}
