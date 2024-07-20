import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Mark Scored in Maths is ");
            double Maths=sc.nextDouble();

            System.out.println("Mark Scored in Science is ");
            double Science=sc.nextDouble();

            System.out.println("Mark Scored in Social is ");
            double Social=sc.nextDouble();

            System.out.println("Mark Scored in Tamil is ");
            double Tamil=sc.nextDouble();

            System.out.println("Mark Scored in English is ");
            double English=sc.nextDouble();
        
            Double TotalScore= Maths+Science+Social+Tamil+English;
            System.out.println("Total Score is "+ TotalScore);

            Double AverageScore=TotalScore/5;
            System.out.println("Average Score is "+AverageScore);

            if(AverageScore>=90){
                System.out.println("Grade is A");
            }else if (AverageScore<=90 && AverageScore>=75){ 
                System.out.println("Grade is B");
            }else if (AverageScore<=75 && AverageScore>=60){ 
                System.out.println("Grade is C");
            }else{
                System.out.println("Grade is D");
            }
            
        }

    }
}
