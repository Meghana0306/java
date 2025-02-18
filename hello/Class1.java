package hello;

class In {
    int a1 = 10;
    
    void display() {
        System.out.println("SUM is " + (a1 + a1));
    }
}

public class Class1 { 
    public static void main(String[] args) {
        In ob = new In();
        System.out.println(ob.a1);  
        ob.display();               
    }
}
