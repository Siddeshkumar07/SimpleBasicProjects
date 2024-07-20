import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Value of PrincipalAmount is ");
            int PrincipalAmount=Sc.nextInt();

            System.out.println("Value of RateOfInterest is ");
            int RateOfInterest=Sc.nextInt();

            System.out.println("Value of TimePeriod is ");
            int TimePeriod=Sc.nextInt();

            int SimpleInterest = (PrincipalAmount*RateOfInterest*TimePeriod)/100;
            System.out.println("SimpleInterest is "+SimpleInterest);
        }

    }
}
