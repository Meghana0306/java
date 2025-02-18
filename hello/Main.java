// You are using Java
package hello;

class Nc {
    int a1 = 10;
    
    void display() {
        System.out.println("SUM is " + (a1 + a1));
    }
}

public class Main { 
    public static void main(String[] args) {
        Nc ob = new Nc();
        System.out.println(ob.a1);  
        ob.display();               
    }
}
