import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2=sc.nextInt();
        int sum;
        sum=num1+num2;
        System.out.println("Sum of two number is: " + sum);
    }
}
