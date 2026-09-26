//Electricity Bill Calculator
import java.util.Scanner;
public class day2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of electricity units");
        int unit=scan.nextInt();
        int rate;
        if(unit<=100){
            rate=100*2;
        }
        else if (unit>100 && unit<=200){
            int a=unit-100;
            rate=(100*2)+(a*3);
        }
        else{
            int a=unit-200;
            rate=(100*2)+(100*3)+(a*5);
        }
        System.out.println("The Electricity bill is "+rate);
    }
}