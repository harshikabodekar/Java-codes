// create two thread 
public class EvenOdd{
    public static void main(String[]args){
        // creating even thread 
        Thread even = new Thread(()->{
            for (int i =2;i<=100;i+=2){
                System.out.println(" Even : "+i);
            }
            try{
                Thread.sleep(100);
            }
            catch(InterruptedExceptin e){
                Thread.currentThread().interrupt();

            }
        });
        // creating odd thread 
        Thread odd =new Thread(()->{
            for (int i =1;i<=100;i+=2){
                System.out.println("Odd :"+i);
            }
            try{
                Thread.sleep(100);
            }
            catch(InterrupedException e ){
                Thread.currentThread().interrupt();
            }
            
        });
        // starting both threads 
        even.start();
        odd.start();
    }
}