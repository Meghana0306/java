package oops;

interface Printable1{
static void display1(){
    System.out.println("hello");
}
}
interface Printable2{
    void display2();
}

class Inta2 implements Printable1, Printable2{
    public void display2(){
        System.out.println("hii");
    }
    public static void main(String[] args) {
        Printable1 b1 = new Inta2();
        Printable2 b2 = new Inta2();
        b1.display1();
        b2.display2();
    }
}



