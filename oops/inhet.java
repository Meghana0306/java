package oops;
class Animal{
void display(){
    System.out.println("eat");
}
}
class Babydog extends Animal{
    void display1(){
        System.out.println("Weep");
    }
    }
class Dog extends Babydog{
void display2(){
    System.out.println("Bark");

}
}

public class inhet {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.display();
        obj.display1();
        obj.display2();
        

    }
    
}
