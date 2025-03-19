package oops;
abstract class Base{
    void m1(){}
    abstract void m2();
    Base(){
        System.out.println("constructor called");

    }
}
public class abstract1 extends Base {
    abstract1(){
        System.out.println("main constructor called");
    }
    void m2(){
        System.out.println("abstract is called");
    }
    public static void main(String[] args) {
        Base ob = new abstract1();
        ob.m2();
    }
    
}
