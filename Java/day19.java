class Demo{
    synchronized void display(String name){
        System.out.println(name+" entered");
        for(int i=1;i<=3;i++){
            System.out.println(name+" "+i);
        }
        System.out.println(name+" exists");
    }
}

class MyThread extends Thread{
    Demo obj;
    String name;
    MyThread(Demo obj,String name){
        this.obj=obj;
        this.name=name;
    }
    public void run(){
        obj.display(name);
    }
}

class day19{
    public static void main(String[] args){
        Demo obj=new Demo();
        MyThread t1=new MyThread(obj,"Kavi");
        MyThread t2=new MyThread(obj,"Mohith");
        t1.start();
        t2.start();
    }
}