import java.util.Scanner;

public class M2A2ProgrammingExercise0631 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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


    public static int getDigit(int number) {

        if (number < 10) {
            return number;
        }

        else {
            return number / 10 + number % 10;
        }
    }


    public static int sumOfOddPlace(long number) {

        int sum = 0;

        while (number > 0) {

            int digit = (int)(number % 10);

            sum = sum + digit;

            number = number / 100;
        }

        return sum;
    }


    public static boolean prefixMatched(long number, int d) {

        return getPrefix(number, getSize(d)) == d;
    }


    public static int getSize(long d) {

        int count = 0;

        while (d > 0) {

            count++;

            d = d / 10;
        }

        return count;
    }


    public static long getPrefix(long number, int k) {

        if (getSize(number) <= k) {
            return number;
        }

        return number / (long)(Math.pow(10, getSize(number) - k));
    }




}