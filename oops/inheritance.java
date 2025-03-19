package oops;
class Vehicle{
    int maxSpeed  =120;

}
class Car extends Vehicle{
    int maxSpeed = 100;
    void dispaly(){
        System.out.println("Maximum Speed: "+super.maxSpeed);
    }
}
public class inheritance {
    
    public static void main(String[] args) {
        Car small = new Car();
        small.dispaly();
    }
}
