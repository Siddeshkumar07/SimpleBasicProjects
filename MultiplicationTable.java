import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Multiplication Number: ");
        int number=sc.nextInt();
       

        System.out.println("The Multiplication Table for "+number+ " is");

        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+number+"="+(number*i));
        }
    }
}
