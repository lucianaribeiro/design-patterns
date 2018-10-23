package adapter2;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc() {}

	@Override
	public void playMpt4() {
		System.out.println("Tocou MP4!");
	}

}
