package Assignment;
import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args) {
       // int digit = 0;
        int multiply = 1;
        int reversed = 0;
        int creditNo;
        int total = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of element you want to store");
        creditNo = input.nextInt();
//        if ( creditNo > 16){
//            throw new IllegalArgumentException("number out of bound");
//        }



        int[] array = new int[16];
        System.out.print("enter the element of the array");


        for (int count = 0; count < creditNo; count++) {
            array[count] = input.nextInt();
        }

        System.out.print("array elements are ");
        System.out.println();

        for (int count = 0; count < creditNo; count++) {
            System.out.println(array[count]);


        }


        System.out.println("to print the product of the credit card elements");

        for (int j = 0; j < array.length; j+= 2) {

            multiply = array[j] * 2;

            System.out.println(multiply);

            total = total + multiply;


            while (multiply > 0) {
                int digit = multiply % 10;
                sum = sum + digit;

                multiply = multiply / 10;
            }
        }
                System.out.println(sum);








        System.out.println("this is the total sum" + total);

    }

    }







