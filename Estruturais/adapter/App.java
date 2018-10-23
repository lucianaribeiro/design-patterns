package adapter;

public class App {

	public static void main(String[] args) {
		TomadaTresPinos t3 = new TomadaTresPinos();
		
		AdapterTomada a = new AdapterTomada(t3);
		a.ligarNaTomadaDeDoisPinos();
	}

}
