package hello;

class Bb{
    int x, y;
    Bb(int a,int b){
        x =a; y=b;
    }
    Bb(int a, String b){
        System.out.println(a+" "+b);
    }
    void show(){
        System.out.println(x+" "+y);
    }
}
public class Methods {
    public static void main(String[] args) {
        Bb r = new Bb(100,200);
        r.show();
        Bb ref = new Bb(10," rahul");
    }
}
