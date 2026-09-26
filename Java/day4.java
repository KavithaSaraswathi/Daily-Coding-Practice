import java.util.Scanner;
class day4{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=scan.nextInt();
        int reverse=0;
        int temp=a;
        int count=0;
        while(temp!=0){
            temp/=10;
            count++;

        }
        temp=a;
        int digit;
        while(temp!=0){
            digit=temp%10;
            reverse +=(digit*(Math.pow(10,count-1)));          //reverse= reverse*10 +digit
            count--;
            temp/=10;
        }
        System.out.println("Thr reversed number is "+reverse);
    }
}