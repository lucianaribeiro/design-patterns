package adapter;

public class AdapterTomada extends TomadaDoisPinos{
	
	private TomadaTresPinos tomadaTresPinos;
	
	public AdapterTomada(TomadaTresPinos tomadaTresPinos) {
		this.tomadaTresPinos = tomadaTresPinos;
	}
	
	public void ligarNaTomadaDeDoisPinos() {
		tomadaTresPinos.ligarNaTomadaDeTresPinos();
	}
	
}
