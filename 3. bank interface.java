//Bank interface
interface Bank{
    double getInterestRate();
}
//created classes
class SBI implements Bank{
    @Override
    public double getInterestRate(){
        return 8.5;
    }
}
class HDFC implements Bank{
    @Override
    public double getInterestRate(){
        return 6.6;
    }
}
//main class
public class Main{
    public static void main(String[]args){
        Bank sbi =new SBI();
        System.out.println (" SBI Bank intrest rate : " + sbi.getInterestRate() + "%");
        Bank hdfc = new HDFC();
        System.out.println("HDFC Bank Intrest Rate : "+hdfc.getInterestRate() +"%");
    }
}