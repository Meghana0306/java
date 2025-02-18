package hello;

public class Hab {
    Hab(){
        this(10);
        
    }
    Hab(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Hab r = new Hab();
    }
}
