// Animal interface
interface Animal{
    void makeSound();
}
interface Pet extends Animal{
    void play();
}
class Dog implements Pet{
    @Override
    public void makeSound(){
        System.out.println(" Dogs : Bhaw Bhaw");
        System.out.println(" Cats : meow meow ");
        System.out.println(" -----------------------------");
    }
    public void play(){
        System.out.println(" Dogs are playing fetch game ");
        System.out.println(" Cats are playing with ball ");
    }
}
// main class
public class Main{
    public static void main(String[]args){
        // use pet interface reference
        Pet p=new Dog();
        p.makeSound();
        p.play();

    }
}