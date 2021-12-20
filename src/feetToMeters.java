import java.util.Scanner;

public class feetToMeters {
    public static void main (String [] args) {
        final double meter = 0.305;
        double feet;

        Scanner input = new Scanner (System.in);

        System.out.println ("Enter a value for feet: ");
        double value = input.nextDouble();

        feet = meter * value;
        System.out.println (value + " feet is " + " meters " + feet);
    }
}
