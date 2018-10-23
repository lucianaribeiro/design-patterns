package composite;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Client client = new Client();
		List<Questionario> elemento = new ArrayList<Questionario>();
		
		elemento.add(client.addBloco("Matematica"));
		elemento.add(client.addLista("Geometria"));
		elemento.add(client.addQuestao("Questao A"));
		elemento.add(client.addQuestao("Questao B"));
		elemento.add(client.addLista("Aritmetica"));
		
		elemento.add(client.addBloco("Geografia"));
		
		System.out.println("---------------");
		
		client.exibirLista(elemento);
	}

}
