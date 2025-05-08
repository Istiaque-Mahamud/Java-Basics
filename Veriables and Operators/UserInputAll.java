import java.util.Scanner;

public class UserInputAll {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum:"+sum);
        int sub=a-b;
        System.out.println("Substraction:"+sub);
        int div=a/b;
        System.out.println("Division:"+div);
        int mul=a*b;
        System.out.println("Multiplication:"+mul);
        int mod=a%b;
        System.out.println("Modulus:"+mod);
        
    }
}
