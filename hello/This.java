package hello;

class Aba{
    void val(){
        System.out.println("hello");
    }
    void show(){
       this.val();  // this.val clled by the compiler even though we dont use this it will still take it as this.val
        System.out.println("java");
    }
}

public class This {
    public static void main(String[] args) {
        Aba a = new Aba();
        a.show();
    }
}
