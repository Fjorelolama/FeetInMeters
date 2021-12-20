import java.util.Scanner;

public class FeetIntoMeters {
    public static void main(String[] args) {
        final double Meter_per_feet = 0.305;
        double Feet;
        Scanner userInput = new Scanner(System.in);


        System.out.println("Enter the value of feet: ");
        Feet = userInput.nextDouble();


        double meters = Feet * Meter_per_feet;

        System.out.println(Feet + "Feet is " + meters + "Meters");

    }
}