import java.util.ArrayList;
import java.util.Iterator;

public class SongsOf70s implements SongIterator{

	ArrayList<SongInfo> bestSongs;

	public SongsOf70s() {
		bestSongs = new ArrayList<>();
		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1971);
		addSong("I Will Survive", "Gloria Gaynor", 1979);
	}

	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs.add(songInfo);
	}

	@Override
	public Iterator crearIterador() {
		return bestSongs.iterator();
	}


}
