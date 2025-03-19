
package oops; 
interface Printable{
    void display();
}
interface Printable2{
    void display1();
}
interface Printable3{
    void display2();
}
class Inta implements Printable, Printable2,Printable3{
    public void display(){
        System.out.println("hello");
    }
    public void display1(){
        System.out.println("Second hello");
    }
    public void display2(){
        System.out.println("Third  hello");
    }
    public static void main(String[] args) {
        Printable b = new Inta();
        Printable2 c = new Inta();
        Printable3 d = new Inta();
        b.display();
        c.display1();
        d.display2();
    }
}

