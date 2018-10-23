package facade;

public class Cpu {
	public void start() {
		System.out.println("Inicialização inicial");
	}
	
	public void execute() {
		System.out.println("Executa algo no processador");
	}
	
	public void load() {
		System.out.println("Carrega registrador");
	}
	
	public void free() {
		System.out.println("Libera registradores");
	}
}
