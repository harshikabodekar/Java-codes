// greeting interface 
interface Greeting {
    void sayHello();
}
class Person { // outher class
class Friendly implements Greeting{ // inner class
@Override
public void sayHello() {
    System.out.println("Hello there !!");
}
}
}
//main class 
public class Main{
    public static void main(String[]args){
        Person p = new Person();
        Person.Friendly f = p.new Friendly();
        f.sayHello();
    }
}
