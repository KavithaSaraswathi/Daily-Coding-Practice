//To print count of even digit
import java.util.Scanner;
public class day7{
    static int countEvendigit(int a){
        int temp=a;
        int count=0;
        while(temp!=0){
            int b=temp%10;
            if(b%2==0){
                count++;
            }
            temp/=10;
        }
        return count;
    }
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x=scan.nextInt();
        System.out.println("The count of even digit is "+countEvendigit(x));
    }
}