import java.util.Scanner;
public class day16{
    static void divide(int a,int b){
        try{
            double c=a/b;
            System.out.println("Result:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Division operation completed");
        }
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter numerator:");
        int a=scan.nextInt();
        System.out.print("Enter denominator:");
        int b=scan.nextInt();
        divide(a,b);
    }
}