//Maximum subarray sum (Kadane's Algorithm)
import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size=scan.nextInt();
        System.out.print("Enter elements of the array:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int maxSum=arr[0];
        int currentSum=arr[0];
        for(int i:arr){
            currentSum+=i;
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println(maxSum);
    }
}