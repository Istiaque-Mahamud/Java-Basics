import java.util.Scanner;

public class AvgOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        double avg =(double)sum/3.0;
        System.out.println("Average: "+avg);

    }
}
