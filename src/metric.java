import java.util.Scanner;

public class metric {
    public static void main(String[] args) {

        double meter;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the measurement in meters: ");

        if(in.hasNextDouble()){
            meter = in.nextDouble();
            in.nextLine();

            double mile = meter / 1609.344;
            double inch = meter / 0.0254;
            double feet = meter / 0.3048;

            System.out.printf("The measurement in miles is %.4f%n", mile);
            System.out.printf("The measurement in inches is %.2f%n", inch);
            System.out.printf("The measurement in feet is %.2f", feet);
            System.exit(0);
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid measurement value: " + trash);
            System.exit(0);
        }
    }
}
