//vehicle polymorphism using interface 
interface Vehicle{
    void startEngine();
    void stopEngine();
}
class Car implements Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Car engine started");
    }
    @Override
    public void stopEngine(){
        System.out.println("Car engine stopped");
    }
}
class Bike implements Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Bike engine started");
    }
    @Override
    public void stopEngine(){
        System.out.println("Bike engine stopped");
    }
}
//main class
public class Main{
    public static void main(String[]args){
        Vehicle c= new Car();
        Vehicle b= new Bike();
        c.startEngine();
        c.stopEngine();
        b.startEngine();
        b.stopEngine();
    }
}