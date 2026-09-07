import java.util.Scanner;

public class M2A2ProgrammingExercise0631 {

    public static void main(String[] args) {


        // creating scaner object for user input
        Scanner input = new Scanner(System.in); 

        //asking user to enter a credit card number
        System.out.print("Enter a credit card number as a long integer: ");

        long number = input.nextLong();

        if (isValid(number)) {
            System.out.println(number + " is valid");
        }

        else {
            System.out.println(number + " is invalid");
        }

        input.close();
    }


    //checking the card length, prefix, and luhn calculations
    public static boolean isValid(long number) {

        return (getSize(number) >= 13 &&
                getSize(number) <= 16 &&
                (prefixMatched(number, 4) ||
                 prefixMatched(number, 5) ||
                 prefixMatched(number, 37) ||
                 prefixMatched(number, 6)) &&
                (sumOfDoubleEvenPlace(number) +
                 sumOfOddPlace(number)) % 10 == 0);
    }


    //doubling every second digit from right to left and adding the result
    public static int sumOfDoubleEvenPlace(long number) {

        int sum = 0;

        number = number / 10;

        while (number > 0) {

            int digit = (int)(number % 10);

            sum = sum + getDigit(digit * 2);

            number = number / 100;
        }

        return sum;
    }


    // returning digit if its less than 10 otherwise adding 2 digits
    public static int getDigit(int number) {

        if (number < 10) {
            return number;
        }

        else {
            return number / 10 + number % 10;
        }
    }


    // adding digits in odd numbered positions
    public static int sumOfOddPlace(long number) {

        int sum = 0;

        while (number > 0) {

            int digit = (int)(number % 10);

            sum = sum + digit;

            number = number / 100;
        }

        return sum;
    }



    //checking if the credit card number starts with the given prefix
    public static boolean prefixMatched(long number, int d) {

        return getPrefix(number, getSize(d)) == d;
    }



    //returning the number of digits in a number
    public static int getSize(long d) {

        int count = 0;

        while (d > 0) {

            count++;

            d = d / 10;
        }

        return count;
    }


    // returning the first k digits of the number
    public static long getPrefix(long number, int k) {

        if (getSize(number) <= k) {
            return number;
        }

        return number / (long)(Math.pow(10, getSize(number) - k));
    }




}