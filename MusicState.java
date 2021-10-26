package Assignment;
import java.util.Scanner;

public class MusicState {
    private boolean playMusic;
    private boolean pauseMusic;
    private int nextMusic = 1;
    private int previousMusic = -1;
    private int playRandom;


    public boolean getPauseMusic(){
        return true;
    }


    public void setNextMusic() {
        if (nextMusic > 1) ;
        nextMusic = nextMusic + 1;
    }

    public int getNextMusic(){
        return nextMusic;
    }


    public void setPreviousMusic() {
        if (    previousMusic < 1) ;
        previousMusic = previousMusic - 1;
    }


    public int getPreviousMusic(){
        return previousMusic;
    }

   // public void setPlayRandom(int random){
        //if (nextMusic > 2){

        }

