//Two sum with two pointer
import java.util.*;
public class day10 {
    static void twoSum(int[] a, int target){
        int left=0;
        int right=a.length-1;
        int flag=1;
    
        while(left<right){
            if(a[left]+a[right]==target){
                int[] b={left,right};
                System.out.println(Arrays.toString(b));
                flag=0;
                break;
            }
            else if(a[left]+a[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        if(flag==1){
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {
        // Your Code goes here!
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter target : ");
        int target=scan.nextInt();
        twoSum(arr,target);
    }
}