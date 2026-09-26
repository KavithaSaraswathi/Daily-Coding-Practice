//Prime number in a range
import java.util.Scanner;
public class day6{
    public static void main(String[] args){
        System.out.print("Enter two numbers to print prime numbers in that range:");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("The prime numbers are:");
        for(int i=a;i<=b;i++){
            boolean isPrime=true;
            if(i<2){
                isPrime=false;
            }
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}