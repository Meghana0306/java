package hello;

public class Ex1 {
    int value;
    {
        System.out.println("Initializer block executed");
        value = 100;
    }
    {
        System.out.println("Initializer block 2 executed");
    }
    Ex1(){
        System.out.println("Default Constructor executed, Value: "+value);
    }
    Ex1(int val){
        //int value1 = val+value;
        System.out.println("Parameterized Constructor executed, value: "+(val+value));
    }
    public static void main(String[] args) {
        Ex1 obj1 = new Ex1();
        Ex1 obj2 = new Ex1(200);
    }
}
