import java.util.Scanner;
class day5{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=scan.nextInt();
        int temp=a;
        int reverse=0;
        int b;
        while(temp!=0){
            b=temp%10;
            reverse=(reverse*10)+b;
            temp/=10;
        }
        if(reverse==a){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
    }
}