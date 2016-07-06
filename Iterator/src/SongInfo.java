
public class SongInfo {
	
	private String songName;
	private int songYear;
	private String band;
	
	public SongInfo(String songName, String band, int year) {
		this.band= band;
		this.songName = songName;
		this.songYear= year;
	}

	public String getSongName() {
		return songName;
	}

	public int getSongYear() {
		return songYear;
	}

	public String getBand() {
		return band;
	}
	
	

}
