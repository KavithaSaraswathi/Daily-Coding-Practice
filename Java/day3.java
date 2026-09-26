//Armstrong Number
import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scan.nextInt();
        int temp=a;
        int b;
        int sum=0;
        int count=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        temp=a;
        while(temp!=0){
            b=temp%10;
            sum+=Math.pow(b,count);
            temp/=10;
        }
        if(sum==a){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}