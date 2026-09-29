import java.util.Scanner;
public class day8{
    static int secondLargestDigit(int a){
        int temp=a;
        int max=-1;
        int sec_max=-1;
        while(temp!=0){
            int b=temp%10;
            if(b>max){
                int t=max;
                max=b;
                sec_max=t;
            }
            if(b!=max && b>sec_max){
                sec_max=b;
            }
            temp/=10;
        }
        return sec_max;
    }
    
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int c=scan.nextInt();
        System.out.println("The largest second digit is "+secondLargestDigit(c));
    }
    
}