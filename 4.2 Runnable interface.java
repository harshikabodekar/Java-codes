class MyRunnable implements Runnable {
    public void run(){
        System.out.println(" MY THREAD ");
    }
}
public class Main{
    public static void main(String[]args){
        Thread t1=new Thread( new MyRunnable());
        t1.start();
    }
}