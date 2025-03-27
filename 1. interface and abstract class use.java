// interface and abstract class use
interface Animal{ // created interface
    void sound(); // added abstract methods sound and eat
    void eat();
}
//created abstract class dog which implements Animal interface
abstract class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks ");
    }
    public abstract void breed(); // created  additional abstract method breed
}
// created  non abstract class Labrador which extends abstract class Dog
class Labrador  extends Dog{
    public void breed(){
        System.out.println(" Breed of Dog is : Labrador ");
    }
    public void eat(){
        System.out.println(" Dog eats meat and pedigree");
    }
}
public class Main{
    public static void main(String[] args){
        Animal a= new Labrador(); // created object of Labrador class and assigned it to Animal interface
        a.sound(); // called sound method of Animal interface
        a.eat(); // called eat method of Animal interface
        Labrador l= new Labrador(); // created object of Labrador class
        l.breed(); // called breed method of Labrador class
    }
}
