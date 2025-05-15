import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Year= sc.nextInt();

        boolean x=(Year%4)==0;
        boolean y=(Year%100)!=0;
        boolean z=(Year%100==0)&&(Year%400==0);
        if((x&&(y||z))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }


    }
}
