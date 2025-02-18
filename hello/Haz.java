package hello;

public class Haz {
   
    Haz(){
System.out.println("learn java");
    }
    Haz(int a){
        this();  // if this is not here  "learn java" will not be printed in the output.
        System.out.println(a);
    }
    public static void main(String[] args) {
        Haz r = new Haz(100);
    }
}
