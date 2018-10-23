package adapter2;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("vlc");
		audioPlayer.play("mp4");
		audioPlayer.play("mp3");
		audioPlayer.play("avi");
	}

}
