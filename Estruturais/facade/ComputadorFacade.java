package facade;

public class ComputadorFacade {
	private Cpu cpu;
	private Memoria memoria;
	private HardDrive hardDrive;
	
	public ComputadorFacade() {
		cpu = new Cpu();
		memoria = new Memoria();
		hardDrive = new HardDrive();
	}
	
	public void ligarPC() {
		cpu.start();
		cpu.execute();
	}
}
