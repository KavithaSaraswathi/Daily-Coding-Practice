import java.util.Scanner;
class Product{
    String name;
    double price;
    int discount;
    Product(String name, double price){
        this.name=name;
        this.price=price;
    }
    void calculateFinalPrice(){
        if(price>=5000){
            this.discount=10;

        }
        else{
            this.discount=5;
            
        }
        double disAmount=price*(discount/100.0);
        double finalAmount=price-disAmount;
        System.out.println("Product: "+name);
        System.out.println("Original Prize: "+price);
        System.out.println("Discount: "+discount+"%");
        System.out.println("Final Prize: "+finalAmount);
    }
}

public class day21{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Product: ");
        String name=scan.next();
        System.out.print("Prize :");
        double prize=scan.nextDouble();
        Product prod=new Product(name,prize);
        prod.calculateFinalPrice();
    }
}