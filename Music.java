package Assignment;

public class Music {
    private String trackName;
    private int trackNumber;
    private int length;


    public void setTrackName(String trackName){
        this.trackName = trackName;
    }

    public void setTrackNumber(int trackNumber){
        this.trackNumber = trackNumber;
    }

    public int getTrackNumber(){
        return trackNumber;
    }

    public void setLength(int length){
    if ( length < 59 ){
        this.length = length;
    }
    }

    public int getLength(){
        return length;
    }

}
