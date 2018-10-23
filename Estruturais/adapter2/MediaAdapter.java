package adapter2;

public class MediaAdapter implements MediaPlayer{
	
	private AdvancedMediaPlayer advanced;
	
	public MediaAdapter(String fileType) {
		
		if(fileType.equals("vlc")) {
			advanced = new VclPlayer();
		}
		else if(fileType.equals("mp4")) {
			advanced = new Mp4Player();
		}
	}

	@Override
	public void play(String fileType) {
		if(fileType.equals("vlc")) {
			advanced.playVlc();
		}
		else if(fileType.equals("mp4")) {
			advanced.playMpt4();
		}
	}

}
