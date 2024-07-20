import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Value of a is ");
            int a=sc.nextInt();
            

            System.out.println("Value of b is ");
            int b=sc.nextInt();
            

            System.out.println("Enter the Operation:+,-,*,/ ");
            int c=sc.next().charAt(0);
            
            switch (c) {
                case '+':
                    c=a+b;
                    break;

                case '-':
                    c=a-b;
                    break;

                case '*':
                    c=a*b;
                    break;

                case '/':
                   if(b!=0){
                    c=a/b;
                   }else{
                    System.out.println("Cannot do this operation as denominator cannot be zero");
                   }
                    break;
                    
                default:
                    break;
            }

            System.out.println(c);
        }
    }
    
}
