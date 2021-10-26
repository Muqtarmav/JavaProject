package Assignment;

public class Volume {
    private int volume = 5;

    public void increaseVolume() {
        if (volume > 100) {
//            throw new IllegalArgumentException("volume is out of range");
            volume = 100;
        } else {
            volume = volume + 5;
        }
    }

    public void decreaseVolume(){
        if(volume < 0){
//            throw new IllegalArgumentException("volume cant decrease beyond 0");
            volume = 0;
        } else {
            volume = volume - 5;
        }
    }

    public int getVolume(){
        return volume;
    }

//    public int getDecreaseVolume(){
//        return volume;
//    }
}
