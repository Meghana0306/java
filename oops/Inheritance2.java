
class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank{
    float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank{
    float getRateOfInterest(){return 6.7f;}
}

public class Inheritance2 {
    public static void main(String[] args) {
        Bank b;
        b= new SBI();
        System.out.println("Sbi rate of interest: "+b.getRateOfInterest());
       b = new ICICI();
        System.out.println("icici rate of interest: "+b.getRateOfInterest());
        b = new AXIS();
        System.out.println("axis rate of interest: "+b.getRateOfInterest());

    }
}
