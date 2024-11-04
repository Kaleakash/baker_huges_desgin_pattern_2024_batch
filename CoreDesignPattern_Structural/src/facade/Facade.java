package facade;

interface MediaPlayer {
	public void play();
	public void stop();
	public void pause();
}
class FileLoader {
	public void loadFile() {
		System.out.println("File loading....");
	}
	public void unLoadFile() {
		System.out.println("File Unloading...");
	}
}
class Decoder {
	public void decode() {
		System.out.println("Decoding File...");
	}
}
class Sound {
	public void on() {
		System.out.println("Sound is coming...");	
	}
	public void off() {
		System.out.println("It is slient now....");
	}
}
class MediaPlayerFacade implements MediaPlayer {
	FileLoader fl = null;
	Sound ss = null;
	Decoder dr = null;
	public void play() {
		fl = new FileLoader();
		fl.loadFile();
		dr = new Decoder();
		dr.decode();
		ss = new Sound();
		ss.on();
	}
	public void pause() {
		ss.off();
	}
	public void stop() {
		ss.off();
		fl.unLoadFile();
	}

}	
public class Facade {
	public static void main(String args[]) {
	MediaPlayer mp = new MediaPlayerFacade();
	mp.play();
	mp.stop();
	}
}
