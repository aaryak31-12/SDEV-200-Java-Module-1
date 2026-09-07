public class A1ProgrammingExercise0609 {
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }   

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
    public static void main(String [] args) {
        double meter = 20.0;
        System.out.println("Feet\tMeters\t\tMeters\tFeet");
        System.out.println("----------------------------------");

        for (double foot = 1.0;foot <= 10.0;foot++){
            System.out.printf("%.1f\t%.3f\t\t%.1f\t%.3f%n", foot, footToMeter(foot), meter, meterToFoot(meter));
        meter += 5.0;
        }
            
    }
}