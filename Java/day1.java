public class day1{
    public static void main(String[] args){
        int[] arr={3,6,4,7,9,6};
        int count=0;
        for(int i:arr){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}