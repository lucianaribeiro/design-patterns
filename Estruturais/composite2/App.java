package composite2;

public class App {

	public static void main(String[] args) {
		Pasta pasta = new Pasta();
		Video video = new Video();
		Imagem imagem = new Imagem();
		Texto texto = new Texto();
		
		video.titulo = "Toy Story";
		imagem.titulo = "Carrosel";
		texto.titulo = "Cronicas";
		
		
		pasta.add(video);
		pasta.add(imagem);
		pasta.add(texto);
		pasta.exibir();
		
		
	}

}
