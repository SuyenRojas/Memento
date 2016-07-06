
public class Radio {

	public static void main(String[] args) {
		SongsOf70s songs70s = new SongsOf70s();
		SongsOf80s songs80s = new SongsOf80s();
		SongsOf90s songs90s = new SongsOf90s();
		DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);
		madMike.showTheSongs();
	}

}
