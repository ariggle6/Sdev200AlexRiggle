public class ProgrammingAssignment1 {

    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("--------------------------------------");

        double minFeet = 1.0;
        double maxFeet = 10.0;
        double step = 1.0;

        for (double feet = minFeet; feet <= maxFeet; feet += step) {
            double meters = footToMeter(feet);

            double rightMeters = 15.0 + feet * 5;
            double rightFeet = meterToFoot(rightMeters);

            System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f%n", feet, meters, rightMeters, rightFeet);
        }
    }

    public static double footToMeter(double foot) {
        return foot * 0.305;
    }

    public static double meterToFoot(double meter) {
        return meter * 3.279;
    }
}
