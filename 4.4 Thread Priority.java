//priorities of thread 
public class  Priority{
    public static void main(String[]args){
        // minimum priority
        Thread min =new Thread(()->{
            for (int i =1;i<=5;i++){
                System.out.println(" Low Priority Thread :"+i);
            }
        });
        min.setPriority(Thread.MIN_PRIORITY);
        // norm thread 
        Thread norm =new Thread(()->{
            for (int i=1;i<=5;i++){
                System.out.println(" Norm Priority Thread :"+i);
            }
        });
        norm.setPriority(NORM_PRIORITY);
        //maximum priority 
        Thread max=new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("High Priority Thread :"+i);
            }
        });
        max.setPriority(MAX_PRIORITY);
        // start all threads
        min.start();
        norm.start();
        max.start();
    }
}