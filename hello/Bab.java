package hello;
class A{
    int a;
    String name;
     A(){
        a=23;
        name = "ASDF";
    }
    void show(){
        System.err.println(a+" "+name);
    }
}
public class Bab {
    public static void main(String[] args) {
        A ref = new A();
        ref.show();
    }
}
