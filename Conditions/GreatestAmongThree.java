import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three Numbers: ");
        int a = input.nextInt();
        int b= input.nextInt();
        int c= input.nextByte();
        if(a>b && a>c){
            System.out.println(a+" is a Greatest NUmber");
        }
        else if(b>a && b>c){
            System.out.println(b+" is a Greatest Number");
        }else{
            System.out.println(c+" is a Greatest Number");
        }

    }
}
