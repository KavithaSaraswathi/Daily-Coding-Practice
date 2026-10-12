import java.util.Scanner;
public class day17 {
    static void validAge(int age) throws IllegalArgumentException{
        if(age<18){
            throw new IllegalArgumentException("Must be 18 or above");
        }
        else{
            System.out.println("Registration Successful");
        }
    }
    public static void main(String[] args) {
        // Your Code goes here!
        Scanner scan=new Scanner(System.in);
        System.out.print("Input: ");
        int age=scan.nextInt();
        try{
            validAge(age);
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}