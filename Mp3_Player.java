  package Assignment;

public class Mp3_Player {
    private boolean isOff;
    private boolean isOn;
    private MusicState musicState;
    private Volume volume;
    private Playlist playlists = new Playlist();
    //private boolean playmusic;

    public boolean isOff() {
        return false;
    }

    public boolean isOn() {
        return true;
    }

    public boolean playMusic(){
        return true;
    }

    public Playlist getPlaylists(){
        return playlists;
    }

}
