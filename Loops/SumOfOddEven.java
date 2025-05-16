import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        int OddSum=0;
        int EvenSum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                EvenSum+=i;
            }
            if(i%2!=0){
                OddSum+=i;
            }

        }
        System.out.println("Even Sum: "+EvenSum);
        System.out.println("Odd Sum: "+OddSum);
    }
}
