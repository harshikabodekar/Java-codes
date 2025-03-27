// packages calculator
package mypackage;
class Calculator{
    public int add( int a, int b ){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        if (b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}
// main class 
public class Main{
    public static void main(String[]args){
        mypackage.Calculator c =new mypackage.Calculator();
        int a=10,b=5;
        System.out.println (" Addition  :"+ c.add(a,b));
        System.out.println (" Subtraction  :"+ c.sub(a,b)); 
        System.out.println (" Multiplication  :"+ c.mul(a,b));
        System.out.println (" Division  :"+ c.div(a,b));
    }
}