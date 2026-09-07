import java.util.Scanner;

public class M1A3ProgrammingExercise0829 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");

        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[row].length; column++) {
                m1[row][column] = input.nextInt();
            }
        }

        System.out.print("Enter m2 (a 3 by 3 matrix) row by row: ");

        for (int row = 0; row < m2.length; row++) {
            for (int column = 0; column < m2[row].length; column++) {
                m2[row][column] = input.nextInt();
            }
        }

        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        }
        else {
            System.out.println("The two arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {

        for (int row = 0; row < m1.length; row++) {

            for (int column = 0; column < m1[row].length; column++) {

                if (m1[row][column] != m2[row][column]) {
                    return false;
                }
            }
        }

        return true;
    }



    
}