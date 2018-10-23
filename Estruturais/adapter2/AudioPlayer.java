package adapter2;

public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter mediaAdapter;

	@Override
	public void play(String fileType) {
		if(fileType.equalsIgnoreCase("mp3")){
			System.out.println("Tocou MP3!");
		}
		else if(fileType.equalsIgnoreCase("vlc") || fileType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(fileType);
			mediaAdapter.play(fileType);			
		}
		else {
			System.out.println("Ivalid media type");
		}
	}

}
