public class A1ProgrammingExercise0609 {
    // this converts feet into meter
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }   
    // this converts meter into feet
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
    public static void main(String [] args) {
        double meter = 20.0;

        // printing table heading
        System.out.println("Feet\tMeters\t\tMeters\tFeet");
        System.out.println("----------------------------------");

        //looping through feet values from 1 to 10
        for (double foot = 1.0;foot <= 10.0;foot++){

            // printing the converted values
            System.out.printf("%.1f\t%.3f\t\t%.1f\t%.3f%n", foot, footToMeter(foot), meter, meterToFoot(meter));


        meter += 5.0;  // increasing meter value by 5 for the next row
        }
            
    }
}