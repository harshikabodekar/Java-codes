import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer{
    public static void main(String[]args){
        BlockingQueue<Integer> buffer=new LinkedBlockingQueue<>(5);
    // creating producer thread 
    Thread producer =new Thread(()->{
        try{
            for (int i=1;i<=10;i++){
                buffer.put(i); // adding item into buffer
                System.out.println("Produced : "+i);
                Thread.sleep(100); // sleep for 100ms
            }
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        
    });
    // creating consumer block 
    Thread consumer=new Thread (()->{
        try{
             while(true){// instead of this we can also use above for loop condition
                int item=buffer.take(); // removing item from buffer
                System.out.println("Consumed : "+item);
                Thread.sleep(100); // sleep for 100ms
             }
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    });
    // starting producer and consumer threads
    producer.start();
    consumer.start();
    }
}