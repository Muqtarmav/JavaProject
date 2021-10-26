package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Questionnaire {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[20];
        String[] response = new String[20];
        String answer;
        // int total = 0;
        //int countA = 0;
        //    response = new char[array.length];       // private static String answer
        System.out.printf("%s%8s%s%n", "A", "|   ", "B");

        array[0] = "(A) expand energy, enjoy groups \n (B) conserve energy, enjoy one-on one";
        array[1] = "(A) interpret literally \n (B) look for meaning and possibilities";
        array[2] = "(A) logical, thinking, questioning \n (B)empathetic feeling, accommodating";
        array[3] = "(A) organized, orderly \n (B) flexible, adaptable";
        array[4] = "(A) more outgoing, think out loud \n (B) more reserved, think to yourself";
        array[5] = "(A) practical, realistic, experiential \n (B) imaginative, innovative, theoretical";
        array[6] = "(A) candid, straight forward, frank \n (B) tactful, kind, encouraging";
        array[7] = "(A) plan schedule \n (B) unplanned, spontaneous";
        array[8] = "(A) seek many tasks, public activities, interaction with others  \n (B) seek private, solitary activities with quiet concentrate";
        array[9] = "(A) standard, usual, conventional \n (B) different, novel, unique";
        array[10] = "(A) firm, tend to criticize, hold the line \n (B) gentle, tend to appreciate, conciliate";
        array[11] = "(A) regulated, structured  \n (B) easy going, 'live' and 'let live";
        array[12] = "(A) external, communicative, express yourself \n (B) internal, reticent, keep to yourself";
        array[13] = "(A) focus on here and now \n (B) look to the future, global perspective, 'big picture'";
        array[14] = "(A) tough minded \n (B) tender-hearted, merciful";
        array[15] = "(A) preparation, plan ahead \n (B) go with the flow, adapt as you go";
        array[16] = "(A) active, initiate \n (B) reflective, deliberate";
        array[17] = "(A) facts, things, 'what is' \n (B)ideas, dreams, what could be, philosophical";
        array[18] = "(A) matter of fact, issue-oriented \n (B) sensitive, people oriented, compassionate";
        array[19] = "(A) control, govern \n (B)latitude, freedom";


        for (int count = 0; count < array.length; count++) {
            System.out.println("Enter A or B to answer question " + (count + 1));
            System.out.println(array[count]);
            System.out.println("Kindly choose your right option");
            answer = input.nextLine();
            response[count] = answer;
        }

        System.out.println(Arrays.toString(response));


        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s", " ", "A", "B", " ", "A", "B", " ", "A", "B", " ", "A", "B");

        System.out.println();
        System.out.print("==".repeat(35));
        System.out.println();
        int[][] aaa = new int[4][2];
        for (int counter = 0; counter < response.length; counter++) {
            System.out.printf("%3d%5s%5s", counter + 1, response[counter], "        ");
            if (counter == 3 || counter == 7 || counter == 11 || counter == 15 || counter == 19) {
                System.out.println();
                System.out.print("==".repeat(35));
                System.out.println();

            }
        }
        System.out.println("Total");
        for (int i = 0; i < response.length; i++) {
            if (response[i].equals("A")) {
                ++aaa[i % 4][0];
            } else {
                ++aaa[i % 4][1];

            }

        }
        System.out.println(Arrays.deepToString(aaa));
        for (int i = 0; i < aaa.length ; i++){
            switch(i){
                case 0 -> {
                    if(aaa[i][0] > aaa[i][1]){
                        System.out.println("Extrovert");
                    }else{
                        System.out.println("Introvert");
                    }
                }
                case 1 -> {
                    if(aaa[i][0] > aaa[i][1]){
                        System.out.println("Sensing");
                    }else{
                        System.out.println("intuition");
                    }
                }

                case 2 -> {
                    if(aaa[i][0] > aaa[i][1]){
                        System.out.println("Thinking");
                    }else{
                        System.out.println("feeling");
                    }
                }

                case 3 -> {
                    if(aaa[i][0] > aaa[i][1]){
                        System.out.println("Judging");
                    }else{
                        System.out.println("Perceiving");
                    }
                }
            }
        }



    }
}





