import java.util.Iterator;

public class DiscJockey {
	SongsOf70s songs70s;
	SongsOf80s songs80s;
	SongsOf90s songs90s;
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
		iter70sSongs = newSongs70s;
		iter80sSongs = newSongs80s;
		iter90sSongs = newSongs90s;
	}
			
	public void showTheSongs(){
		
		System.out.println("NEW WAY WITH ITERATOR\n");
		Iterator Songs70s = iter70sSongs.crearIterador();
		Iterator Songs80s = iter80sSongs.crearIterador();
		Iterator Songs90s = iter90sSongs.crearIterador();
		
		System.out.println("\nSongs of the 70s\n");
		printTheSongs(Songs70s);
		
		System.out.println("\nSongs of the 80s\n");
		printTheSongs(Songs80s);
		
		System.out.println("\nSongs of the 90s\n");
		printTheSongs(Songs90s);	
	}
	
	public void printTheSongs(Iterator iterator){
		while(iterator.hasNext()){
			SongInfo songInfo = (SongInfo) iterator.next();
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBand());
			System.out.println(songInfo.getSongYear());	
		}	
	}
}
