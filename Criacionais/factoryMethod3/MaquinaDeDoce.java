package factoryMethod3;

public class MaquinaDeDoce {
	
	public Doce getDoce(String marca, String tipo) {
		if(marca.equals("L"))
			return new Laka(tipo);
		
		else if (marca.equals("N"))
			return new Nestle(tipo);
		
		else if (marca.equals("G"))
			return new Garoto(tipo);
		
		else 
			return null;
	}

}
