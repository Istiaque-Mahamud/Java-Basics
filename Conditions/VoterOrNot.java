import java.util.Scanner;

public class VoterOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int Age= sc.nextInt();
        if(Age>17){
            System.out.println("Voter");
        }else{
            System.out.println("Not Voter");
        }
    }
}
