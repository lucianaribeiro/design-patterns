package proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("teste.png");
		
		image.display();
		
		image.display();

	}

}
