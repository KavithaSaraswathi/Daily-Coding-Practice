class NumberPrinter extends Thread{
    String name;
    NumberPrinter(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(name+":"+i);
        }
    }
}
public class day18{
    public static void main(String[] args){
        NumberPrinter thread1=new NumberPrinter("Thread 1");
        NumberPrinter thread2=new NumberPrinter("Thread 2");
        thread1.start();
        thread2.start();
    }
}