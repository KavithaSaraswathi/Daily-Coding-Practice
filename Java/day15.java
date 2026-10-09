import java.util.Scanner;
class Employee{
    String name;
    double baseSalary;
    Employee(String name,double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }
    double calculateSalary(){
        return baseSalary;
    }
    void displayDetail(){
        System.out.println("Employee Name:"+name);
        System.out.println("Total Salary:"+calculateSalary());
    }

}

class Developer extends Employee{
    double bonus;
    Developer(String name,double baseSalary,double bonus){
        super(name,baseSalary);
        this.bonus=bonus;
    }
    @Override
    double calculateSalary(){
        return bonus+baseSalary;
    }
}
public class day15{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Name:");
        String name=scan.nextLine();
        System.out.print("Base Salary:");
        double sal=scan.nextDouble();
        System.out.println("Bonus:");
        double bonus=scan.nextDouble();
        Employee dev=new Developer(name,sal,bonus);
        dev.displayDetail();
    }
}
