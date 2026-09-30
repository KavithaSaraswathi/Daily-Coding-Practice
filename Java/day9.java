//Moving zeros to left
import java.util.Scanner;
public class day9{
    static void moveZeroes(int[] a){
        int j=0;
        for(int i=1;i<a.length;i++){
            if(a[j]==0){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=scan.nextInt();
        int []arr=new int[size];
        System.out.println("Enter "+size+" elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        moveZeroes(arr);
        System.out.println("Array after moving all zeroes");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}