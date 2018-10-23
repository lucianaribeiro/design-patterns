package factoryMethod3;

public class Garoto extends Doce{
	
	public Garoto(String tipo) {
		this.tipo = tipo;
		
		if(tipo.equals("B"))
			System.out.println("Marca: Garoto \nTipo: Branco");
		
		else if (tipo.equals("P"))
			System.out.println("Marca: Garoto \nTipo: Preto");
	}

}
