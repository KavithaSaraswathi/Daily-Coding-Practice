import java.util.Scanner;
class Student{
    String name;
    int mark1;
    int mark2;
    int mark3;
    double avg;
    Student(String name,int mark1,int mark2,int mark3){
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    double calculateAverage(){
        avg=(mark1+mark2+mark3)/3;
        return avg;
    }
    void displayResult(){
        avg=calculateAverage();

        char grade;
        if(avg>=90){
            grade='A';
        }
        else if(avg>=75){
            grade='B';
        }
        else if(avg>=60){
            grade='C';
        }
        else{
            grade='D';
        }
        System.out.println("Student Name: "+name);
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);
    }
    
}

public class day13{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Name:");
        String name=scan.nextLine();
        System.out.print("Mark 1:");
        int mark1=scan.nextInt();
        System.out.print("Mark 2:");
        int mark2=scan.nextInt();
        System.out.print("Mark 3:");
        int mark3=scan.nextInt();
        Student stu=new Student(name,mark1,mark2,mark3);
        stu.displayResult();
    }
}