import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Temperature in Celsius ");
        double Celsius=sc.nextDouble();

        double Farenheit= ((9.0/5.0)*Celsius) + 32;
        System.out.println("Converted temperature is "+Farenheit);
    }
}
