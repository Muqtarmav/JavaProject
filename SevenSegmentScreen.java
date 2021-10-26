package Assignment;
import java.util.Scanner;
public class SevenSegmentScreen {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        SevenSegment segment = new SevenSegment();
        System.out.println("enter 8 number");
        String UserInput = input.nextLine();
        segment.setSevenSegmentScreen(UserInput);
        segment.displayScreen();


    }
}
