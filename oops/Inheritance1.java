package oops;
class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}
class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}

public class Inheritance1 {
    public static void main(String[] args) {
        SBI s= new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("Sbi rate of interest: "+s.getRateOfInterest());
        System.out.println("icici rate of interest: "+i.getRateOfInterest());
        System.out.println("axis rate of interest: "+a.getRateOfInterest());

    }
}
